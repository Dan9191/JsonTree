package org.example.tree;

import lombok.Getter;

@Getter
public enum NodeType {
    OBJECT_NODE ("Object"),
    ARRAY_NODE ("Array"),
    STRING_NODE ("String"),
    DATE_NODE ("Date");

    private String type;

    NodeType(String type) {
        this.type = type;
    }
}
