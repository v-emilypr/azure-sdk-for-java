// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ODBC table dataset properties. */
@Fluent
public final class OdbcTableDatasetTypeProperties {
    /*
     * The ODBC table name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "tableName")
    private Object tableName;

    /**
     * Get the tableName property: The ODBC table name. Type: string (or Expression with resultType string).
     *
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The ODBC table name. Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set.
     * @return the OdbcTableDatasetTypeProperties object itself.
     */
    public OdbcTableDatasetTypeProperties withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
