/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a NotificationHub BaiduCredential.
 */
public class BaiduCredentialProperties {
    /**
     * Get or Set Baidu Api Key.
     */
    @JsonProperty(value = "baiduApiKey")
    private String baiduApiKey;

    /**
     * Get or Set Baidu Endpoint.
     */
    @JsonProperty(value = "baiduEndPoint")
    private String baiduEndPoint;

    /**
     * Get or Set Baidu Secret Key.
     */
    @JsonProperty(value = "baiduSecretKey")
    private String baiduSecretKey;

    /**
     * Get get or Set Baidu Api Key.
     *
     * @return the baiduApiKey value
     */
    public String baiduApiKey() {
        return this.baiduApiKey;
    }

    /**
     * Set get or Set Baidu Api Key.
     *
     * @param baiduApiKey the baiduApiKey value to set
     * @return the BaiduCredentialProperties object itself.
     */
    public BaiduCredentialProperties withBaiduApiKey(String baiduApiKey) {
        this.baiduApiKey = baiduApiKey;
        return this;
    }

    /**
     * Get get or Set Baidu Endpoint.
     *
     * @return the baiduEndPoint value
     */
    public String baiduEndPoint() {
        return this.baiduEndPoint;
    }

    /**
     * Set get or Set Baidu Endpoint.
     *
     * @param baiduEndPoint the baiduEndPoint value to set
     * @return the BaiduCredentialProperties object itself.
     */
    public BaiduCredentialProperties withBaiduEndPoint(String baiduEndPoint) {
        this.baiduEndPoint = baiduEndPoint;
        return this;
    }

    /**
     * Get get or Set Baidu Secret Key.
     *
     * @return the baiduSecretKey value
     */
    public String baiduSecretKey() {
        return this.baiduSecretKey;
    }

    /**
     * Set get or Set Baidu Secret Key.
     *
     * @param baiduSecretKey the baiduSecretKey value to set
     * @return the BaiduCredentialProperties object itself.
     */
    public BaiduCredentialProperties withBaiduSecretKey(String baiduSecretKey) {
        this.baiduSecretKey = baiduSecretKey;
        return this;
    }

}
