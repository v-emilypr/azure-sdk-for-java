// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;

/** RecoveryPoint Tier Information V2. */
@Fluent
public final class RecoveryPointTierInformationV2 extends RecoveryPointTierInformation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPointTierInformationV2.class);

    /** {@inheritDoc} */
    @Override
    public RecoveryPointTierInformationV2 withType(RecoveryPointTierType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RecoveryPointTierInformationV2 withStatus(RecoveryPointTierStatus status) {
        super.withStatus(status);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RecoveryPointTierInformationV2 withExtendedInfo(Map<String, String> extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
