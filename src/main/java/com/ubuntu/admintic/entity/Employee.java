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
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(unique = true, name= "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "transaction")
    private Transaction transaction;

    @JoinColumn(name = "profile")
    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;

    @Enumerated(EnumType.STRING)
    @Column(name = "Enum_RoleName", nullable = false)
    private Enum_RoleName Enum_RolName;

    @UpdateTimestamp
    @Column(name = "updateAt")
    private Date updateAt;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Date createdAt;
}