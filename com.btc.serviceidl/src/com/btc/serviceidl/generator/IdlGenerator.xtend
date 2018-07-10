/*
 * generated by Xtext
 */
package com.btc.serviceidl.generator

import com.btc.serviceidl.generator.common.ArtifactNature
import com.btc.serviceidl.generator.common.GuidMapper
import com.btc.serviceidl.generator.common.ProjectType
import com.btc.serviceidl.generator.cpp.CppGenerator
import com.btc.serviceidl.generator.dotnet.DotNetGenerator
import com.btc.serviceidl.generator.java.JavaGenerator
import com.btc.serviceidl.generator.protobuf.ProtobufGenerator
import com.btc.serviceidl.idl.EventDeclaration
import com.btc.serviceidl.idl.IDLSpecification
import com.btc.serviceidl.idl.InterfaceDeclaration
import com.google.inject.Inject
import java.util.Collections
import java.util.Map
import java.util.UUID
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScopeProvider

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class IdlGenerator implements IGenerator2
{

    @Inject extension IQualifiedNameProvider qualified_name_provider
    @Inject extension IScopeProvider scope_provider
    @Inject IGenerationSettingsProvider generation_settings_provider

    override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext gc)
    {
        // generate GUIDs: common among C++, Java and .NET!
        var boolean resourceChanged = false;
        for (interface_declaration : resource.allContents.toIterable.filter(InterfaceDeclaration))
        {
            if (interface_declaration.guid === null)
            {
                val uuid = UUID.randomUUID.toString.toUpperCase
                GuidMapper.put(interface_declaration, uuid)
                interface_declaration.guid = uuid
                resourceChanged = true
            }
            else
                GuidMapper.put(interface_declaration, interface_declaration.guid.toUpperCase)
        }
        for (event : resource.allContents.toIterable.filter(EventDeclaration))
        {
            if (event.guid === null)
            {
                val uuid = UUID.randomUUID.toString.toUpperCase
                GuidMapper.put(event.data, uuid)
                event.guid = uuid
                resourceChanged = true
            }
            else
                GuidMapper.put(event.data, event.guid.toUpperCase)
        }
        if (resourceChanged)
        {
            resource.save(Collections.EMPTY_MAP)
        }
        val idl = resource.contents.filter(IDLSpecification).head // only one IDL root module possible
        if (idl === null)
        {
            return
        }

        val generationSettings = generation_settings_provider.getSettings(resource)
        val projectTypes = generationSettings.projectTypes
        val languages = generationSettings.languages

// TODO REFACTOR invert these dependencies
        var ProtobufGenerator protobuf_generator
        var Map<EObject, String> protobuf_artifacts
        if (projectTypes.contains(ProjectType.PROTOBUF))
        {
            protobuf_generator = new ProtobufGenerator
            protobuf_generator.doGenerate(resource, fsa, qualified_name_provider, scope_provider,
                generationSettings.moduleStructureStrategy, languages)
            protobuf_artifacts = protobuf_generator.generatedArtifacts
        }

        if (languages.contains(ArtifactNature.CPP))
        {
            val cpp_generator = new CppGenerator(idl, fsa, qualified_name_provider, scope_provider, generationSettings,
                protobuf_generator?.getProjectReferences(ArtifactNature.CPP))
            cpp_generator.doGenerate
        }

        if (languages.contains(ArtifactNature.JAVA))
        {
            val java_generator = new JavaGenerator(idl, fsa, qualified_name_provider, generationSettings,
                protobuf_artifacts)
            java_generator.doGenerate
        }

        if (languages.contains(ArtifactNature.DOTNET))
        {
            val dotnet_generator = new DotNetGenerator(
                idl,
                fsa,
                qualified_name_provider,
                generationSettings,
                projectTypes,
                protobuf_generator?.getProjectReferences(ArtifactNature.DOTNET)
            )
            dotnet_generator.doGenerate
        }
    }

    override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context)
    {
    }

    override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context)
    {
    }

}
