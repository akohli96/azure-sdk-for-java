/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.implementation.DataLakeStoreManager;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.implementation.DataLakeStoreAccountInner;

/**
 * Type representing DataLakeStoreAccount.
 */
public interface DataLakeStoreAccount extends HasInner<DataLakeStoreAccountInner>, Resource, GroupableResourceCore<DataLakeStoreManager, DataLakeStoreAccountInner>, HasResourceGroup, Refreshable<DataLakeStoreAccount>, Updatable<DataLakeStoreAccount.Update>, HasManager<DataLakeStoreManager> {
    /**
     * @return the identity value.
     */
    EncryptionIdentity identity();

    /**
     * @return the properties value.
     */
    DataLakeStoreAccountProperties properties();

    /**
     * The entirety of the DataLakeStoreAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DataLakeStoreAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DataLakeStoreAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DataLakeStoreAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the datalakestoreaccount definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Key vault encryption identity, if any
             * @return the next definition stage
             */
            WithCreate withIdentity(EncryptionIdentity identity);
        }

        /**
         * The stage of the datalakestoreaccount definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the Data Lake Store account properties
             * @return the next definition stage
             */
            WithCreate withProperties(DataLakeStoreAccountProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DataLakeStoreAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithIdentity, DefinitionStages.WithProperties {
        }
    }
    /**
     * The template for a DataLakeStoreAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DataLakeStoreAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithIdentity, UpdateStages.WithProperties {
    }

    /**
     * Grouping of DataLakeStoreAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the datalakestoreaccount update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The Key vault encryption identity, if any
             * @return the next update stage
             */
            Update withIdentity(EncryptionIdentity identity);
        }

        /**
         * The stage of the datalakestoreaccount update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the Data Lake Store account properties
             * @return the next update stage
             */
            Update withProperties(DataLakeStoreAccountProperties properties);
        }

    }
}
