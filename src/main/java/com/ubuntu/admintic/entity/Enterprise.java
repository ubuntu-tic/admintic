package com.ubuntu.admintic.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


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
    public long id;

    @Column(unique = true, name = "name", nullable = false)
    private String name;

    @Column(unique = true, name = "document", nullable = false)
    private String document;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @JoinColumn(name = "transaction")
    @ManyToOne
    private Transaction transaction;

    @UpdateTimestamp
    @Column(name = "updateAt")
    private Date updateAt;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Date createdAt;

}