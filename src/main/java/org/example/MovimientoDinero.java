package org.example;

import java.util.Date;

public class MovimientoDinero {
    long id;
    String concept;
    float amount;
    Date updatedAt;
    Date createdAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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

    public void agregarIngreso (long idEmpresa, float montoIngreso){
        System.out.println(idEmpresa);
        System.out.println(montoIngreso);
    }

    public void agregarEgreso (long idEmpresa, float montoEgreso){
        System.out.println(idEmpresa);
        System.out.println(montoEgreso);
    }

    public void verMovimiento (long idEmpresa){
        System.out.println(idEmpresa);
    }
}
