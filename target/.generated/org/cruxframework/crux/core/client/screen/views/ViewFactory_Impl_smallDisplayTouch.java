package org.cruxframework.crux.core.client.screen.views;

import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.Crux;
import org.cruxframework.crux.core.client.collection.FastMap;
import org.cruxframework.crux.core.client.screen.views.ViewFactory;
import org.cruxframework.crux.core.client.utils.StringUtils;
import com.google.gwt.user.client.ui.Widget;
import org.cruxframework.crux.core.rebind.screen.widget.WidgetCreatorContext;
import org.cruxframework.crux.core.client.screen.InterfaceConfigException;

public class ViewFactory_Impl_smallDisplayTouch implements org.cruxframework.crux.core.client.screen.views.ViewFactory {
  public void createView(String name, CreateCallback callback) throws InterfaceConfigException{ 
    createView(name, name, callback);
  }
  
  public void createView(String name, String id, CreateCallback callback) throws InterfaceConfigException{ 
    if (callback == null){
      callback = CreateCallback.EMPTY_CALLBACK;
    }
    if (StringUtils.unsafeEquals(name, "index")){
      callback.onViewCreated(new org.cruxframework.crux.core.client.screen.views.index_smallDisplayTouch(id));
      org.cruxframework.crux.core.client.screen.DisplayHandler.configureViewport("user-scalable=no, width=320");
    }
    else 
    throw new InterfaceConfigException("View ["+name+"] was not found. Check if you import it using useView attribute.");
  }
  public org.cruxframework.crux.core.client.screen.DeviceAdaptive.Device getCurrentDevice(){ 
    return org.cruxframework.crux.core.client.screen.DeviceAdaptive.Device.smallDisplayTouch;
  }
}
