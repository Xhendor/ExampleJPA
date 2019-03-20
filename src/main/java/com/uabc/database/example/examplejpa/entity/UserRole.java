package com.uabc.database.example.examplejpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_roles", uniqueConstraints = @UniqueConstraint(
        columnNames = {"role", "username"}
))
public class UserRole {
    @Id
    @GeneratedValue
    @Column(name = "user_role_id", unique = true, nullable = false)
    private Integer userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "username", nullable = false)
    private User user;

    @Column(name = "role", nullable = false, length = 45)
    private String role;

    public UserRole(){

    }

    public UserRole(User user, String role) {
        this.user = user;
        this.role = role;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
