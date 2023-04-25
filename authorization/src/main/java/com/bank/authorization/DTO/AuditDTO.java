package com.bank.authorization.DTO;

import java.sql.Timestamp;

public class AuditDTO {
    private Long id;
    private String entityType;
    private String operationType;
    private String createdBy;
    private String modifiedBy;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private String newEntityJSON;
    private String entityJSON;

    public AuditDTO() {
    }

    public AuditDTO(Long id, String entityType, String operationType, String createdBy, String modifiedBy, Timestamp createdAt, Timestamp modifiedAt, String newEntityJSON, String entityJSON) {
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

}
