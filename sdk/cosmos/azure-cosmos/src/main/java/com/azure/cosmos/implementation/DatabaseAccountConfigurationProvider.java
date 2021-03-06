// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation;

import com.azure.cosmos.ConsistencyLevel;

/**
 * Defines an interface to work with database account configuration in the Azure Cosmos DB database service.
 */
public interface DatabaseAccountConfigurationProvider {
    ConsistencyLevel getStoreConsistencyPolicy();

    int getMaxReplicaSetSize();

    String getQueryEngineConfiguration();
}
