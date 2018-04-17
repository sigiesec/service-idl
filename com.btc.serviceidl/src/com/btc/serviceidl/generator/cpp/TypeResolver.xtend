package com.btc.serviceidl.generator.cpp

import com.btc.serviceidl.generator.common.GeneratorUtil
import com.btc.serviceidl.generator.common.Names
import com.btc.serviceidl.generator.common.ParameterBundle
import com.btc.serviceidl.generator.common.ProjectType
import com.btc.serviceidl.generator.common.ResolvedName
import com.btc.serviceidl.generator.common.TransformType
import com.btc.serviceidl.idl.AbstractType
import com.btc.serviceidl.idl.InterfaceDeclaration
import com.btc.serviceidl.idl.PrimitiveType
import com.btc.serviceidl.util.Constants
import com.btc.serviceidl.util.Util
import java.util.Collection
import java.util.HashSet
import java.util.Map
import java.util.Optional
import java.util.UUID
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.naming.IQualifiedNameProvider

import static extension com.btc.serviceidl.generator.common.Extensions.*
import static extension com.btc.serviceidl.generator.cpp.CppExtensions.*

@Accessors(PACKAGE_GETTER)
class TypeResolver
{
    private val IQualifiedNameProvider qualified_name_provider
    private val ParameterBundle.Builder param_bundle
    private val extension VSSolution vsSolution
    private val Map<String, String> project_references
    private val Collection<String> cab_libs

    private val modules_includes = new HashSet<String>
    private val cab_includes = new HashSet<String>
    private val boost_includes = new HashSet<String>
    private val stl_includes = new HashSet<String>
    private val odb_includes = new HashSet<String>

    def String resolveCAB(String class_name)
    {
        val header = HeaderResolver.getCABHeader(class_name)
        cab_includes.add(header)
        cab_libs.addAll(LibResolver.getCABLibs(header))
        return class_name
    }

    def String resolveCABImpl(String class_name)
    {
        val header = HeaderResolver.getCABImpl(class_name)
        cab_includes.add(header)
        cab_libs.addAll(LibResolver.getCABLibs(header))
        return class_name
    }

    def String resolveSTL(String class_name)
    {
        stl_includes.add(HeaderResolver.getSTLHeader(class_name))
        return class_name
    }

    def String resolveBoost(String class_name)
    {
        boost_includes.add(HeaderResolver.getBoostHeader(class_name))
        return class_name
    }

    def String resolveODB(String class_name)
    {
        odb_includes.add(HeaderResolver.getODBHeader(class_name))
        return class_name
    }

    def String resolveModules(String class_name)
    {
        modules_includes.add(HeaderResolver.getModulesHeader(class_name))
        val project_reference = ReferenceResolver.getProjectReference(class_name)
        vsSolution.add(project_reference.project_name, UUID.fromString(project_reference.project_guid))
        project_references.put(project_reference.project_name, project_reference.project_path)
        return class_name
    }

    def ResolvedName resolve(EObject object)
    {
        return resolve(object, object.mainProjectType)
    }

    def ResolvedName resolve(EObject object, ProjectType project_type)
    {
        if (Util.isUUIDType(object))
        {
            if (project_type == ProjectType.PROTOBUF)
                return new ResolvedName(resolveSTL("std::string"), TransformType.NAMESPACE)
            else
                return new ResolvedName("BTC::Commons::CoreExtras::UUID", TransformType.NAMESPACE)
        }
        else if (object instanceof PrimitiveType)
            return new ResolvedName(getPrimitiveTypeName(object), TransformType.NAMESPACE)
        else if (object instanceof AbstractType && (object as AbstractType).primitiveType !== null)
            return resolve((object as AbstractType).primitiveType, project_type)

        val qualified_name = qualified_name_provider.getFullyQualifiedName(object)
        if (qualified_name === null)
            return new ResolvedName(Names.plain(object), TransformType.NAMESPACE)

        val resolved_name = qualified_name.toString
        if (HeaderResolver.isCAB(resolved_name))
            resolveCAB(GeneratorUtil.switchPackageSeperator(resolved_name, TransformType.NAMESPACE))
        else if (HeaderResolver.isBoost(resolved_name))
            resolveBoost(GeneratorUtil.switchPackageSeperator(resolved_name, TransformType.NAMESPACE))
        else
        {
            var result = GeneratorUtil.transform(
                ParameterBundle.createBuilder(Util.getModuleStack(Util.getScopeDeterminant(object))).with(project_type).
                    with(TransformType.NAMESPACE).build)
            result += Constants.SEPARATOR_NAMESPACE + if (object instanceof InterfaceDeclaration)
                project_type.getClassName(param_bundle.artifactNature, qualified_name.lastSegment)
            else
                qualified_name.lastSegment
            modules_includes.add(object.getIncludeFilePath(project_type))
            object.resolveProjectFilePath(project_type)
            return new ResolvedName(result, TransformType.NAMESPACE)
        }

        return new ResolvedName(qualified_name, TransformType.NAMESPACE)
    }

    def void resolveProjectFilePath(EObject referenced_object, ProjectType project_type)
    {
        val module_stack = Util.getModuleStack(referenced_object)

        val temp_param = new ParameterBundle.Builder()
        temp_param.reset(param_bundle.artifactNature)
        temp_param.reset(module_stack)
        temp_param.reset(project_type)

        val project_name = getVcxprojName(temp_param, Optional.empty)
        val project_path = '''$(SolutionDir)\«GeneratorUtil.transform(temp_param.with(TransformType.FILE_SYSTEM).build).replace(Constants.SEPARATOR_FILE, Constants.SEPARATOR_BACKSLASH)»\«project_name»'''
        project_references.put(project_name, project_path)
    }

    def getPrimitiveTypeName(PrimitiveType item)
    {
        if (item.integerType !== null)
        {
            switch item.integerType
            {
                case "int64":
                    return resolveSTL("int64_t")
                case "int32":
                    return resolveSTL("int32_t")
                case "int16":
                    return resolveSTL("int16_t")
                case "byte":
                    return resolveSTL("int8_t")
                default:
                    return item.integerType
            }
        }
        else if (item.stringType !== null)
            return resolveSTL("std::string")
        else if (item.floatingPointType !== null)
            return item.floatingPointType
        else if (item.uuidType !== null)
            return resolveCAB("BTC::Commons::CoreExtras::UUID")
        else if (item.booleanType !== null)
            return "bool"
        else if (item.charType !== null)
            return "char"

        throw new IllegalArgumentException("Unknown PrimitiveType: " + item.class.toString)
    }

}
