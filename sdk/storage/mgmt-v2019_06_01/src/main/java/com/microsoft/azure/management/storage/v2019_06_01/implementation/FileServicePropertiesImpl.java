/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.management.storage.v2019_06_01.FileServiceProperties;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.storage.v2019_06_01.CorsRules;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_06_01.DeleteRetentionPolicy;
import rx.functions.Func1;

class FileServicePropertiesImpl extends CreatableUpdatableImpl<FileServiceProperties, FileServicePropertiesInner, FileServicePropertiesImpl> implements FileServiceProperties, FileServiceProperties.Definition, FileServiceProperties.Update {
    private final StorageManager manager;
    private String resourceGroupName;
    private String accountName;
    private CorsRules ccors;
    private DeleteRetentionPolicy cshareDeleteRetentionPolicy;
    private CorsRules ucors;
    private DeleteRetentionPolicy ushareDeleteRetentionPolicy;

    FileServicePropertiesImpl(String name, StorageManager manager) {
        super(name, new FileServicePropertiesInner());
        this.manager = manager;
        // Set resource name
        this.accountName = name;
        //
        this.ccors = new CorsRules();
        this.cshareDeleteRetentionPolicy = new DeleteRetentionPolicy();
        this.ucors = new CorsRules();
        this.ushareDeleteRetentionPolicy = new DeleteRetentionPolicy();
    }

    FileServicePropertiesImpl(FileServicePropertiesInner inner, StorageManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.accountName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccounts");
        //
        this.ccors = new CorsRules();
        this.cshareDeleteRetentionPolicy = new DeleteRetentionPolicy();
        this.ucors = new CorsRules();
        this.ushareDeleteRetentionPolicy = new DeleteRetentionPolicy();
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public Observable<FileServiceProperties> createResourceAsync() {
        FileServicesInner client = this.manager().inner().fileServices();
        return client.setServicePropertiesAsync(this.resourceGroupName, this.accountName, this.ccors, this.cshareDeleteRetentionPolicy)
            .map(new Func1<FileServicePropertiesInner, FileServicePropertiesInner>() {
               @Override
               public FileServicePropertiesInner call(FileServicePropertiesInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FileServiceProperties> updateResourceAsync() {
        FileServicesInner client = this.manager().inner().fileServices();
        return client.setServicePropertiesAsync(this.resourceGroupName, this.accountName, this.ucors, this.ushareDeleteRetentionPolicy)
            .map(new Func1<FileServicePropertiesInner, FileServicePropertiesInner>() {
               @Override
               public FileServicePropertiesInner call(FileServicePropertiesInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FileServicePropertiesInner> getInnerAsync() {
        FileServicesInner client = this.manager().inner().fileServices();
        return client.getServicePropertiesAsync(this.resourceGroupName, this.accountName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.ccors = new CorsRules();
        this.cshareDeleteRetentionPolicy = new DeleteRetentionPolicy();
        this.ucors = new CorsRules();
        this.ushareDeleteRetentionPolicy = new DeleteRetentionPolicy();
    }

    @Override
    public CorsRules cors() {
        return this.inner().cors();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DeleteRetentionPolicy shareDeleteRetentionPolicy() {
        return this.inner().shareDeleteRetentionPolicy();
    }

    @Override
    public SkuInner sku() {
        return this.inner().sku();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FileServicePropertiesImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public FileServicePropertiesImpl withCors(CorsRules cors) {
        if (isInCreateMode()) {
            this.ccors = cors;
        } else {
            this.ucors = cors;
        }
        return this;
    }

    @Override
    public FileServicePropertiesImpl withShareDeleteRetentionPolicy(DeleteRetentionPolicy shareDeleteRetentionPolicy) {
        if (isInCreateMode()) {
            this.cshareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
        } else {
            this.ushareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
        }
        return this;
    }

}
