package com.bank.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false, unique = true, name = "profile_id")
    private Long profileId;
    @Column(nullable = false, unique = true)
    private String password;

    public User(Long id, String role, Long profileId, String password) {
        this.id = id;
        this.role = role;
        this.profileId = profileId;
        this.password = password;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getProfile_id() {
        return profileId;
    }

    public void setProfile_id(Long profile_id) {
        this.profileId = profile_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getRole(), user.getRole()) && Objects.equals(getProfile_id(), user.getProfile_id()) && Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRole(), getProfile_id(), getPassword());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", profile_id=" + profileId +
                ", password='" + password + '\'' +
                '}';
    }

}