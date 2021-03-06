/**
 * Sencha GXT 3.1.1 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.examples.resources.shared;


import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.sencha.gxt.examples.resources.server.data.Folder;

@ProxyFor(Folder.class)
public interface FolderProxy extends EntityProxy, NamedProxy {
  String getName();

  void setName(String name);

  @Override
  public EntityProxyId<FolderProxy> stableId();
}
