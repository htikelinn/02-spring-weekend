package main.java.com.jdc.mkt.entity;

public class VoucherDetailPk {
    
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;
    private int vouncherId;
    private int productId;
}
