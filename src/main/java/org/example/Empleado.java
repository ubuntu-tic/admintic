package org.example;

import java.util.Date;

public class Empleado {
    long id;
    String email;
    String profile;
    String role;
    long enterprise;
    Date updatedAt;
    Date createdAt;

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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(long enterprise) {
        this.enterprise = enterprise;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void agregarEmpleado (String nombreEmpleado, String correoEmpleado, String rolEmpleado, long idEmpresa){
        System.out.println(nombreEmpleado);
    }
}
