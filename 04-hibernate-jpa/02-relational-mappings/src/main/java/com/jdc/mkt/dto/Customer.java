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

<<<<<<< HEAD
    
    
=======
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 45)
	private String name;

	@Enumerated(EnumType.STRING)
	private MemberType memberType;

	@OneToOne(mappedBy = "customer")
	private Contact contact;

	public enum MemberType {
		Silver, Gold, Platinum, Diamond
	}
>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b
}
