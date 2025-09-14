package com.jdc.mkt.dto;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "voucher_detail_tbl")
public class VoucherDetail {

	@EmbeddedId
	private VoucherDetailPk id;
	
	private int qty;
	private double subTotal;
	
//	@ManyToOne
//	//@MapsId("productId")
//	//@JoinColumn(insertable = false,updatable = false)
//	private Product product;
//	
//	@ManyToOne
//	//@MapsId("voucherId")
//	//@JoinColumn(insertable = false,updatable = false)
//	private Voucher voucher;
}
