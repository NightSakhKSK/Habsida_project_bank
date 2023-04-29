package com.bank.authorization.entity;

import com.bank.authorization.listener.AuditUserListener;
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
import javax.persistence.EntityListeners;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")
@EntityListeners(AuditUserListener.class)
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false, name = "profile_id")
    private Long profileId;
    @Column(nullable = false)
    private String password;
}
