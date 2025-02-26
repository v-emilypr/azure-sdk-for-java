// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.InboundNatPoolPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Inbound NAT pool of the load balancer. */
@Fluent
public final class InboundNatPool extends SubResource {
    /*
     * Properties of load balancer inbound nat pool.
     */
    @JsonProperty(value = "properties")
    private InboundNatPoolPropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within the set of inbound NAT
     * pools used by the load balancer. This name can be used to access the
     * resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of load balancer inbound nat pool.
     *
     * @return the innerProperties value.
     */
    private InboundNatPoolPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within the set of inbound NAT pools used by the
     * load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of inbound NAT pools used by the
     * load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public InboundNatPool withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendIpConfiguration();
    }

    /**
     * Set the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatPoolPropertiesFormat();
        }
        this.innerProperties().withFrontendIpConfiguration(frontendIpConfiguration);
        return this;
    }

    /**
     * Get the protocol property: The reference to the transport protocol used by the inbound NAT pool.
     *
     * @return the protocol value.
     */
    public TransportProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The reference to the transport protocol used by the inbound NAT pool.
     *
     * @param protocol the protocol value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withProtocol(TransportProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatPoolPropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @return the frontendPortRangeStart value.
     */
    public Integer frontendPortRangeStart() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendPortRangeStart();
    }

    /**
     * Set the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65534.
     *
     * @param frontendPortRangeStart the frontendPortRangeStart value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendPortRangeStart(Integer frontendPortRangeStart) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatPoolPropertiesFormat();
        }
        this.innerProperties().withFrontendPortRangeStart(frontendPortRangeStart);
        return this;
    }

    /**
     * Get the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @return the frontendPortRangeEnd value.
     */
    public Integer frontendPortRangeEnd() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendPortRangeEnd();
    }

    /**
     * Set the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide Inbound Nat to NICs associated with a load balancer. Acceptable values range between 1 and 65535.
     *
     * @param frontendPortRangeEnd the frontendPortRangeEnd value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withFrontendPortRangeEnd(Integer frontendPortRangeEnd) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatPoolPropertiesFormat();
        }
        this.innerProperties().withFrontendPortRangeEnd(frontendPortRangeEnd);
        return this;
    }

    /**
     * Get the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 1 and 65535.
     *
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.innerProperties() == null ? null : this.innerProperties().backendPort();
    }

    /**
     * Set the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 1 and 65535.
     *
     * @param backendPort the backendPort value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withBackendPort(Integer backendPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatPoolPropertiesFormat();
        }
        this.innerProperties().withBackendPort(backendPort);
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.innerProperties() == null ? null : this.innerProperties().idleTimeoutInMinutes();
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatPoolPropertiesFormat();
        }
        this.innerProperties().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    /**
     * Get the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIp value.
     */
    public Boolean enableFloatingIp() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFloatingIp();
    }

    /**
     * Set the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @param enableFloatingIp the enableFloatingIp value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withEnableFloatingIp(Boolean enableFloatingIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatPoolPropertiesFormat();
        }
        this.innerProperties().withEnableFloatingIp(enableFloatingIp);
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    public Boolean enableTcpReset() {
        return this.innerProperties() == null ? null : this.innerProperties().enableTcpReset();
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the InboundNatPool object itself.
     */
    public InboundNatPool withEnableTcpReset(Boolean enableTcpReset) {
        if (this.innerProperties() == null) {
            this.innerProperties = new InboundNatPoolPropertiesFormat();
        }
        this.innerProperties().withEnableTcpReset(enableTcpReset);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the inbound NAT pool resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
