/**
 * Copyright Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.serviceBus.implementation;

import com.microsoft.windowsazure.services.core.utils.ConnectionStringSyntaxException;
import com.microsoft.windowsazure.services.core.utils.ParsedConnectionString;

/**
 * Class that parses the fields present in a service bus connection string.
 *
 */
public class ServiceBusConnectionString extends ParsedConnectionString {

    /**
     * Construct the {@link ServiceBusConnectionString} instance with the
     * data from the given connection string
     * 
     * @param connectionString The connection string
     *                         
     * @throws ConnectionStringSyntaxException
     */
    public ServiceBusConnectionString(String connectionString) throws ConnectionStringSyntaxException {
        super(connectionString);
    }
    
    private String endpoint;
    private String stsEndpoint;
    private String sharedSecretIssuer;
    private String sharedSecretValue;

    /**
     * Get the endpoint from the connection string
     * @return the endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the endpoint value
     * @param endpoint
     */
    protected void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Get the StsEndpoint from the connection string
     * @return the sts endpoint
     */
    public String getStsEndpoint() {
        return stsEndpoint;
    }

    /**
     * Sets the StsEndpoint value
     * @param stsEndpoint
     */
    protected void setStsEndpoint(String stsEndpoint) {
        this.stsEndpoint = stsEndpoint;
    }

    /**
     * Get the shared secret issuer
     * @return the issuer
     */
    public String getSharedSecretIssuer() {
        return sharedSecretIssuer;
    }

    /**
     * Set the shared secret issuer
     * @param sharedSecretIssuer
     */
    protected void setSharedSecretIssuer(String sharedSecretIssuer) {
        this.sharedSecretIssuer = sharedSecretIssuer;
    }

    /**
     * Get the shared secret value
     * @return the shared secret value
     */
    public String getSharedSecretValue() {
        return sharedSecretValue;
    }

    /**
     * Set the shared secret value
     * @param sharedSecretValue
     */
    protected void setSharedSecretValue(String sharedSecretValue) {
        this.sharedSecretValue = sharedSecretValue;
    }
}
