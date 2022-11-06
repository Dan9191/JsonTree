package org.example.tree;

import java.util.Collection;

public class ObjectNode extends AbstractNode {

    /**
     * Список обязательных дочерних узлов.
     */
    private Collection<String> requiredChildren;

    public ObjectNode(Integer id, Integer parentId, String name, NodeType type, boolean requiredSign,
                      boolean absoluteRequiredSign, String absolutePath, Collection<String> requiredChildren) {
        super(id, parentId, name, type, requiredSign, absoluteRequiredSign, absolutePath);
        this.requiredChildren = requiredChildren;
    }

    public Collection<String> getRequiredChildren() {
        return requiredChildren;
    }

    public void setRequiredChildren(Collection<String> requiredChildren) {
        this.requiredChildren = requiredChildren;
    }
}
