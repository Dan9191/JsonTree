package org.example.tree;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Абстрактная модель узла.
 */
public abstract class AbstractNode implements BasicNode {

    /**
     * Id узла.
     */
    private Integer id;

    /**
     * Id узла родителя.
     */
    private Integer parentId;

    /**
     * Имя узла (может быть не уникальным).
     */
    private String name;

    /**
     * Тип узла.
     */
    private NodeType type;

    /**
     * Является ли данный узел обязательным у родителя.
     */
    private boolean requiredSign;

    /**
     * Является ли этот узел обязательным для Json схемы.
     */
    private boolean absoluteRequiredSign;

    /**
     * Абсолютный путь узла.
     */
    private String absolutePath;

    public AbstractNode(Integer id, Integer parentId, String name, NodeType type, boolean requiredSign, boolean absoluteRequiredSign, String absolutePath) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.type = type;
        this.requiredSign = requiredSign;
        this.absoluteRequiredSign = absoluteRequiredSign;
        this.absolutePath = absolutePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    public boolean isRequiredSign() {
        return requiredSign;
    }

    public void setRequiredSign(boolean requiredSign) {
        this.requiredSign = requiredSign;
    }

    public boolean isAbsoluteRequiredSign() {
        return absoluteRequiredSign;
    }

    public void setAbsoluteRequiredSign(boolean absoluteRequiredSign) {
        this.absoluteRequiredSign = absoluteRequiredSign;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }
}
