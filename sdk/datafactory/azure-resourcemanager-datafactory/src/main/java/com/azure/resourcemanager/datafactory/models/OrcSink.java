// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity ORC sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OrcSink")
@Fluent
public final class OrcSink extends CopySink {
    /*
     * ORC store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreWriteSettings storeSettings;

    /*
     * ORC format settings.
     */
    @JsonProperty(value = "formatSettings")
    private OrcWriteSettings formatSettings;

    /**
     * Get the storeSettings property: ORC store settings.
     *
     * @return the storeSettings value.
     */
    public StoreWriteSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: ORC store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the OrcSink object itself.
     */
    public OrcSink withStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: ORC format settings.
     *
     * @return the formatSettings value.
     */
    public OrcWriteSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: ORC format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the OrcSink object itself.
     */
    public OrcSink withFormatSettings(OrcWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrcSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (storeSettings() != null) {
            storeSettings().validate();
        }
        if (formatSettings() != null) {
            formatSettings().validate();
        }
    }
}
