// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity HDFS source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HdfsSource")
@Fluent
public final class HdfsSource extends CopySource {
    /*
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * Specifies Distcp-related settings.
     */
    @JsonProperty(value = "distcpSettings")
    private DistcpSettings distcpSettings;

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the recursive value.
     */
    public Object getRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set.
     * @return the HdfsSource object itself.
     */
    public HdfsSource setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the distcpSettings property: Specifies Distcp-related settings.
     *
     * @return the distcpSettings value.
     */
    public DistcpSettings getDistcpSettings() {
        return this.distcpSettings;
    }

    /**
     * Set the distcpSettings property: Specifies Distcp-related settings.
     *
     * @param distcpSettings the distcpSettings value to set.
     * @return the HdfsSource object itself.
     */
    public HdfsSource setDistcpSettings(DistcpSettings distcpSettings) {
        this.distcpSettings = distcpSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HdfsSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HdfsSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HdfsSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
