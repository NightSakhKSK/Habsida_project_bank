package com.bank.authorization.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table (name = "Audit")
public class Audit {
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

    public Audit(Long id, String entityType, String operationType, String createdBy, String modifiedBy, Timestamp createdAt, Timestamp modifiedAt, String newEntityJSON, String entityJSON) {
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

    public Audit() {
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
        if (!(o instanceof Audit)) return false;

        Audit audit = (Audit) o;

        if (getId() != null ? !getId().equals(audit.getId()) : audit.getId() != null) return false;
        if (getEntityType() != null ? !getEntityType().equals(audit.getEntityType()) : audit.getEntityType() != null)
            return false;
        if (getOperationType() != null ? !getOperationType().equals(audit.getOperationType()) : audit.getOperationType() != null)
            return false;
        if (getCreatedBy() != null ? !getCreatedBy().equals(audit.getCreatedBy()) : audit.getCreatedBy() != null)
            return false;
        if (getModifiedBy() != null ? !getModifiedBy().equals(audit.getModifiedBy()) : audit.getModifiedBy() != null)
            return false;
        if (getCreatedAt() != null ? !getCreatedAt().equals(audit.getCreatedAt()) : audit.getCreatedAt() != null)
            return false;
        if (getModifiedAt() != null ? !getModifiedAt().equals(audit.getModifiedAt()) : audit.getModifiedAt() != null)
            return false;
        if (getNewEntityJSON() != null ? !getNewEntityJSON().equals(audit.getNewEntityJSON()) : audit.getNewEntityJSON() != null)
            return false;
        return getEntityJSON() != null ? getEntityJSON().equals(audit.getEntityJSON()) : audit.getEntityJSON() == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEntityType(), getOperationType(), getCreatedBy(), getModifiedBy(), getCreatedAt(), getModifiedAt(), getNewEntityJSON(), getEntityJSON());
    }

    @Override
    public String toString() {
        return "Audit{" +
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
