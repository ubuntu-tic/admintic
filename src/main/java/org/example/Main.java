package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        long id = 0;
        String name = "";
        String document = "";
        String phone = "";
        String address = "";
        Date updatedAt = new Date();
        Date createdAt = new Date();
        Empresa miEmpresa= new Empresa(id, name, phone, address, updatedAt, createdAt);

    }
}