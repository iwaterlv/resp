package com.fh.entity.customer;

import com.fh.entity.BaseEntity;

/**
 * Created by M on 2016/1/12.
 */
public class CustomerDetail extends BaseEntity {

    /**id*/
    private int CustomerDetailId;

    /**关联退货ID*/
    private int  customerId;

    /**关联产品ID*/
    private int productId;

    /**数量*/
    private int counts;

    public CustomerDetail() {
    }

    public int getCustomerDetailId() {
        return CustomerDetailId;
    }

    public void setCustomerDetailId(int customerDetailId) {
        CustomerDetailId = customerDetailId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }
}
