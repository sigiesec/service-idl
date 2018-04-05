package com.btc.serviceidl.tests.generator.protobuf

import com.btc.serviceidl.idl.IDLSpecification
import com.btc.serviceidl.tests.IdlInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipse.xtext.generator.GeneratorContext

@RunWith(XtextRunner)
@InjectWith(IdlInjectorProvider)
class ProtobufGeneratorTest {
	@Inject extension ParseHelper<IDLSpecification>
	@Inject IGenerator2 underTest

	@Test
	def void testBasic() {
		val spec = '''
			virtual module BTC {
			virtual module PRINS { 
			module Infrastructure {
			module ServiceHost {
			module Demo { 
			module API {
			
			interface KeyValueStore[version=1.0.0] { 
			};
			}
			}
			}
			}
			}
			}
		'''.parse

		val fsa = new InMemoryFileSystemAccess()
		val generatorContext = new GeneratorContext()
		underTest.doGenerate(spec.eResource, fsa, generatorContext)
		println(fsa.textFiles.keySet)
		assertEquals(103, fsa.textFiles.size) // TODO change to only generate protobuf
		val protobufLocation = IFileSystemAccess::DEFAULT_OUTPUT +
			"cpp/Infrastructure/ServiceHost/Demo/API/Protobuf/gen/KeyValueStore.proto" // TODO why is this in the cpp directory?
		assertTrue(fsa.textFiles.containsKey(protobufLocation))

		println(fsa.textFiles.get(protobufLocation))

		assertEquals(
			'''
			syntax = "proto2";
			package BTC.PRINS.Infrastructure.ServiceHost.Demo.API.Protobuf;
			
			
			
			
			message KeyValueStore_Request
			{
			
			}
			
			message KeyValueStore_Response
			{
			
			}
			'''.toString,
			fsa.textFiles.get(protobufLocation).toString
		)
		// TODO The test should be made more robust by stripping all redundant whitespace 

	}
}
