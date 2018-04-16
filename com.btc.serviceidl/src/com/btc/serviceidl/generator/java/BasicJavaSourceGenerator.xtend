package com.btc.serviceidl.generator.java

import com.btc.serviceidl.generator.common.GuidMapper
import com.btc.serviceidl.generator.common.ResolvedName
import com.btc.serviceidl.idl.AbstractType
import com.btc.serviceidl.idl.AliasDeclaration
import com.btc.serviceidl.idl.EnumDeclaration
import com.btc.serviceidl.idl.EventDeclaration
import com.btc.serviceidl.idl.ExceptionDeclaration
import com.btc.serviceidl.idl.IDLSpecification
import com.btc.serviceidl.idl.MemberElement
import com.btc.serviceidl.idl.ParameterElement
import com.btc.serviceidl.idl.PrimitiveType
import com.btc.serviceidl.idl.ReturnTypeElement
import com.btc.serviceidl.idl.SequenceDeclaration
import com.btc.serviceidl.idl.StructDeclaration
import com.btc.serviceidl.util.Util
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.naming.IQualifiedNameProvider

import static extension com.btc.serviceidl.util.Extensions.*
import static extension com.btc.serviceidl.util.Util.*
import com.btc.serviceidl.idl.InterfaceDeclaration

@Accessors(PACKAGE_GETTER)
class BasicJavaSourceGenerator
{
    private val IQualifiedNameProvider qualified_name_provider
    private val TypeResolver typeResolver
    private val IDLSpecification idl

    private val typedef_table = new HashMap<String, ResolvedName>

    def public dispatch String toText(ExceptionDeclaration element)
    {
        val exception_name = typeResolver.resolveException(
            qualified_name_provider.getFullyQualifiedName(element).toString)
        if (exception_name.isPresent)
            return exception_name.get()
        else
            '''«typeResolver.resolve(element)»'''
    }

    def public dispatch String toText(SequenceDeclaration item)
    {
        val is_failable = item.failable

        '''«typeResolver.resolve(JavaClassNames.COLLECTION)»<«IF is_failable»«typeResolver.resolve(JavaClassNames.COMPLETABLE_FUTURE)»<«ENDIF»«toText(item.type)»«IF is_failable»>«ENDIF»>'''
    }

    def public dispatch String toText(ParameterElement element)
    {
        '''
            «typeResolver.resolve(element)»
        '''
    }

    def public dispatch String toText(MemberElement element)
    {
        '''«IF element.optional»«typeResolver.resolve(JavaClassNames.OPTIONAL)»<«ENDIF»«toText(element.type)»«IF element.optional»>«ENDIF»'''
    }

    def public dispatch String toText(ReturnTypeElement element)
    {
        if (element.isVoid)
            return "void"

        throw new IllegalArgumentException("Unknown ReturnTypeElement: " + element.class.toString)
    }

    def public dispatch String toText(AbstractType element)
    {
        if (element.primitiveType !== null)
            return toText(element.primitiveType)
        else if (element.referenceType !== null)
            return toText(element.referenceType)
        else if (element.collectionType !== null)
            return toText(element.collectionType)

        throw new IllegalArgumentException("Unknown AbstractType: " + element.class.toString)
    }

    def public dispatch String toText(PrimitiveType element)
    {
        return typeResolver.resolve(element).toString
    }

    def public dispatch String toText(AliasDeclaration element)
    {
        var type_name = typedef_table.get(element.name)
        val ultimate_type = element.type.ultimateType
        if (type_name === null)
        {
            type_name = typeResolver.resolve(ultimate_type)
            typedef_table.put(element.name, type_name)
        }

        if (!Util.isPrimitive(ultimate_type))
            typeResolver.resolve(type_name.fullyQualifiedName)
        return type_name.toString
    }

    def public dispatch String toText(EnumDeclaration element)
    {
        '''«typeResolver.resolve(element)»'''
    }

    def public dispatch String toText(EventDeclaration element)
    {
        '''«typeResolver.resolve(element)»'''
    }

    def public dispatch String toText(StructDeclaration element)
    {
        '''«typeResolver.resolve(element)»'''
    }

    def public dispatch String toDeclaration(EObject element)
    {
        '''
            // TODO: implement this...
        '''
    }

    def public dispatch String toDeclaration(ExceptionDeclaration element)
    {
        val class_members = new ArrayList<Pair<String, String>>
        for (member : element.effectiveMembers)
            class_members.add(Pair.of(member.name, toText(member.type)))

        '''
            public class «element.name» extends «IF element.supertype === null»Exception«ELSE»«toText(element.supertype)»«ENDIF» {
               
               static final long serialVersionUID = «element.name.hashCode»L;
               «FOR class_member : class_members BEFORE newLine»
                   private «class_member.value» «class_member.key»;
               «ENDFOR»
               
               public «element.name»() {
                  // this default constructor is always necessary for exception registration in ServiceComm framework
               }
               
               «IF !class_members.empty»
                   public «element.name»(«FOR class_member : class_members SEPARATOR ", "»«class_member.value» «class_member.key»«ENDFOR») {
                      «FOR class_member : class_members»
                          this.«class_member.key» = «class_member.key»;
                      «ENDFOR»
                   };
               «ENDIF»
               
               «FOR class_member : class_members SEPARATOR newLine»
                   «makeGetterSetter(class_member.value, class_member.key)»
               «ENDFOR»
               
               «IF !(class_members.size == 1 && class_members.head.value.equalsIgnoreCase("string"))»
                   public «element.name»(String message) {
                      // this default constructor is necessary to be able to use Exception#getMessage() method
                      super(message);
                   }
               «ENDIF»
            }
        '''
    }

    def public dispatch String toDeclaration(EnumDeclaration element)
    {
        '''
            public enum «element.name» {
               «FOR enum_value : element.containedIdentifiers SEPARATOR ","»
                   «enum_value»
               «ENDFOR»
            }
        '''
    }

    def public dispatch String toDeclaration(StructDeclaration element)
    {
        val class_members = new ArrayList<Pair<String, String>>
        for (member : element.effectiveMembers)
            class_members.add(
                Pair.of(
                    member.
                        name, '''«IF member.optional»«typeResolver.resolve(JavaClassNames.OPTIONAL)»<«ENDIF»«toText(member.type)»«IF member.optional»>«ENDIF»'''))

        val all_class_members = new ArrayList<Pair<String, String>>
        for (member : element.allMembers)
            all_class_members.add(
                Pair.of(
                    member.
                        name, '''«IF member.optional»«typeResolver.resolve(JavaClassNames.OPTIONAL)»<«ENDIF»«toText(member.type)»«IF member.optional»>«ENDIF»'''))

        val is_derived = ( element.supertype !== null )
        val related_event = element.getRelatedEvent(idl)

        '''
            public class «element.name» «IF is_derived»extends «toText(element.supertype)» «ENDIF»{
               «IF related_event !== null»
                   
                   public static final «typeResolver.resolve(JavaClassNames.UUID)» EventTypeGuid = UUID.fromString("«GuidMapper.get(related_event)»");
               «ENDIF»
               «FOR class_member : class_members BEFORE newLine»
                   private «class_member.value» «class_member.key»;
               «ENDFOR»
               
               «IF !class_members.empty»public «element.name»() { «IF is_derived»super(); «ENDIF»};«ENDIF»
               
               public «element.name»(«FOR class_member : all_class_members SEPARATOR ", "»«class_member.value» «class_member.key»«ENDFOR») {
               «IF is_derived»super(«element.supertype.allMembers.map[name].join(", ")»);«ENDIF»
               
               «FOR class_member : class_members»
                this.«class_member.key» = «class_member.key»;
               «ENDFOR»
               };
               
               «FOR class_member : class_members SEPARATOR newLine»
                «makeGetterSetter(class_member.value, class_member.key)»
               «ENDFOR»
               
               «FOR type : element.typeDecls SEPARATOR newLine AFTER newLine»
                «toDeclaration(type)»
               «ENDFOR»
            }
        '''
    }

    def private static String makeGetterSetter(String type_name, String var_name)
    {
        '''
            «makeGetter(type_name, var_name)»
            
            «makeSetter(type_name, var_name)»
        '''
    }

    def public static String makeGetter(String type_name, String var_name)
    {
        '''
            public «type_name» get«var_name.toFirstUpper»() {
               return «var_name»;
            };
        '''
    }

    def private static String makeSetter(String type_name, String var_name)
    {
        '''
            public void set«var_name.toFirstUpper»(«type_name» «var_name») {
               this.«var_name» = «var_name»;
            };
        '''
    }

    def public static String newLine()
    {
        '''
        
        '''
    }

    def public static String asMethod(String name)
    {
        name.toFirstLower
    }

    def public static String asParameter(String name)
    {
        name.toFirstLower
    }

    def public static String asServiceFaultHandlerFactory(EObject container)
    {
        val name = if (container instanceof InterfaceDeclaration) container.name else ""
        '''«name»ServiceFaultHandlerFactory'''
    }

}
