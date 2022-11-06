package org.example.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.example.tree.ArrayNode;
import org.example.tree.NodeType;
import org.example.tree.ObjectNode;
import org.example.tree.StringNode;

public class TreeCreator {

    public StringNode createStringNode(String nodeName, ObjectNode parentNode, JsonNode jsonNode) {
        boolean requiredSign = parentNode.getRequiredChildren().contains(nodeName);
        return new StringNode(
                1, //id - перписать
                parentNode.getParentId(),
                nodeName,
                NodeType.STRING_NODE,
                requiredSign,
                parentNode.isAbsoluteRequiredSign() && requiredSign,
                String.format("%s/%s", parentNode.getAbsolutePath(), nodeName)
        );
    }

    public StringNode createStringNode(String nodeName, ArrayNode parentNode, JsonNode jsonNode) {
        boolean requiredSign = parentNode.getRequiredChildren().equals(nodeName);
        return new StringNode(
                1, //id - перписать
                parentNode.getParentId(),
                nodeName,
                NodeType.STRING_NODE,
                requiredSign,
                parentNode.isAbsoluteRequiredSign() && requiredSign,
                String.format("%s/%s", parentNode.getAbsolutePath(), nodeName)
        );
    }
}
