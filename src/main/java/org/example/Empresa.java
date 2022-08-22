package org.example;

import java.util.Date;

public class Empresa {

    //Attribute
    private long id;
    private String name;
    private String document;
    private String phone;
    private String adress;
    private Date updatedAt;
    private Date createdAt;

    //Builder


    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getDocument() {
        return document;
    }

    public void setDocument(java.lang.String document) {
        this.document = document;
    }

    public java.lang.String getPhone() {
        return phone;
    }

    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    public java.lang.String getAdress() {
        return adress;
    }

    public void setAdress(java.lang.String adress) {
        this.adress = adress;
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

    public void crearEmpresa (String nombreEmpresa, String correoEmpresa, String liderEmpresa){
        System.out.println(nombreEmpresa+ " " +correoEmpresa+" " +liderEmpresa);
    }
}


