package org.example.tree;

public class ArrayNode extends AbstractNode {

    /**
     *
     */
    private String requiredChildren;

    public ArrayNode(Integer id, Integer parentId, String name, NodeType type, boolean requiredSign, boolean absoluteRequiredSign, String absolutePath) {
        super(id, parentId, name, type, requiredSign, absoluteRequiredSign, absolutePath);
    }

    public String getRequiredChildren() {
        return requiredChildren;
    }

    public void setRequiredChildren(String requiredChildren) {
        this.requiredChildren = requiredChildren;
    }
}
