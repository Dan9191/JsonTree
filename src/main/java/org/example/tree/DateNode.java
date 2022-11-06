package org.example.tree;

public class DateNode extends AbstractNode {
    public DateNode(Integer id, Integer parentId, String name, NodeType type, boolean requiredSign, boolean absoluteRequiredSign, String absolutePath) {
        super(id, parentId, name, type, requiredSign, absoluteRequiredSign, absolutePath);
    }
}
