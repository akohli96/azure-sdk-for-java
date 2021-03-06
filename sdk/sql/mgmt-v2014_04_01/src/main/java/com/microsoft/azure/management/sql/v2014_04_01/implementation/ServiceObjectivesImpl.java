/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.ServiceObjectives;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.ServiceObjective;

class ServiceObjectivesImpl extends WrapperImpl<ServiceObjectivesInner> implements ServiceObjectives {
    private final SqlManager manager;

    ServiceObjectivesImpl(SqlManager manager) {
        super(manager.inner().serviceObjectives());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    private ServiceObjectiveImpl wrapModel(ServiceObjectiveInner inner) {
        return  new ServiceObjectiveImpl(inner, manager());
    }

    @Override
    public Observable<ServiceObjective> listByServerAsync(String resourceGroupName, String serverName) {
        ServiceObjectivesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<ServiceObjectiveInner>, Observable<ServiceObjectiveInner>>() {
            @Override
            public Observable<ServiceObjectiveInner> call(List<ServiceObjectiveInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ServiceObjectiveInner, ServiceObjective>() {
            @Override
            public ServiceObjective call(ServiceObjectiveInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServiceObjective> getAsync(String resourceGroupName, String serverName, String serviceObjectiveName) {
        ServiceObjectivesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, serviceObjectiveName)
        .map(new Func1<ServiceObjectiveInner, ServiceObjective>() {
            @Override
            public ServiceObjective call(ServiceObjectiveInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
