package com.btc.serviceidl.generator.cpp

import com.btc.serviceidl.generator.common.GuidMapper
import com.btc.serviceidl.idl.StructDeclaration
import com.btc.serviceidl.util.Constants
import java.util.Map

class TypeResolverExtensions {
    def static String makeEventGUIDImplementations(extension TypeResolver typeResolver,
        Iterable<StructDeclaration> structs)
    {        
      '''
      «FOR event_data : structs»
         «val related_event = com.btc.serviceidl.util.Util.getRelatedEvent(event_data)»
         «IF related_event !== null»
            «val event_uuid = GuidMapper.get(event_data)»
            // {«event_uuid»}
            static const «resolveSymbol("BTC::Commons::CoreExtras::UUID")» s«event_data.name»TypeGuid = 
               «resolveSymbol("BTC::Commons::CoreExtras::UUID")»::ParseString("«event_uuid»");

            «resolveSymbol("BTC::Commons::CoreExtras::UUID")» «resolve(event_data)»::EVENT_TYPE_GUID()
            {
               return s«event_data.name»TypeGuid;
            }
         «ENDIF»
      «ENDFOR»
      '''
    }

   def static Map<String, String> getDefaultExceptionRegistration(extension TypeResolver typeResolver)
   {
      // TODO these must not be registered, the default must be empty
      #{
          Constants.INVALID_ARGUMENT_EXCEPTION_FAULT_HANDLER         -> resolveSymbol("BTC::Commons::Core::InvalidArgumentException")
         ,Constants.UNSUPPORTED_OPERATION_EXCEPTION_FAULT_HANDLER    -> resolveSymbol("BTC::Commons::Core::UnsupportedOperationException")
      }
   }
      
    
}