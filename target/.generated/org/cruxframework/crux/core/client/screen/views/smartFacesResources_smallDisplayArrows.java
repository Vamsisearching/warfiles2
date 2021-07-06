package org.cruxframework.crux.core.client.screen.views;

import org.cruxframework.crux.core.client.Crux;
import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.views.View;

public class smartFacesResources_smallDisplayArrows {
  public static void init(){
    if (!View.containsResource("smartFacesResources")){
      org.cruxframework.crux.smartfaces.themes.client.small.SmartFacesResourcesSmall resource6= GWT.create(org.cruxframework.crux.smartfaces.themes.client.small.SmartFacesResourcesSmall.class);
      resource6.css().ensureInjected();
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger7.fine(Crux.getMessages().resourceCsssInjected("CssResource"));
      }
      View.addResource("smartFacesResources", resource6);
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger7.fine(Crux.getMessages().resourcesInitialized("smartFacesResources"));
      }
    }
  }
  private static java.util.logging.Logger logger7 = java.util.logging.Logger.getLogger(smartFacesResources_smallDisplayArrows.class.getName());
}
