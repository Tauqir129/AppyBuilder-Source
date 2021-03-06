// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2016-2020 AppyBuilder.com, All Rights Reserved - Info@AppyBuilder.com
// https://www.gnu.org/licenses/gpl-3.0.en.html

// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.components.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to indicate library files required by components.
 *
 * @author ralph.morelli@trincoll.edu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface UsesLibraries {

  /**
   * The names of the libraries separated by commas.
   *
   * @return  the library name
   * @see android.Manifest.permission
   */
  String libraries() default "";
}
