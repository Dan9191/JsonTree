package org.example.tree;

import lombok.Getter;

@Getter
public enum ServiceField {

    REQUIRED("required"),
    PROPERTIES("properties"),
    TYPE("type"),
    ITEMS("items"),
    DESCRIPTION("description");

    private final String serviceField;

    ServiceField(String serviceField) {
        this.serviceField = serviceField;
    }
}
