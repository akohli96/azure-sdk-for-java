/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.DatabaseBlobAuditingPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DatabaseBlobAuditingPolicies.
 */
public interface DatabaseBlobAuditingPolicies extends SupportsCreating<DatabaseBlobAuditingPolicy.DefinitionStages.Blank>, HasInner<DatabaseBlobAuditingPoliciesInner> {
    /**
     * Gets a database's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseBlobAuditingPolicy> getAsync(String resourceGroupName, String serverName, String databaseName);

}
