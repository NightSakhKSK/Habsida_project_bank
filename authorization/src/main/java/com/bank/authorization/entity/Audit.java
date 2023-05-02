package com.bank.authorization.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;

import java.sql.Timestamp;


@Entity
@Table(name = "Audit")
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
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

    public Audit(long l, String s, String create, String s1, String system, Timestamp from) {
    }
}
