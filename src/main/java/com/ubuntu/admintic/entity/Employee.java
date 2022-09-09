package com.ubuntu.admintic.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name= "email", unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "profile_id", updatable = false, nullable = false)
    private Profile profile;

    @Column(name="role")
    private Enum_RoleName role;

    @ManyToOne(fetch = FetchType.LAZY)
    private Enterprise enterprise;

    @Column(name="updateAt")
    private Date updateAt;

    @Column(name="createdAT")
    private Date createdAt;

    public Employee (){

    }

    public Employee(long id, String email, Profile profile, Enum_RoleName role, Enterprise enterprise, Date updateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        //this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getRole() {
        return role;
    }

    public void setRole(Enum_RoleName role) {
        this.role = role;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}