package com.jdc.mkt.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class VoucherDetailPk {
    
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;
    private int vouncherId;
    private int productId;
}
