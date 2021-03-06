/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2015_08_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create Or Update Consumer Group operation.
 */
@JsonFlatten
public class ConsumerGroupCreateOrUpdateParameters {
    /**
     * Location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * ARM type of the Namespace.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Name of the consumer group.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The path of the Event Hub.
     */
    @JsonProperty(value = "properties.eventHubPath", access = JsonProperty.Access.WRITE_ONLY)
    private String eventHubPath;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * The user metadata.
     */
    @JsonProperty(value = "properties.userMetadata")
    private String userMetadata;

    /**
     * Get location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location of the resource.
     *
     * @param location the location value to set
     * @return the ConsumerGroupCreateOrUpdateParameters object itself.
     */
    public ConsumerGroupCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get aRM type of the Namespace.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set aRM type of the Namespace.
     *
     * @param type the type value to set
     * @return the ConsumerGroupCreateOrUpdateParameters object itself.
     */
    public ConsumerGroupCreateOrUpdateParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get name of the consumer group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the consumer group.
     *
     * @param name the name value to set
     * @return the ConsumerGroupCreateOrUpdateParameters object itself.
     */
    public ConsumerGroupCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get exact time the message was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the path of the Event Hub.
     *
     * @return the eventHubPath value
     */
    public String eventHubPath() {
        return this.eventHubPath;
    }

    /**
     * Get the exact time the message was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the user metadata.
     *
     * @return the userMetadata value
     */
    public String userMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the user metadata.
     *
     * @param userMetadata the userMetadata value to set
     * @return the ConsumerGroupCreateOrUpdateParameters object itself.
     */
    public ConsumerGroupCreateOrUpdateParameters withUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

}
