package com.jdc.mkt.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customers_tbl")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    @Column(unique = true, length = 45, nullable = false)
    private String email;
    @Column(length = 45)
    private String primaryPhone;
    @Column(length = 45)
    private String secondaryPhone;

    
    
}
