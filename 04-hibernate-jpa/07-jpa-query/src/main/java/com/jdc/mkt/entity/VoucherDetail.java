package com.jdc.mkt.entity;
<<<<<<<< HEAD:04-hibernate-jpa/07-jpa-query/src/main/java/com/jdc/mkt/entity/VoucherDetail.java
========


>>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b:04-hibernate-jpa/jap-query/src/main/java/com/jdc/mkt/entity/VoucherDetail.java

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "voucher_detail_tbl")
public class VoucherDetail {

<<<<<<<< HEAD:04-hibernate-jpa/07-jpa-query/src/main/java/com/jdc/mkt/entity/VoucherDetail.java
	@EmbeddedId
	private VoucherDetailPk id;
	
	private int qty;
	private double subTotal;
	
	@ManyToOne
	@MapsId("productId")
	//@JoinColumn(insertable = false,updatable = false)
	private Product product;
	
	@ManyToOne
	@MapsId("voucherId")
	//@JoinColumn(insertable = false,updatable = false)
	private Voucher voucher;
========
   @EmbeddedId
   private VoucherDetailPk id;
   private int qty;
   private double subTotal;
   @ManyToOne
   private Product product; 
   @ManyToOne
   private Voucher voucher;
>>>>>>>> c1472228983a317981676c25ffba6e7cfe0e2c8b:04-hibernate-jpa/jap-query/src/main/java/com/jdc/mkt/entity/VoucherDetail.java
}
