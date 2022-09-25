package com.ubuntu.admintic.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="email", unique = true)
    public String email;

    @Column(name="image")
    private String image;

    @Column(name="auth0Id", unique = true)
    private String auth0Id;//id unico proporcionado por AOuth0


    public User(String email, String image, String auth0Id){
        this.email = email;
        this.image=image;
        this.auth0Id=auth0Id;
    }

}
