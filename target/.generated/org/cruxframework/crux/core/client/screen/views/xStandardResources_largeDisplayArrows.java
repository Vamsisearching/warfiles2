package org.cruxframework.crux.core.client.screen.views;

import org.cruxframework.crux.core.client.Crux;
import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.views.View;

public class xStandardResources_largeDisplayArrows {
  public static void init(){
    if (!View.containsResource("xStandardResources")){
      org.cruxframework.crux.themes.widgets.xstandard.client.resource.large.XStandardResourcesLarge resource= GWT.create(org.cruxframework.crux.themes.widgets.xstandard.client.resource.large.XStandardResourcesLarge.class);
      resource.css().ensureInjected();
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger0.fine(Crux.getMessages().resourceCsssInjected("CssXStandardLarge"));
      }
      View.addResource("xStandardResources", resource);
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger0.fine(Crux.getMessages().resourcesInitialized("xStandardResources"));
      }
    }
  }
  private static java.util.logging.Logger logger0 = java.util.logging.Logger.getLogger(xStandardResources_largeDisplayArrows.class.getName());
}
