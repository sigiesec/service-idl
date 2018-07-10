/*********************************************************************
 * \author see AUTHORS file
 * \copyright 2015-2018 BTC Business Technology Consulting AG and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 **********************************************************************/
package com.btc.serviceidl.generator.cpp

import com.btc.serviceidl.generator.common.ArtifactNature
import com.btc.serviceidl.generator.common.GeneratorUtil
import com.btc.serviceidl.generator.common.Names
import com.btc.serviceidl.generator.common.ParameterBundle
import com.btc.serviceidl.generator.common.ProjectType
import com.btc.serviceidl.generator.common.ProtobufType
import com.btc.serviceidl.generator.common.ResolvedName
import com.btc.serviceidl.generator.common.TransformType
import com.btc.serviceidl.idl.AbstractContainerDeclaration
import com.btc.serviceidl.idl.AbstractType
import com.btc.serviceidl.idl.FunctionDeclaration
import com.btc.serviceidl.idl.InterfaceDeclaration
import com.btc.serviceidl.idl.MemberElement
import com.btc.serviceidl.idl.PrimitiveType
import com.btc.serviceidl.util.Constants
import com.google.common.base.CaseFormat
import java.util.Optional
import org.eclipse.emf.ecore.EObject

import static extension com.btc.serviceidl.generator.common.GeneratorUtil.*
import static extension com.btc.serviceidl.util.Util.*

class ProtobufUtil
{
    static def ResolvedName resolveProtobuf(extension TypeResolver typeResolver, EObject object,
        ProtobufType protobuf_type)
    {
        if (object.isUUIDType)
            return new ResolvedName(resolveSymbol("std::string"), TransformType.NAMESPACE)
        else if (object.isInt16 || object.isByte || object.isChar)
            return new ResolvedName("::google::protobuf::int32", TransformType.NAMESPACE)
        else if (object instanceof PrimitiveType)
            return new ResolvedName(getPrimitiveTypeName(object), TransformType.NAMESPACE)
        else if (object instanceof AbstractType && (object as AbstractType).primitiveType !== null)
            return resolveProtobuf(typeResolver, (object as AbstractType).primitiveType, protobuf_type)

        val scope_determinant = object.scopeDeterminant

        val paramBundle = ParameterBundle.createBuilder(scope_determinant.moduleStack).with(ProjectType.PROTOBUF).build

        // TODO this is cloned by java.ProtobufUtil(.getLocalName?) 
        val result = GeneratorUtil.getTransformedModuleName(paramBundle, ArtifactNature.CPP, TransformType.NAMESPACE) +
            Constants.SEPARATOR_NAMESPACE + if (object instanceof InterfaceDeclaration)
                Names.plain(object) + protobuf_type.getName
            else if (object instanceof FunctionDeclaration)
                Names.plain(scope_determinant) + "_" + protobuf_type.getName + "_" + Names.plain(object) +
                    protobuf_type.getName
            else
                Names.plain(object)

        addTargetInclude(typeResolver.moduleStructureStrategy.getIncludeFilePath(
            scope_determinant.moduleStack,
            ProjectType.PROTOBUF,
            GeneratorUtil.getPbFileName(object),
            HeaderType.PROTOBUF_HEADER
        ))

        object.resolveProjectFilePath(ProjectType.PROTOBUF)
        return new ResolvedName(result, TransformType.NAMESPACE)
    }

    static def String resolveDecode(extension TypeResolver typeResolver, ParameterBundle paramBundle, EObject element,
        AbstractContainerDeclaration container)
    {
        resolveDecode(typeResolver, paramBundle, element, container, true)
    }

    static def String resolveDecode(extension TypeResolver typeResolver, ParameterBundle paramBundle, EObject element,
        AbstractContainerDeclaration container, boolean use_codec_ns)
    {
        // handle sequence first, because it may include UUIDs and other types from below
        if (element.isSequenceType)
        {
            val is_failable = element.isFailable
            val ultimate_type = element.ultimateType

            // TODO remove ProtobufType argument
            var protobuf_type = typeResolver.resolveProtobuf(ultimate_type, ProtobufType.REQUEST).fullyQualifiedName
            if (is_failable)
                protobuf_type = typeResolver.resolveFailableProtobufType(element, container)
            else if (ultimate_type.isByte || ultimate_type.isInt16 || ultimate_type.isChar)
                protobuf_type = "google::protobuf::int32"

            val isUUIDType = ultimate_type.isUUIDType
            val decodeMethodName = (if (is_failable)
                "DecodeFailable"
            else if (isUUIDType) "DecodeUUID" else "Decode") + if (element.eContainer instanceof MemberElement)
                "ToVector"
            else
                ""

            return '''«IF use_codec_ns»«typeResolver.resolveCodecNS(paramBundle, ultimate_type, is_failable, Optional.of(container))»::«ENDIF»«decodeMethodName»«IF is_failable || !isUUIDType»< «protobuf_type», «resolve(ultimate_type)» >«ENDIF»'''
        }

        if (element.isUUIDType)
            return '''«typeResolver.resolveCodecNS(paramBundle, element)»::DecodeUUID'''

        if (element.isByte)
            return '''static_cast<«resolveSymbol("int8_t")»>'''

        if (element.isInt16)
            return '''static_cast<«resolveSymbol("int16_t")»>'''

        if (element.isChar)
            return '''static_cast<char>'''

        return '''«typeResolver.resolveCodecNS(paramBundle, element)»::Decode'''
    }

    static def String resolveCodecNS(TypeResolver typeResolver, ParameterBundle paramBundle, EObject object)
    {
        resolveCodecNS(typeResolver, paramBundle, object, false, Optional.empty)
    }

    static def String resolveCodecNS(extension TypeResolver typeResolver, ParameterBundle paramBundle, EObject object,
        boolean is_failable, Optional<EObject> container)
    {
        val ultimate_type = object.ultimateType

        // failable wrappers always local!
        val moduleStack = if (is_failable) paramBundle.moduleStack else ultimate_type.moduleStack

        val codec_name = GeneratorUtil.getCodecName(if (is_failable) container.get else ultimate_type)

        addTargetInclude(
            typeResolver.moduleStructureStrategy.getIncludeFilePath(moduleStack, ProjectType.PROTOBUF, codec_name,
                HeaderType.REGULAR_HEADER))

        resolveProjectFilePath(ultimate_type, ProjectType.PROTOBUF)

        GeneratorUtil.getTransformedModuleName(
            new ParameterBundle.Builder().with(moduleStack).with(ProjectType.PROTOBUF).build, ArtifactNature.CPP,
            TransformType.NAMESPACE) + TransformType.NAMESPACE.separator + codec_name
    }

    static def String resolveFailableProtobufType(extension TypeResolver typeResolver, EObject element,
        AbstractContainerDeclaration container)
    {
        // TODO isn't there a specific type that is used from that library? Is it really required?
        // explicitly include some essential dependencies
        typeResolver.addLibraryDependency(new ExternalDependency("BTC.CAB.ServiceComm.Default"))

        return GeneratorUtil.getTransformedModuleName(
            ParameterBundle.createBuilder(container.scopeDeterminant.moduleStack).with(ProjectType.PROTOBUF).build,
            ArtifactNature.CPP,
            TransformType.NAMESPACE
        ) + Constants.SEPARATOR_NAMESPACE + GeneratorUtil.asFailable(element, container, qualified_name_provider)
    }

    static def asCppProtobufName(String name)
    {
        name.asProtobufName(CaseFormat.LOWER_UNDERSCORE)
    }
}
