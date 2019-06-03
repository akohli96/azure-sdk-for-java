/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.EndpointDependency;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoints accessed for a common purpose that the App Service Environment
 * requires outbound network access to.
 */
public class OutboundEnvironmentEndpointInner {
    /**
     * The type of service accessed by the App Service Environment, e.g., Azure
     * Storage, Azure SQL Database, and Azure Active Directory.
     */
    @JsonProperty(value = "category")
    private String category;

    /**
     * The endpoints that the App Service Environment reaches the service at.
     */
    @JsonProperty(value = "endpoints")
    private List<EndpointDependency> endpoints;

    /**
     * Get the type of service accessed by the App Service Environment, e.g., Azure Storage, Azure SQL Database, and Azure Active Directory.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the type of service accessed by the App Service Environment, e.g., Azure Storage, Azure SQL Database, and Azure Active Directory.
     *
     * @param category the category value to set
     * @return the OutboundEnvironmentEndpointInner object itself.
     */
    public OutboundEnvironmentEndpointInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the endpoints that the App Service Environment reaches the service at.
     *
     * @return the endpoints value
     */
    public List<EndpointDependency> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints that the App Service Environment reaches the service at.
     *
     * @param endpoints the endpoints value to set
     * @return the OutboundEnvironmentEndpointInner object itself.
     */
    public OutboundEnvironmentEndpointInner withEndpoints(List<EndpointDependency> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

}