// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for a set of operations, such as:
 * PageBlob_uploadPages, PageBlob_clearPages, PageBlob_uploadPagesFromURL.
 */
@JacksonXmlRootElement(localName = "sequence-number-access-conditions")
public final class SequenceNumberAccessConditions {
    /**
     * Specify this header value to operate only on a blob if it has a sequence
     * number less than or equal to the specified.
     */
    @JsonProperty(value = "IfSequenceNumberLessThanOrEqualTo")
    private Long ifSequenceNumberLessThanOrEqualTo;

    /**
     * Specify this header value to operate only on a blob if it has a sequence
     * number less than the specified.
     */
    @JsonProperty(value = "IfSequenceNumberLessThan")
    private Long ifSequenceNumberLessThan;

    /**
     * Specify this header value to operate only on a blob if it has the
     * specified sequence number.
     */
    @JsonProperty(value = "IfSequenceNumberEqualTo")
    private Long ifSequenceNumberEqualTo;

    /**
     * Get the ifSequenceNumberLessThanOrEqualTo value.
     *
     * @return the ifSequenceNumberLessThanOrEqualTo value.
     */
    public Long ifSequenceNumberLessThanOrEqualTo() {
        return this.ifSequenceNumberLessThanOrEqualTo;
    }

    /**
     * Set the ifSequenceNumberLessThanOrEqualTo value.
     *
     * @param ifSequenceNumberLessThanOrEqualTo the
     * ifSequenceNumberLessThanOrEqualTo value to set.
     * @return the SequenceNumberAccessConditions object itself.
     */
    public SequenceNumberAccessConditions withIfSequenceNumberLessThanOrEqualTo(Long ifSequenceNumberLessThanOrEqualTo) {
        this.ifSequenceNumberLessThanOrEqualTo = ifSequenceNumberLessThanOrEqualTo;
        return this;
    }

    /**
     * Get the ifSequenceNumberLessThan value.
     *
     * @return the ifSequenceNumberLessThan value.
     */
    public Long ifSequenceNumberLessThan() {
        return this.ifSequenceNumberLessThan;
    }

    /**
     * Set the ifSequenceNumberLessThan value.
     *
     * @param ifSequenceNumberLessThan the ifSequenceNumberLessThan value to
     * set.
     * @return the SequenceNumberAccessConditions object itself.
     */
    public SequenceNumberAccessConditions withIfSequenceNumberLessThan(Long ifSequenceNumberLessThan) {
        this.ifSequenceNumberLessThan = ifSequenceNumberLessThan;
        return this;
    }

    /**
     * Get the ifSequenceNumberEqualTo value.
     *
     * @return the ifSequenceNumberEqualTo value.
     */
    public Long ifSequenceNumberEqualTo() {
        return this.ifSequenceNumberEqualTo;
    }

    /**
     * Set the ifSequenceNumberEqualTo value.
     *
     * @param ifSequenceNumberEqualTo the ifSequenceNumberEqualTo value to set.
     * @return the SequenceNumberAccessConditions object itself.
     */
    public SequenceNumberAccessConditions withIfSequenceNumberEqualTo(Long ifSequenceNumberEqualTo) {
        this.ifSequenceNumberEqualTo = ifSequenceNumberEqualTo;
        return this;
    }
}
