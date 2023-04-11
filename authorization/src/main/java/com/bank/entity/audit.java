package com.bank.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table (name = "audit")
public class audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "entity_type", nullable = false)
    private String entityType;

    @Column(name = "operation_type", nullable = false)
    private String operationType;
    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Column(name = "modifiedBy")
    private String modifiedBy;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @Column(name = "new_entity_json")
    private String newEntityJSON;

    @Column(name = "entity_json", nullable = false)
    private String entityJSON;

    public audit(Long id, String entityType, String operationType, String createdBy, String modifiedBy, Timestamp createdAt, Timestamp modifiedAt, String newEntityJSON, String entityJSON) {
        this.id = id;
        this.entityType = entityType;
        this.operationType = operationType;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.newEntityJSON = newEntityJSON;
        this.entityJSON = entityJSON;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getNewEntityJSON() {
        return newEntityJSON;
    }

    public void setNewEntityJSON(String newEntityJSON) {
        this.newEntityJSON = newEntityJSON;
    }

    public String getEntityJSON() {
        return entityJSON;
    }

    public void setEntityJSON(String entityJSON) {
        this.entityJSON = entityJSON;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof audit audit)) return false;
        return Objects.equals(getId(), audit.getId()) && Objects.equals(getEntityType(), audit.getEntityType()) && Objects.equals(getOperationType(), audit.getOperationType()) && Objects.equals(getCreatedBy(), audit.getCreatedBy()) && Objects.equals(getModifiedBy(), audit.getModifiedBy()) && Objects.equals(getCreatedAt(), audit.getCreatedAt()) && Objects.equals(getModifiedAt(), audit.getModifiedAt()) && Objects.equals(getNewEntityJSON(), audit.getNewEntityJSON()) && Objects.equals(getEntityJSON(), audit.getEntityJSON());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEntityType(), getOperationType(), getCreatedBy(), getModifiedBy(), getCreatedAt(), getModifiedAt(), getNewEntityJSON(), getEntityJSON());
    }

    @Override
    public String toString() {
        return "audit{" +
                "id=" + id +
                ", entityType='" + entityType + '\'' +
                ", operationType='" + operationType + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", newEntityJSON='" + newEntityJSON + '\'' +
                ", entityJSON='" + entityJSON + '\'' +
                '}';
    }
}
