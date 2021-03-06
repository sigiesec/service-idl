/**
 * \author see AUTHORS file
 * \copyright 2015-2018 BTC Business Technology Consulting AG and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.btc.serviceidl.generator.cpp

import com.btc.serviceidl.generator.common.ArtifactNature
import com.btc.serviceidl.generator.common.GeneratorUtil
import com.btc.serviceidl.generator.common.ProjectType
import com.btc.serviceidl.generator.common.TransformType
import com.btc.serviceidl.idl.IDLSpecification
import com.btc.serviceidl.idl.InterfaceDeclaration
import com.btc.serviceidl.idl.ModuleDeclaration
import com.btc.serviceidl.util.Constants
import java.util.Collection
import java.util.Map
import java.util.Optional
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScopeProvider

import static extension com.btc.serviceidl.generator.common.FileTypeExtensions.*
import static extension com.btc.serviceidl.util.Extensions.*

@Accessors(PROTECTED_GETTER)
class ProtobufProjectGenerator extends ProjectGeneratorBaseBase
{
    new(Resource resource, IFileSystemAccess file_system_access, IQualifiedNameProvider qualified_name_provider,
        IScopeProvider scope_provider, IDLSpecification idl, IProjectSet vsSolution,
        IModuleStructureStrategy moduleStructureStrategy,
        Map<String, Set<IProjectReference>> protobuf_project_references,
        Map<EObject, Collection<EObject>> smart_pointer_map, ModuleDeclaration module)
    {
        super(resource, file_system_access, qualified_name_provider, scope_provider, idl, vsSolution,
            moduleStructureStrategy, protobuf_project_references, smart_pointer_map, ProjectType.PROTOBUF, module)
    }

    def generate()
    {
        // paths
        val include_path = projectPath.append("include")
        val source_path = projectPath.append("source")

        // file names
        var export_header_file_name = (GeneratorUtil.getTransformedModuleName(param_bundle, ArtifactNature.CPP,
            TransformType.EXPORT_HEADER) + "_export".h).toLowerCase
        val dependency_file_name = Constants.FILE_NAME_DEPENDENCIES + ".cpp"

        // sub-folder "./include"
        file_system_access.generateFile(include_path.append(export_header_file_name).toString, generateExportHeader())
        projectFileSet.addToGroup(ProjectFileSet.HEADER_FILE_GROUP, export_header_file_name)

        if (module.containsTypes)
        {
            val codec_header_name = GeneratorUtil.getCodecName(module).h
            file_system_access.generateFile(include_path.append(codec_header_name).toString, generateHCodec(module))
            projectFileSet.addToGroup(ProjectFileSet.HEADER_FILE_GROUP, codec_header_name)
        }
        for (interface_declaration : module.moduleComponents.filter(InterfaceDeclaration))
        {
            val codec_header_name = GeneratorUtil.getCodecName(interface_declaration).h
            file_system_access.generateFile(include_path.append(codec_header_name).toString,
                generateHCodec(interface_declaration))
            projectFileSet.addToGroup(ProjectFileSet.HEADER_FILE_GROUP, codec_header_name)
        }

        // sub-folder "./gen"
        if (module.containsTypes)
        {
            val file_name = Constants.FILE_NAME_TYPES
            projectFileSet.addToGroup(ProjectFileSet.PROTOBUF_FILE_GROUP, file_name)
        }
        for (interface_declaration : module.moduleComponents.filter(InterfaceDeclaration))
        {
            val file_name = interface_declaration.name
            projectFileSet.addToGroup(ProjectFileSet.PROTOBUF_FILE_GROUP, file_name)
        }

        generateVSProjectFiles(ProjectType.PROTOBUF, projectPath, vsSolution.getVcxprojName(param_bundle),
            projectFileSet)
    }

    def private String generateHCodec(EObject owner)
    {
        val basicCppGenerator = createBasicCppGenerator
        val file_content = new CodecGenerator(basicCppGenerator.typeResolver, param_bundle).
            generateHeaderFileBody(owner)
        generateHeader(basicCppGenerator, file_content.toString, Optional.empty)
    }

}
