package com.fh.entity.customer;

/**
 * Created by M on 2016/1/12.
 */
public class Product {
    /** id*/
    private int productId;

    /** 商品名*/
    private String productName;

    /** 商品简称*/
    private String productShortName;

    /** 规格*/
    private String spec;

    /** 重量*/
    private int weight;

    /** 成本价*/
    private int costPrice;

    /** 库存数量*/
    private int counts;

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }
}
