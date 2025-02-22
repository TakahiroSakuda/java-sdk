/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.assistant.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Workspace settings related to the Watson Assistant user interface.
 */
public class WorkspaceSystemSettingsTooling extends GenericModel {

  @SerializedName("store_generic_responses")
  private Boolean storeGenericResponses;

  /**
   * Gets the storeGenericResponses.
   *
   * Whether the dialog JSON editor displays text responses within the `output.generic` object.
   *
   * @return the storeGenericResponses
   */
  public Boolean isStoreGenericResponses() {
    return storeGenericResponses;
  }

  /**
   * Sets the storeGenericResponses.
   *
   * @param storeGenericResponses the new storeGenericResponses
   */
  public void setStoreGenericResponses(final Boolean storeGenericResponses) {
    this.storeGenericResponses = storeGenericResponses;
  }
}
