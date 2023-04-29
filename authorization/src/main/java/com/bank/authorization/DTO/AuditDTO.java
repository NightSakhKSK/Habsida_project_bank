package com.bank.authorization.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

}
