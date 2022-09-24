package com.ubuntu.admintic.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name= "concept")
    private String concept;

    @Column(name= "amount")
    private float amount;

    @UpdateTimestamp
    @Column(name = "updateAt")
    private LocalDateTime updateAt;

    @CreationTimestamp
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
}