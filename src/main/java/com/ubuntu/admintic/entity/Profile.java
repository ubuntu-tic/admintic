package com.ubuntu.admintic.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name= "image")
    private String image;

    @Column(name= "phone")
    private String phone;

//    @JoinColumn(name = "employee")
//    @OneToOne
//    private Employee employee;

    @UpdateTimestamp
    @Column(name = "updateAt")
    private Date updateAt;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Date createdAt;
}