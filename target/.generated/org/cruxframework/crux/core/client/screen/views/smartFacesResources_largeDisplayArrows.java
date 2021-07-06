package org.cruxframework.crux.core.client.screen.views;

import org.cruxframework.crux.core.client.Crux;
import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.views.View;

public class smartFacesResources_largeDisplayArrows {
  public static void init(){
    if (!View.containsResource("smartFacesResources")){
      org.cruxframework.crux.smartfaces.themes.client.large.SmartFacesResourcesLarge resource0= GWT.create(org.cruxframework.crux.smartfaces.themes.client.large.SmartFacesResourcesLarge.class);
      resource0.css().ensureInjected();
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger1.fine(Crux.getMessages().resourceCsssInjected("CssResource"));
      }
      View.addResource("smartFacesResources", resource0);
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger1.fine(Crux.getMessages().resourcesInitialized("smartFacesResources"));
      }
    }
  }
  private static java.util.logging.Logger logger1 = java.util.logging.Logger.getLogger(smartFacesResources_largeDisplayArrows.class.getName());
}
