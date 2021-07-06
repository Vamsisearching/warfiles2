package org.cruxframework.crux.core.client.screen.views;

import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.Screen;
import org.cruxframework.crux.core.client.screen.views.View;
import org.cruxframework.crux.core.client.utils.StringUtils;
import com.google.gwt.user.client.Window;
import org.cruxframework.crux.core.client.screen.views.ViewFactoryUtils;
import org.cruxframework.crux.core.client.screen.views.ViewFactory.CreateCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import org.cruxframework.crux.core.client.screen.views.ViewLoadEvent;
import com.google.gwt.user.client.ui.Panel;
import org.cruxframework.crux.core.client.screen.InterfaceConfigException;
import com.google.gwt.user.client.ui.Widget;
import org.cruxframework.crux.core.client.Crux;

public class index_smallDisplayArrows extends View {
  protected index_smallDisplayArrows(String id){
    super(id);
    setTitle(null);
    this.iocContainer = new org.cruxframework.crux.core.client.ioc.IocContainer_index_smallDisplayArrows(this);
    this.registeredControllers = new org.cruxframework.crux.core.client.controller.RegisteredControllers_index_smallDisplayArrows(this, iocContainer);
    this.registeredFormatters = new org.cruxframework.crux.core.client.formatter.RegisteredFormatters_index();
    this.registeredDataSources = new org.cruxframework.crux.core.client.datasource.RegisteredDataSources_index_smallDisplayArrows(this, iocContainer);
    org.cruxframework.crux.core.client.screen.views.xStandardResources_smallDisplayArrows.init();
    org.cruxframework.crux.core.client.screen.views.smartFacesResources_smallDisplayArrows.init();
  }
  public org.cruxframework.crux.core.client.controller.RegisteredControllers getRegisteredControllers(){
    return this.registeredControllers;
  }
  public org.cruxframework.crux.core.client.formatter.RegisteredClientFormatters getRegisteredFormatters(){
    return this.registeredFormatters;
  }
  public org.cruxframework.crux.core.client.datasource.DataSource<?> createDataSource(String dataSource){
    return this.registeredDataSources.getDataSource(dataSource);
  }
  protected void createWidgets(){
    setHeight("100%");
    if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
      logger.fine(Crux.getMessages().viewContainerViewCreated(getId()));
    }
  }
  protected void render(com.google.gwt.user.client.ui.Panel rootPanel2, final org.cruxframework.crux.core.client.screen.views.View.RenderCallback renderCallback) throws InterfaceConfigException{
    if (this.viewPanel == null){
      this.viewPanel = new com.google.gwt.user.client.ui.HTMLPanel("   ");
      rootPanel2.add(this.viewPanel);
      renderCallback.onRendered();
    }
    else {
      rootPanel2.add(this.viewPanel);
      renderCallback.onRendered();
    }
    if(!StringUtils.isEmpty(this.width)){
      updateViewWidth(this.width);
    }
    if(!StringUtils.isEmpty(this.height)){
      updateViewHeight(this.height);
    }
    if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
      logger.fine(Crux.getMessages().viewContainerViewRendered(getId()));
    }
  }
  protected void updateViewHeight(String height){
    if (this.viewPanel != null){
      this.viewPanel.setHeight(height);
    }
  }
  protected void updateViewWidth(String width){
    if (this.viewPanel != null){
      this.viewPanel.setWidth(width);
    }
  }
  protected native org.cruxframework.crux.core.client.collection.Map<String> initializeLazyDependencies()/*-{
  return {};
}-*/;
public org.cruxframework.crux.core.client.ioc.IocContainer getIocContainer(){
  return iocContainer;
}
public org.cruxframework.crux.core.client.ioc.IocContainer_index_smallDisplayArrows getTypedIocContainer(){
  return iocContainer;
}
protected void registerDataObjectBinders(){
}
public com.google.gwt.user.client.ui.HTMLPanel getViewPanel(){
  return viewPanel;
}
private org.cruxframework.crux.core.client.controller.RegisteredControllers registeredControllers;
private org.cruxframework.crux.core.client.datasource.RegisteredDataSources registeredDataSources;
private org.cruxframework.crux.core.client.formatter.RegisteredClientFormatters registeredFormatters;
protected org.cruxframework.crux.core.client.ioc.IocContainer_index_smallDisplayArrows iocContainer;
private final View __view = this;
private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(index_smallDisplayArrows.class.getName());
private com.google.gwt.user.client.ui.HTMLPanel viewPanel = null;
}
