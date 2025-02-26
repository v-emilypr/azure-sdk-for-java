// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** teamMessagingSettings. */
@Fluent
public final class MicrosoftGraphTeamMessagingSettings {
    /*
     * If set to true, @channel mentions are allowed.
     */
    @JsonProperty(value = "allowChannelMentions")
    private Boolean allowChannelMentions;

    /*
     * If set to true, owners can delete any message.
     */
    @JsonProperty(value = "allowOwnerDeleteMessages")
    private Boolean allowOwnerDeleteMessages;

    /*
     * If set to true, @team mentions are allowed.
     */
    @JsonProperty(value = "allowTeamMentions")
    private Boolean allowTeamMentions;

    /*
     * If set to true, users can delete their messages.
     */
    @JsonProperty(value = "allowUserDeleteMessages")
    private Boolean allowUserDeleteMessages;

    /*
     * If set to true, users can edit their messages.
     */
    @JsonProperty(value = "allowUserEditMessages")
    private Boolean allowUserEditMessages;

    /*
     * teamMessagingSettings
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the allowChannelMentions property: If set to true, @channel mentions are allowed.
     *
     * @return the allowChannelMentions value.
     */
    public Boolean allowChannelMentions() {
        return this.allowChannelMentions;
    }

    /**
     * Set the allowChannelMentions property: If set to true, @channel mentions are allowed.
     *
     * @param allowChannelMentions the allowChannelMentions value to set.
     * @return the MicrosoftGraphTeamMessagingSettings object itself.
     */
    public MicrosoftGraphTeamMessagingSettings withAllowChannelMentions(Boolean allowChannelMentions) {
        this.allowChannelMentions = allowChannelMentions;
        return this;
    }

    /**
     * Get the allowOwnerDeleteMessages property: If set to true, owners can delete any message.
     *
     * @return the allowOwnerDeleteMessages value.
     */
    public Boolean allowOwnerDeleteMessages() {
        return this.allowOwnerDeleteMessages;
    }

    /**
     * Set the allowOwnerDeleteMessages property: If set to true, owners can delete any message.
     *
     * @param allowOwnerDeleteMessages the allowOwnerDeleteMessages value to set.
     * @return the MicrosoftGraphTeamMessagingSettings object itself.
     */
    public MicrosoftGraphTeamMessagingSettings withAllowOwnerDeleteMessages(Boolean allowOwnerDeleteMessages) {
        this.allowOwnerDeleteMessages = allowOwnerDeleteMessages;
        return this;
    }

    /**
     * Get the allowTeamMentions property: If set to true, @team mentions are allowed.
     *
     * @return the allowTeamMentions value.
     */
    public Boolean allowTeamMentions() {
        return this.allowTeamMentions;
    }

    /**
     * Set the allowTeamMentions property: If set to true, @team mentions are allowed.
     *
     * @param allowTeamMentions the allowTeamMentions value to set.
     * @return the MicrosoftGraphTeamMessagingSettings object itself.
     */
    public MicrosoftGraphTeamMessagingSettings withAllowTeamMentions(Boolean allowTeamMentions) {
        this.allowTeamMentions = allowTeamMentions;
        return this;
    }

    /**
     * Get the allowUserDeleteMessages property: If set to true, users can delete their messages.
     *
     * @return the allowUserDeleteMessages value.
     */
    public Boolean allowUserDeleteMessages() {
        return this.allowUserDeleteMessages;
    }

    /**
     * Set the allowUserDeleteMessages property: If set to true, users can delete their messages.
     *
     * @param allowUserDeleteMessages the allowUserDeleteMessages value to set.
     * @return the MicrosoftGraphTeamMessagingSettings object itself.
     */
    public MicrosoftGraphTeamMessagingSettings withAllowUserDeleteMessages(Boolean allowUserDeleteMessages) {
        this.allowUserDeleteMessages = allowUserDeleteMessages;
        return this;
    }

    /**
     * Get the allowUserEditMessages property: If set to true, users can edit their messages.
     *
     * @return the allowUserEditMessages value.
     */
    public Boolean allowUserEditMessages() {
        return this.allowUserEditMessages;
    }

    /**
     * Set the allowUserEditMessages property: If set to true, users can edit their messages.
     *
     * @param allowUserEditMessages the allowUserEditMessages value to set.
     * @return the MicrosoftGraphTeamMessagingSettings object itself.
     */
    public MicrosoftGraphTeamMessagingSettings withAllowUserEditMessages(Boolean allowUserEditMessages) {
        this.allowUserEditMessages = allowUserEditMessages;
        return this;
    }

    /**
     * Get the additionalProperties property: teamMessagingSettings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: teamMessagingSettings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamMessagingSettings object itself.
     */
    public MicrosoftGraphTeamMessagingSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
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
