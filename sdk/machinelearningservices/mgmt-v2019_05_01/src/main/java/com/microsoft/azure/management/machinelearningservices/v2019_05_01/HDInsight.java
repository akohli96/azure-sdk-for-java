/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A HDInsight compute.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("HDInsight")
public class HDInsight extends Compute {
    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private HDInsightProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public HDInsightProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the HDInsight object itself.
     */
    public HDInsight withProperties(HDInsightProperties properties) {
        this.properties = properties;
        return this;
    }

}
