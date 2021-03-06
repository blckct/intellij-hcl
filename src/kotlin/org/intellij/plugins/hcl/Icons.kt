/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.plugins.hcl

import com.intellij.icons.AllIcons
import com.intellij.openapi.util.IconLoader
import com.intellij.util.PlatformIcons
import javax.swing.Icon

object Icons {
  object FileTypes {
    // TODO: Create icons
    val HCL: Icon by lazy { AllIcons.FileTypes.Text }
    val Terraform: Icon by lazy { IconLoader.getIcon("/hcl/terraform.png") }
    val HIL: Icon by lazy { AllIcons.FileTypes.Custom }
  }

  val Property: Icon by lazy { PlatformIcons.PROPERTY_ICON }
  val PropertyBrackets: Icon by lazy { IconLoader.getIcon("/hcl/property_brackets.png") }
  val PropertyBraces: Icon by lazy { IconLoader.getIcon("/hcl/property_braces.png") }
  val Array: Icon by lazy { AllIcons.Json.Array}
  val Object: Icon by lazy { AllIcons.Json.Object}
}
