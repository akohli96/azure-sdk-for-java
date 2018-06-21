/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A deleted app.
 */
public class DeletedSiteInner {
    /**
     * Numeric id for the deleted site.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * Time in UTC when the app was deleted.
     */
    @JsonProperty(value = "deletedTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String deletedTimestamp;

    /**
     * Subscription containing the deleted site.
     */
    @JsonProperty(value = "subscription", access = JsonProperty.Access.WRITE_ONLY)
    private String subscription;

    /**
     * ResourceGroup that contained the deleted site.
     */
    @JsonProperty(value = "resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * Name of the deleted site.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Slot of the deleted site.
     */
    @JsonProperty(value = "slot", access = JsonProperty.Access.WRITE_ONLY)
    private String slot;

    /**
     * Get numeric id for the deleted site.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set numeric id for the deleted site.
     *
     * @param id the id value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get time in UTC when the app was deleted.
     *
     * @return the deletedTimestamp value
     */
    public String deletedTimestamp() {
        return this.deletedTimestamp;
    }

    /**
     * Get subscription containing the deleted site.
     *
     * @return the subscription value
     */
    public String subscription() {
        return this.subscription;
    }

    /**
     * Get resourceGroup that contained the deleted site.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get name of the deleted site.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get slot of the deleted site.
     *
     * @return the slot value
     */
    public String slot() {
        return this.slot;
    }

}