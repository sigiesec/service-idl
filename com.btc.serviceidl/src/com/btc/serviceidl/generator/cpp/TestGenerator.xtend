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

import com.btc.serviceidl.generator.common.ProjectType
import com.btc.serviceidl.idl.EnumDeclaration
import com.btc.serviceidl.idl.InterfaceDeclaration
import com.btc.serviceidl.idl.ParameterDirection
import com.btc.serviceidl.idl.StructDeclaration
import org.eclipse.core.runtime.Path
import org.eclipse.xtend.lib.annotations.Accessors

import static extension com.btc.serviceidl.generator.cpp.Util.*
import static extension com.btc.serviceidl.util.Extensions.*
import static extension com.btc.serviceidl.util.Util.*

@Accessors
class TestGenerator extends BasicCppGenerator
{

    def generateCppTest(InterfaceDeclaration interface_declaration)
    {
        val api_type = resolve(interface_declaration, ProjectType.SERVICE_API)
        val subject_name = interface_declaration.name.toFirstLower
        val logger_factory = resolveSymbol("BTC::Performance::CommonsTestSupport::GetTestLoggerFactory")
        val container_name = interface_declaration.name + "TestContainer"

        // explicitly resolve some necessary includes, because they are needed
        // for the linker due to some classes we use, but not directly referenced
        resolveSymbolWithImplementation("BTC::Commons::CoreExtras::Optional")

        '''
            typedef «resolveSymbol("BTC::ServiceComm::Util::DefaultCreateDispatcherWithContextAndEndpoint")»<
                «api_type»
               ,«resolve(interface_declaration, ProjectType.DISPATCHER)» > CreateDispatcherFunctorBaseType;
            
            struct CreateDispatcherFunctor : public CreateDispatcherFunctorBaseType
            {  CreateDispatcherFunctor( «resolveSymbol("BTC::Commons::Core::Context")»& context ) : CreateDispatcherFunctorBaseType( context ) {} };
            
            typedef «resolveSymbol("BTC::ServiceComm::Util::DispatcherAutoRegistration")»<
                «api_type»
               ,«resolve(interface_declaration, ProjectType.DISPATCHER)»
               ,CreateDispatcherFunctor > DispatcherAutoRegistrationType;
            
            // enable commented lines for ZeroMQ encryption!
            const auto serverConnectionOptionsBuilder =
               «resolveSymbol("BTC::ServiceComm::SQ::ZeroMQ::ConnectionOptionsBuilder")»()
               //.WithAuthenticationMode(BTC::ServiceComm::SQ::ZeroMQ::AuthenticationMode::Curve)
               //.WithServerAcceptAnyClientKey(true)
               //.WithServerSecretKey("d{pnP/0xVmQY}DCV2BS)8Y9fw9kB/jq^id4Qp}la")
               //.WithServerPublicKey("Qr5^/{Rc{V%ji//usp(^m^{(qxC3*j.vsF+Q{XJt")
               ;
            
            // enable commented lines for ZeroMQ encryption!
            const auto clientConnectionOptionsBuilder =
               «resolveSymbol("BTC::ServiceComm::SQ::ZeroMQ::ConnectionOptionsBuilder")»()
               //.WithAuthenticationMode(BTC::ServiceComm::SQ::ZeroMQ::AuthenticationMode::Curve)
               //.WithServerPublicKey("Qr5^/{Rc{V%ji//usp(^m^{(qxC3*j.vsF+Q{XJt")
               //.WithClientSecretKey("9L9K[bCFp7a]/:gJL2x{PoV}wnaAb.Zt}[qj)z/!")
               //.WithClientPublicKey("=ayKwMDx1YB]TK9hj4:II%8W2p4:Ue((iEkh30:@")
               ;
            
            struct «container_name»
            {
               «container_name»( «resolveSymbol("BTC::Commons::Core::Context")»& context ) :
               m_connection( new «resolveSymbol("BTC::ServiceComm::SQ::ZeroMQTestSupport::ZeroMQTestConnection")»(
                   context
                  ,«logger_factory»(), 1, true
                  ,«resolveSymbol("BTC::ServiceComm::SQ::ZeroMQTestSupport::ConnectionDirection")»::Regular
                  ,clientConnectionOptionsBuilder
                  ,serverConnectionOptionsBuilder
               ) )
               ,m_dispatcher( new DispatcherAutoRegistrationType(
                   «api_type»::TYPE_GUID()
                  ,"«api_type.shortName»"
                  ,"«api_type.shortName»"
                  ,«logger_factory»()
                  ,m_connection->GetServerEndpoint()
                  ,«resolveSymbol("BTC::Commons::Core::MakeAuto")»( new «resolve(interface_declaration, ProjectType.IMPL)»(
                      context
                     ,«logger_factory»()
                     ) )
                  ,CreateDispatcherFunctor( context ) ) )
               ,m_proxy( new «resolve(interface_declaration, ProjectType.PROXY)»(
                   context
                  ,«logger_factory»()
                  ,m_connection->GetClientEndpoint() ) )
               {}
            
               ~«container_name»()
               {
               m_connection->GetClientEndpoint().InitiateShutdown();
               m_connection->GetClientEndpoint().Wait();
               }
            
               «api_type»& GetSubject()
               {  return *m_proxy; }
            
            private:
               «resolveSymbol("std::unique_ptr")»< «resolveSymbol("BTC::ServiceComm::TestBase::ITestConnection")» > m_connection;
               «resolveSymbol("std::unique_ptr")»< DispatcherAutoRegistrationType > m_dispatcher;
               «resolveSymbol("std::unique_ptr")»< «api_type» > m_proxy;
            };
            
            «FOR func : interface_declaration.functions»
                «resolveSymbol("TEST")»( «interface_declaration.name»_«func.name» )
                {
                   «container_name» container( *GetContext() );
                   «api_type»& «subject_name»( container.GetSubject() );
                   
                   «FOR param : func.parameters.filter[direction == ParameterDirection.PARAM_IN]»
                       «IF param.paramType.isSequenceType»
                           «val is_failable = param.paramType.isFailable»
                           «resolveSymbol("BTC::Commons::Core::Vector")»< «IF is_failable»«resolveSymbol("BTC::Commons::CoreExtras::FailableHandle")»<«ENDIF»«toText(param.paramType.ultimateType, param)»«IF is_failable»>«ENDIF» > «param.paramName.asParameter»;
                       «ELSE»
                           «val type_name = toText(param.paramType, param)»
                           «type_name» «param.paramName.asParameter»«IF param.paramType.isEnumType» = «type_name»::«(param.paramType.ultimateType as EnumDeclaration).containedIdentifiers.head»«ELSEIF param.paramType.isStruct» = {}«ENDIF»;
                       «ENDIF»
                   «ENDFOR»
                   «FOR param : func.parameters.filter[direction == ParameterDirection.PARAM_OUT]»
                       «IF param.paramType.isSequenceType»
                           «val ulimate_type = toText(param.paramType.ultimateType, param)»
                           «val is_failable = param.paramType.isFailable»
                           «val inner_type = if (is_failable) '''«addCabInclude(new Path("Commons/FutureUtil/include/FailableHandleAsyncInsertable.h")).alias(resolveSymbol("BTC::Commons::CoreExtras::FailableHandle"))»< «ulimate_type» >''' else ulimate_type»
                           «resolveSymbol("BTC::Commons::CoreExtras::InsertableTraits")»< «inner_type» >::AutoPtrType «param.paramName.asParameter»( «resolveSymbol("BTC::Commons::FutureUtil::CreateDefaultAsyncInsertable")»< «inner_type» >() );
                       «ELSE»
                           «val type_name = toText(param.paramType, param)»
                           «type_name» «param.paramName.asParameter»«IF param.paramType.isEnumType» = «type_name»::«(param.paramType.ultimateType as EnumDeclaration).containedIdentifiers.head»«ENDIF»;
                       «ENDIF»
                   «ENDFOR»
                   «FOR param : func.parameters»
                       «val param_type = param.paramType.ultimateType»
                       «IF param_type instanceof StructDeclaration»
                           «FOR member : param_type.allMembers.filter[!optional].filter[type.isEnumType]»
                               «val enum_type = member.type.ultimateType»
                               «param.paramName.asParameter».«member.name.asMember» = «toText(enum_type, enum_type)»::«(enum_type as EnumDeclaration).containedIdentifiers.head»;
                           «ENDFOR»
                       «ENDIF»
                   «ENDFOR»
                   «resolveSymbol("UTTHROWS")»( «resolveSymbol("BTC::Commons::Core::UnsupportedOperationException")», «subject_name».«func.name»(«func.parameters.map[ (if (direction == ParameterDirection.PARAM_OUT && paramType.isSequenceType) "*" else "") + paramName.asParameter + if (direction == ParameterDirection.PARAM_IN && paramType.isSequenceType) ".GetBeginForward()" else ""].join(", ")»)«IF !func.isSync».Get()«ENDIF» );
                }
            «ENDFOR»
            
        '''
    }

}
