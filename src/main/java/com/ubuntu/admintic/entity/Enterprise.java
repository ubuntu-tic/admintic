package com.ubuntu.admintic.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "Enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private long id;

    @Column(unique = true, name = "name")
    private String name;

    @Column(unique = true, name = "document")
    private String document;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @JoinColumn(name = "employee")
    @ManyToOne
    private Employee employee;

    @JoinColumn(name = "transaction")
    @ManyToOne
    private Transaction transaction;

    @UpdateTimestamp
    @Column(name = "updateAt")
    private LocalDateTime updateAt;

    @CreationTimestamp
    @Column(name = "createdAt")
    private LocalDateTime createdAt;

}