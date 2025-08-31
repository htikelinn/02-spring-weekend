package com.jdc.mkt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name", columnDefinition="varchar(30)")
    private String firstName;
    @Column(name = "last_name", columnDefinition="varchar(30)")
    private String lastName;
    @Column(name = "email", columnDefinition="varchar(40)")
    private String email;


    // @OneToOne
    // @JoinColumn(name = "address_id", insertable = false, updatable = false)
    // // @PrimaryKeyJoinColumn(name = "address_id")
    // private Address address;

}
