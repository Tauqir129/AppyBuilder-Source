// -*- mode: java; c-basic-offset: 2;
// Copyright 2016-2020 AppyBuilder.com, All Rights Reserved - Info@AppyBuilder.com
// https://www.gnu.org/licenses/gpl-3.0.en.html
//
// Copyright © 2017 Massachusetts Institute of Technology, All rights reserved.
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.client.editor.simple;

/**
 * An exception that is thrown when an operation attempts to retrieve a component by name that
 * does not exist in the project.
 */
public class ComponentNotFoundException extends IllegalArgumentException {
  private final String componentName;

  protected ComponentNotFoundException() {
    super();
    componentName = "unknown";
  }

  public ComponentNotFoundException(String componentName) {
    super("Component not found: " + componentName);
    this.componentName = componentName;
  }

  public final String getComponentName() {
    return componentName;
  }
}
