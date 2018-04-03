/**
 * generated by Xtext 2.13.0
 */
package com.btc.serviceidl.ide;

import com.btc.serviceidl.IdlRuntimeModule;
import com.btc.serviceidl.IdlStandaloneSetup;
import com.btc.serviceidl.ide.IdlIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class IdlIdeSetup extends IdlStandaloneSetup {
  @Override
  public Injector createInjector() {
    IdlRuntimeModule _idlRuntimeModule = new IdlRuntimeModule();
    IdlIdeModule _idlIdeModule = new IdlIdeModule();
    return Guice.createInjector(Modules2.mixin(_idlRuntimeModule, _idlIdeModule));
  }
}
