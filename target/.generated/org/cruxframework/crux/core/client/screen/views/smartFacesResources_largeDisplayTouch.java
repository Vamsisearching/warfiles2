package org.cruxframework.crux.core.client.screen.views;

import org.cruxframework.crux.core.client.Crux;
import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.views.View;

public class smartFacesResources_largeDisplayTouch {
  public static void init(){
    if (!View.containsResource("smartFacesResources")){
      org.cruxframework.crux.smartfaces.themes.client.large.SmartFacesResourcesLarge resource4= GWT.create(org.cruxframework.crux.smartfaces.themes.client.large.SmartFacesResourcesLarge.class);
      resource4.css().ensureInjected();
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger5.fine(Crux.getMessages().resourceCsssInjected("CssResource"));
      }
      View.addResource("smartFacesResources", resource4);
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger5.fine(Crux.getMessages().resourcesInitialized("smartFacesResources"));
      }
    }
  }
  private static java.util.logging.Logger logger5 = java.util.logging.Logger.getLogger(smartFacesResources_largeDisplayTouch.class.getName());
}
