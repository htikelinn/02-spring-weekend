package com.jdc.mkt.entity;

import java.util.List;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "product_tbl")
@Check(constraints = "dt_price >= ws_price")
@NamedQuery(name = "countByProductDtPrice",
			query = "select count(p) from Product p where p.dtPrice between :from and :to")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(columnDefinition = "varchar(25) check(char_length(name) >= 5) default 'No Name'")
	private String name;

	@Column(name = "dt_price", nullable = false)
	private double dt_price;
	@Column(name = "ws_price", nullable = false)
	private double ws_price;

	@ColumnDefault("true")
	private boolean active;

	@ManyToOne
<<<<<<<< HEAD:04-hibernate-jpa/07-jpa-query/src/main/java/com/jdc/mkt/entity/Product.java
	private Category category ;
	
	@OneToMany(mappedBy = "product")
	private List<VoucherDetail> voucherDetails;
	
========
	// @JoinTable(name = "product_category_tbl")
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	@ManyToMany(mappedBy = "products")
	private List<Voucher> vouchers;

>>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b:04-hibernate-jpa/jap-query/src/main/java/com/jdc/mkt/entity/Product.java
}
