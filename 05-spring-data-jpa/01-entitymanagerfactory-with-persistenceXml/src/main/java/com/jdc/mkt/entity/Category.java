package com.jdc.mkt.entity;
<<<<<<<< HEAD:05-spring-data-jpa/01-entitymanagerfactory-with-persistenceXml/src/main/java/com/jdc/mkt/entity/Category.java
========

import java.util.List;
>>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b:04-hibernate-jpa/jap-query/src/main/java/com/jdc/mkt/entity/Category.java

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "category_tbl")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="category_id")
	private int id;
	
	@Column(nullable = false,length = 45,unique = true)
	private String name;
	
	@ColumnDefault("true")
	private boolean active;
<<<<<<<< HEAD:05-spring-data-jpa/01-entitymanagerfactory-with-persistenceXml/src/main/java/com/jdc/mkt/entity/Category.java
========

	@OneToMany(mappedBy = "category")
	private List<Product> products;
	
//	@OneToMany
//	//@JoinColumn(name = "category_id")
//	@JoinTable(
//			name = "j_cat_product_tbl",
//			joinColumns = {
//					@JoinColumn(name = "cat_id",referencedColumnName = "cat_id")
//			},
//			inverseJoinColumns = {
//					@JoinColumn(name = "prod_id",referencedColumnName = "id")
//			})
//	private List<Product> proudcts;
	
>>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b:04-hibernate-jpa/jap-query/src/main/java/com/jdc/mkt/entity/Category.java
}
