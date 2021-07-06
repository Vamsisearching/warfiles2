package org.cruxframework.crux.core.client.screen.views;

import org.cruxframework.crux.core.client.Crux;
import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.views.View;

public class xStandardResources_smallDisplayArrows {
  public static void init(){
    if (!View.containsResource("xStandardResources")){
      org.cruxframework.crux.themes.widgets.xstandard.client.resource.small.XStandardResourcesSmall resource5= GWT.create(org.cruxframework.crux.themes.widgets.xstandard.client.resource.small.XStandardResourcesSmall.class);
      resource5.css().ensureInjected();
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger6.fine(Crux.getMessages().resourceCsssInjected("CssXStandardSmall"));
      }
      View.addResource("xStandardResources", resource5);
      if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
        logger6.fine(Crux.getMessages().resourcesInitialized("xStandardResources"));
      }
    }
  }
  private static java.util.logging.Logger logger6 = java.util.logging.Logger.getLogger(xStandardResources_smallDisplayArrows.class.getName());
}
