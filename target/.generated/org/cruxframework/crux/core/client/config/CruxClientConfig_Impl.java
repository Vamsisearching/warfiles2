package org.cruxframework.crux.core.client.config;

import org.cruxframework.crux.core.client.screen.Screen;

public class CruxClientConfig_Impl implements org.cruxframework.crux.core.client.config.CruxClientConfig {
  public boolean preferWebSQLForNativeDB(){
    return false;
  }
  public String rootViewElementId(){
    return "";
  }
}
