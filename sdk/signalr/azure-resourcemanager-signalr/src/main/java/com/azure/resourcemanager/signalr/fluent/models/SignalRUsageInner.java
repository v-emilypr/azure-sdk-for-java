// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.signalr.models.SignalRUsageName;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Object that describes a specific usage of the resources. */
@Fluent
public final class SignalRUsageInner {
    /*
     * Fully qualified ARM resource id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Current value for the usage quota.
     */
    @JsonProperty(value = "currentValue")
    private Long currentValue;

    /*
     * The maximum permitted value for the usage quota. If there is no limit,
     * this value will be -1.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /*
     * Localizable String object containing the name and a localized value.
     */
    @JsonProperty(value = "name")
    private SignalRUsageName name;

    /*
     * Representing the units of the usage quota. Possible values are: Count,
     * Bytes, Seconds, Percent, CountPerSecond, BytesPerSecond.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Get the id property: Fully qualified ARM resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified ARM resource id.
     *
     * @param id the id value to set.
     * @return the SignalRUsageInner object itself.
     */
    public SignalRUsageInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the currentValue property: Current value for the usage quota.
     *
     * @return the currentValue value.
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: Current value for the usage quota.
     *
     * @param currentValue the currentValue value to set.
     * @return the SignalRUsageInner object itself.
     */
    public SignalRUsageInner withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the limit property: The maximum permitted value for the usage quota. If there is no limit, this value will be
     * -1.
     *
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The maximum permitted value for the usage quota. If there is no limit, this value will be
     * -1.
     *
     * @param limit the limit value to set.
     * @return the SignalRUsageInner object itself.
     */
    public SignalRUsageInner withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: Localizable String object containing the name and a localized value.
     *
     * @return the name value.
     */
    public SignalRUsageName name() {
        return this.name;
    }

    /**
     * Set the name property: Localizable String object containing the name and a localized value.
     *
     * @param name the name value to set.
     * @return the SignalRUsageInner object itself.
     */
    public SignalRUsageInner withName(SignalRUsageName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: Representing the units of the usage quota. Possible values are: Count, Bytes, Seconds,
     * Percent, CountPerSecond, BytesPerSecond.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Representing the units of the usage quota. Possible values are: Count, Bytes, Seconds,
     * Percent, CountPerSecond, BytesPerSecond.
     *
     * @param unit the unit value to set.
     * @return the SignalRUsageInner object itself.
     */
    public SignalRUsageInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
