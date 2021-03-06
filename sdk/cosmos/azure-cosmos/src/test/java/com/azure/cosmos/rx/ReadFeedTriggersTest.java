// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.rx;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosPagedFlux;
import com.azure.cosmos.CosmosTriggerProperties;
import com.azure.cosmos.FeedOptions;
import com.azure.cosmos.TriggerOperation;
import com.azure.cosmos.TriggerType;
import com.azure.cosmos.implementation.FeedResponseListValidator;
import com.azure.cosmos.implementation.FeedResponseValidator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ReadFeedTriggersTest extends TestSuiteBase {

    private CosmosAsyncContainer createdCollection;
    private List<CosmosTriggerProperties> createdTriggers = new ArrayList<>();

    private CosmosAsyncClient client;

    @Factory(dataProvider = "clientBuildersWithDirect")
    public ReadFeedTriggersTest(CosmosClientBuilder clientBuilder) {
        super(clientBuilder);
    }

    @Test(groups = { "simple" }, timeOut = FEED_TIMEOUT)
    public void readTriggers() throws Exception {

        FeedOptions options = new FeedOptions();
        options.setMaxItemCount(2);

        CosmosPagedFlux<CosmosTriggerProperties> feedObservable = createdCollection.getScripts().readAllTriggers(options);
        int maxItemCount = 2;
        int expectedPageSize = (createdTriggers.size() + options.getMaxItemCount() - 1) / options.getMaxItemCount();

        FeedResponseListValidator<CosmosTriggerProperties> validator = new FeedResponseListValidator.Builder<CosmosTriggerProperties>()
                .totalSize(createdTriggers.size())
                .exactlyContainsInAnyOrder(
                        createdTriggers.stream().map(d -> d.getResourceId()).collect(Collectors.toList()))
                .numberOfPages(expectedPageSize)
                .allPagesSatisfy(new FeedResponseValidator.Builder<CosmosTriggerProperties>()
                        .requestChargeGreaterThanOrEqualTo(1.0).build())
                .build();
        validateQuerySuccess(feedObservable.byPage(maxItemCount), validator, FEED_TIMEOUT);
    }

    @BeforeClass(groups = { "simple" }, timeOut = SETUP_TIMEOUT)
    public void before_ReadFeedTriggersTest() {
        client = clientBuilder().buildAsyncClient();
        createdCollection = getSharedMultiPartitionCosmosContainer(client);
        truncateCollection(createdCollection);

        for (int i = 0; i < 5; i++) {
            this.createdTriggers.add(this.createTriggers(createdCollection));
        }

        waitIfNeededForReplicasToCatchUp(clientBuilder());
    }

    @AfterClass(groups = { "simple" }, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeClose(client);
    }

    public CosmosTriggerProperties createTriggers(CosmosAsyncContainer cosmosContainer) {
        CosmosTriggerProperties trigger = new CosmosTriggerProperties();
        trigger.setId(UUID.randomUUID().toString());
        trigger.setBody("function() {var x = 10;}");
        trigger.setTriggerOperation(TriggerOperation.CREATE);
        trigger.setTriggerType(TriggerType.PRE);
        return cosmosContainer.getScripts().createTrigger(trigger).block().getProperties();
    }
}
