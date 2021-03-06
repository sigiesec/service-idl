/*
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.tests

import com.btc.serviceidl.idl.IDLSpecification
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.ecore.resource.ResourceSet
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.junit.Ignore
import com.btc.serviceidl.tests.testdata.TestData

@RunWith(XtextRunner)
@InjectWith(IdlInjectorProvider)
class IdlParsingTest
{
    @Inject extension ParseHelper<IDLSpecification> parseHelper
    @Inject extension ValidationTestHelper
    @Inject Provider<ResourceSet> rsp

    @Test
    def void testParsing()
    {
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

        spec.assertNoErrors;

    /*
     * val interface = ((((((spec.defintions.get(0) as module).defintions.get(0) as module).defintions.get(0) as module).defintions.get(0) as module)
     *                    .defintions.get(0) as module).defintions.get(0) as module).defintions.get(0) as interface_decl;
     * Assert::assertEquals("KeyValueStore", interface.name);
     */
    }

    @Test
    def void testInhertiance()
    {
        val spec = '''
            virtual module BTC {
            virtual module PRINS { 
            module Infrastructure {
            module ServiceHost {
            module Demo { 
            module API {
            
            interface KeyValueStore[version=1.0.0] { 
            };
            
            interface IntfB : KeyValueStore {
            };
            }
            }
            }
            }
            }
            }
        '''.parse

        spec.assertNoErrors;

    /*
     * val interface = ((((((spec.defintions.get(0) as module).defintions.get(0) as module).defintions.get(0) as module).defintions.get(0) as module)
     *                    .defintions.get(0) as module).defintions.get(0) as module).defintions.get(0) as interface_decl;
     * Assert::assertEquals("KeyValueStore", interface.name);
     */
    }

    @Test
    def void testExceptionDecl()
    {

        val rs = rsp.get()
        // TODO: Das muss noch Bestandteil der Grammatik werden
        rs.getResource(URI.createURI("src/com/btc/serviceidl/tests/testdata/base.idl"), true)

        val spec = '''
            // #include "base.idl"
            import BTC.Commons.Core.InvalidArgumentException
            
            module Test {
            
            interface KeyValueStore { 
            	exception DuplicateKeyException :  BTC.Commons.Core.InvalidArgumentException { 
            		string reason;
            	};
            	
            	foo() returns void raises DuplicateKeyException;
            };
            }
        '''.parse(rs)

        spec.assertNoErrors;

    /*
     * 		val exceptionDecl = ((spec.defintions.get(0) as module).defintions.get(0) as interface_decl).contains.get(0);
     * 		Assert::assertTrue("wrong type", exceptionDecl instanceof ExcecptionDecl);
     * 		Assert::assertEquals("DuplicateKeyException", (exceptionDecl as except_decl).name);
     */
    }

    @Test
    def void testTypeDefs()
    {
        val spec = '''
            
            module Test {
            
            		typedef string KeyType;
            		typedef string ValueType;
            }
        '''.parse;

        spec.assertNoErrors;

    }

    @Ignore
    @Test
    def void testTemplates()
    {
        val spec = '''
            
            module Test {
            
            interface KeyValueStore { 
            
            	typedef string KeyType;
            	typedef string ValueType;
            	
            	typedef sequence<int32> IntSeq;
            };
            }
        '''.parse;

        spec.assertNoErrors;

//		val typedef = spec.defintions.get(0).module.defintions.get(0).interfaceDecl.contains.get(0).typeDecl.aliasType;
//		Assert::assertEquals("KeyType", typedef.name);
//		Assert::assertEquals("string", typedef.containedType.baseType.primitive.charstrType.stringType.PK_STRING);
    }

    @Test
    def void testStructs()
    {
        val spec = '''
            
            module Test {
            
            interface KeyValueStore {
            	
            		typedef string KeyType;
            		 		typedef string ValueType;
            		
            
            	struct ModificationEvent {
            	     	KeyType key;
            		optional ValueType value;
            		 };
            
            };
            }
        '''.parse;

        spec.assertNoErrors;
    }

    @Test
    def void testEnums()
    {
        val spec = '''
            
            module Test {
            
            interface KeyValueStore {
            	
            	enum ModificationKind {
            						ModificationKind_Added,
            							ModificationKind_Modified,
            							ModificationKind_Removed
            					};
            					
            	struct ModificationEvent {
            		 ModificationKind modificationKind;
            		 };
            
            };
            }
        '''.parse;

        spec.assertNoErrors;
    }

    @Test
    def void testOperations()
    {
        val spec = '''
            
            module Test {
            
            interface KeyValueStore {
            	
            	typedef string KeyType;
            	typedef string ValueType;
            	
            	struct EntryType 
            	{
            		KeyType key;
            		ValueType value;
            	};
            	 
            
            		enum ModificationKind {
            			ModificationKind_Added,
            				ModificationKind_Modified,
            				ModificationKind_Removed
            		};
            
            	struct ModificationEvent {
            	     	KeyType key;
            		optional ValueType value;
            		
            		ModificationKind modificationKind;
            		 };
            		 
            		 AddEntries(in sequence<EntryType> entries) returns void;
            
            /** Queries the keys of entries with a given prefix asynchronously. */
               QueryKeysWithPrefix(in KeyType prefix) returns sequence<KeyType> ; // async keyword? nein! Default ist async. sync als spezielles Keyword
               //Wie das Reingeben eines Inseratables machen?
            
            };
            }
        '''.parse;

        spec.assertNoErrors;
    }

    @Test
    def void loadModel()
    {
        val result = parseHelper.parse('''
            module Test {}
        ''')
        Assert.assertNotNull(result)
        val errors = result.eResource.errors
        Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
    }

    @Test
    def void testFull()
    {
        val spec = TestData.full.parse;

        spec.assertNoErrors;
    }
}
