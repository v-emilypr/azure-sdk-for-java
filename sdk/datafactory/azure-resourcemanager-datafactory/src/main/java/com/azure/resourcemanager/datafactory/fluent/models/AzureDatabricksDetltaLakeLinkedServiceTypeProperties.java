// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Databricks Delta Lake linked service properties. */
@Fluent
public final class AzureDatabricksDetltaLakeLinkedServiceTypeProperties {
    /*
     * <REGION>.azuredatabricks.net, domain name of your Databricks deployment.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "domain", required = true)
    private Object domain;

    /*
     * Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "accessToken")
    private SecretBase accessToken;

    /*
     * The id of an existing interactive cluster that will be used for all runs
     * of this job. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "clusterId")
    private Object clusterId;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /*
     * Workspace resource id for databricks REST API. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "workspaceResourceId")
    private Object workspaceResourceId;

    /**
     * Get the domain property: &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type:
     * string (or Expression with resultType string).
     *
     * @return the domain value.
     */
    public Object domain() {
        return this.domain;
    }

    /**
     * Set the domain property: &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type:
     * string (or Expression with resultType string).
     *
     * @param domain the domain value to set.
     * @return the AzureDatabricksDetltaLakeLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksDetltaLakeLinkedServiceTypeProperties withDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the accessToken property: Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param accessToken the accessToken value to set.
     * @return the AzureDatabricksDetltaLakeLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksDetltaLakeLinkedServiceTypeProperties withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the clusterId property: The id of an existing interactive cluster that will be used for all runs of this job.
     * Type: string (or Expression with resultType string).
     *
     * @return the clusterId value.
     */
    public Object clusterId() {
        return this.clusterId;
    }

    /**
     * Set the clusterId property: The id of an existing interactive cluster that will be used for all runs of this job.
     * Type: string (or Expression with resultType string).
     *
     * @param clusterId the clusterId value to set.
     * @return the AzureDatabricksDetltaLakeLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksDetltaLakeLinkedServiceTypeProperties withClusterId(Object clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureDatabricksDetltaLakeLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksDetltaLakeLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureDatabricksDetltaLakeLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksDetltaLakeLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the workspaceResourceId property: Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     *
     * @return the workspaceResourceId value.
     */
    public Object workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set the workspaceResourceId property: Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     *
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the AzureDatabricksDetltaLakeLinkedServiceTypeProperties object itself.
     */
    public AzureDatabricksDetltaLakeLinkedServiceTypeProperties withWorkspaceResourceId(Object workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domain() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property domain in model"
                            + " AzureDatabricksDetltaLakeLinkedServiceTypeProperties"));
        }
        if (accessToken() != null) {
            accessToken().validate();
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER =
        new ClientLogger(AzureDatabricksDetltaLakeLinkedServiceTypeProperties.class);
}
