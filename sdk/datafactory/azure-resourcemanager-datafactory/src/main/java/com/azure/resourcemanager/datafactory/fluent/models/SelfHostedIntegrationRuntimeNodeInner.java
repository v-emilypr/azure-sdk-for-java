// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeUpdateResult;
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeNodeStatus;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Properties of Self-hosted integration runtime node. */
@Fluent
public final class SelfHostedIntegrationRuntimeNodeInner {
    /*
     * Name of the integration runtime node.
     */
    @JsonProperty(value = "nodeName", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeName;

    /*
     * Machine name of the integration runtime node.
     */
    @JsonProperty(value = "machineName", access = JsonProperty.Access.WRITE_ONLY)
    private String machineName;

    /*
     * URI for the host machine of the integration runtime.
     */
    @JsonProperty(value = "hostServiceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String hostServiceUri;

    /*
     * Status of the integration runtime node.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private SelfHostedIntegrationRuntimeNodeStatus status;

    /*
     * The integration runtime capabilities dictionary
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> capabilities;

    /*
     * Status of the integration runtime node version.
     */
    @JsonProperty(value = "versionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String versionStatus;

    /*
     * Version of the integration runtime node.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The time at which the integration runtime node was registered in ISO8601
     * format.
     */
    @JsonProperty(value = "registerTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime registerTime;

    /*
     * The most recent time at which the integration runtime was connected in
     * ISO8601 format.
     */
    @JsonProperty(value = "lastConnectTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastConnectTime;

    /*
     * The time at which the integration runtime will expire in ISO8601 format.
     */
    @JsonProperty(value = "expiryTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expiryTime;

    /*
     * The time the node last started up.
     */
    @JsonProperty(value = "lastStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastStartTime;

    /*
     * The integration runtime node last stop time.
     */
    @JsonProperty(value = "lastStopTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastStopTime;

    /*
     * The result of the last integration runtime node update.
     */
    @JsonProperty(value = "lastUpdateResult", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeUpdateResult lastUpdateResult;

    /*
     * The last time for the integration runtime node update start.
     */
    @JsonProperty(value = "lastStartUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastStartUpdateTime;

    /*
     * The last time for the integration runtime node update end.
     */
    @JsonProperty(value = "lastEndUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastEndUpdateTime;

    /*
     * Indicates whether this node is the active dispatcher for integration
     * runtime requests.
     */
    @JsonProperty(value = "isActiveDispatcher", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isActiveDispatcher;

    /*
     * Maximum concurrent jobs on the integration runtime node.
     */
    @JsonProperty(value = "concurrentJobsLimit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer concurrentJobsLimit;

    /*
     * The maximum concurrent jobs in this integration runtime.
     */
    @JsonProperty(value = "maxConcurrentJobs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxConcurrentJobs;

    /*
     * Properties of Self-hosted integration runtime node.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the nodeName property: Name of the integration runtime node.
     *
     * @return the nodeName value.
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Get the machineName property: Machine name of the integration runtime node.
     *
     * @return the machineName value.
     */
    public String machineName() {
        return this.machineName;
    }

    /**
     * Get the hostServiceUri property: URI for the host machine of the integration runtime.
     *
     * @return the hostServiceUri value.
     */
    public String hostServiceUri() {
        return this.hostServiceUri;
    }

    /**
     * Get the status property: Status of the integration runtime node.
     *
     * @return the status value.
     */
    public SelfHostedIntegrationRuntimeNodeStatus status() {
        return this.status;
    }

    /**
     * Get the capabilities property: The integration runtime capabilities dictionary.
     *
     * @return the capabilities value.
     */
    public Map<String, String> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the versionStatus property: Status of the integration runtime node version.
     *
     * @return the versionStatus value.
     */
    public String versionStatus() {
        return this.versionStatus;
    }

    /**
     * Get the version property: Version of the integration runtime node.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the registerTime property: The time at which the integration runtime node was registered in ISO8601 format.
     *
     * @return the registerTime value.
     */
    public OffsetDateTime registerTime() {
        return this.registerTime;
    }

    /**
     * Get the lastConnectTime property: The most recent time at which the integration runtime was connected in ISO8601
     * format.
     *
     * @return the lastConnectTime value.
     */
    public OffsetDateTime lastConnectTime() {
        return this.lastConnectTime;
    }

    /**
     * Get the expiryTime property: The time at which the integration runtime will expire in ISO8601 format.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Get the lastStartTime property: The time the node last started up.
     *
     * @return the lastStartTime value.
     */
    public OffsetDateTime lastStartTime() {
        return this.lastStartTime;
    }

    /**
     * Get the lastStopTime property: The integration runtime node last stop time.
     *
     * @return the lastStopTime value.
     */
    public OffsetDateTime lastStopTime() {
        return this.lastStopTime;
    }

    /**
     * Get the lastUpdateResult property: The result of the last integration runtime node update.
     *
     * @return the lastUpdateResult value.
     */
    public IntegrationRuntimeUpdateResult lastUpdateResult() {
        return this.lastUpdateResult;
    }

    /**
     * Get the lastStartUpdateTime property: The last time for the integration runtime node update start.
     *
     * @return the lastStartUpdateTime value.
     */
    public OffsetDateTime lastStartUpdateTime() {
        return this.lastStartUpdateTime;
    }

    /**
     * Get the lastEndUpdateTime property: The last time for the integration runtime node update end.
     *
     * @return the lastEndUpdateTime value.
     */
    public OffsetDateTime lastEndUpdateTime() {
        return this.lastEndUpdateTime;
    }

    /**
     * Get the isActiveDispatcher property: Indicates whether this node is the active dispatcher for integration runtime
     * requests.
     *
     * @return the isActiveDispatcher value.
     */
    public Boolean isActiveDispatcher() {
        return this.isActiveDispatcher;
    }

    /**
     * Get the concurrentJobsLimit property: Maximum concurrent jobs on the integration runtime node.
     *
     * @return the concurrentJobsLimit value.
     */
    public Integer concurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }

    /**
     * Get the maxConcurrentJobs property: The maximum concurrent jobs in this integration runtime.
     *
     * @return the maxConcurrentJobs value.
     */
    public Integer maxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    /**
     * Get the additionalProperties property: Properties of Self-hosted integration runtime node.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Properties of Self-hosted integration runtime node.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SelfHostedIntegrationRuntimeNodeInner object itself.
     */
    public SelfHostedIntegrationRuntimeNodeInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
