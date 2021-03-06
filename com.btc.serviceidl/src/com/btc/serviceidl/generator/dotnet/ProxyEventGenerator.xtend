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
package com.btc.serviceidl.generator.dotnet

import com.btc.serviceidl.idl.EventDeclaration
import com.btc.serviceidl.idl.InterfaceDeclaration
import org.eclipse.xtend.lib.annotations.Accessors

import static com.btc.serviceidl.generator.dotnet.Util.*

@Accessors(NONE)
class ProxyEventGenerator extends ProxyDispatcherGeneratorBase
{
    def String generateProxyEvent(EventDeclaration event, InterfaceDeclaration interface_declaration)
    {
        val deserialazing_observer = getDeserializingObserverName(event)

        // TODO: Handling for keys.
        '''
            public class «toText(event, event)»Impl : «toText(event, event)»
            {
                  private readonly «resolve("BTC.CAB.ServiceComm.NET.API.IClientEndpoint")» _endpoint;
                  
                  public «toText(event, event)»Impl(«resolve("BTC.CAB.ServiceComm.NET.API.IClientEndpoint")» endpoint)
                  {
                      _endpoint = endpoint;
                  }
                  
                  /// <see cref="IObservable{T}.Subscribe"/>
                  public override «resolve("System.IDisposable")» Subscribe(«resolve("System.IObserver")»<«toText(event.data, event)»> subscriber)
                  {
                      _endpoint.EventRegistry.CreateEventRegistration(«toText(event.data, event)».«eventTypeGuidProperty», EventKind.EventKindPublishSubscribe, «toText(event.data, event)».«eventTypeGuidProperty».ToString());
                      return _endpoint.EventRegistry.SubscriberManager.Subscribe(«toText(event.data, event)».«eventTypeGuidProperty», new «deserialazing_observer»(subscriber),
                          EventKind.EventKindPublishSubscribe);
                  }
                  
                  class «deserialazing_observer» : «resolve("System.IObserver")»<«resolve("BTC.CAB.ServiceComm.NET.Common.IMessageBuffer")»>
                  {
                      private readonly «resolve("System.IObserver")»<«toText(event.data, event)»> _subscriber;
            
                      public «deserialazing_observer»(«resolve("System.IObserver")»<«toText(event.data, event)»> subscriber)
                      {
                _subscriber = subscriber;
                      }
            
                      public void OnNext(«resolve("BTC.CAB.ServiceComm.NET.Common.IMessageBuffer")» value)
                      {
                var protobufEvent = «resolveProtobuf(event.data)».ParseFrom(value.PopFront());
                _subscriber.OnNext((«toText(event.data, event)»)«resolveCodec(typeResolver, param_bundle, interface_declaration)».decode(protobufEvent));
                      }
            
                      public void OnError(Exception error)
                      {
                _subscriber.OnError(error);
                      }
            
                      public void OnCompleted()
                      {
                _subscriber.OnCompleted();
                      }
                  }
            }
        '''
    }

}
