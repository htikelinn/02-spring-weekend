package com.jdc.mkt.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vouchers")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "sales_date", columnDefinition = "date default(current_date)")
    private LocalDate salesDate;
    @Column(name = "sales_time", columnDefinition = "time default(current_time)")
    private LocalTime salesTime;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Product> products;

<<<<<<< HEAD
=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "date default(current_date)")
    private LocalDate saleDate;
    @Column(columnDefinition = "time default(current_time)")
    private LocalTime saleTime;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Product> products;
>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b
}
