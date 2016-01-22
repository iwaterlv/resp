package com.fh.entity.customer;

import com.fh.entity.BaseEntity;
import com.fh.entity.Page;

import java.util.Date;

/**
 * Created by M on 2016/1/12.
 */
public class Customer extends BaseEntity {

    private Integer customerId;

    /**
     * 淘宝会员号
     */
    private String tbId;

    /**
     * 退货日期
     */
    private Date backDate;

    /**
     * 手机号
     */
    private String phoneNo;

    /**
     * 售后类别
     */
    private int customerType;

    /**
     * 退货快递公司
     */
    private String backExpress;

    /**
     * 退货快递单号
     */
    private String backExpressNo;

    /**
     * 退货原因
     */
    private int customerReason;

    /**
     * 处理方法
     */
    private String resolve;

    /**
     * 换货快递单号
     */
    private String expressNo;

    /**
     * 换货快递公司
     */
    private String express;

    /**
     * 完成状态
     */
    private String status;

    /**
     * 备注
     */
    private String mark;

    private Page page;

    public Customer() {
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getTbId() {
        return tbId;
    }

    public void setTbId(String tbId) {
        this.tbId = tbId;
    }

    public Date getBackDate() {
        return backDate;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public String getBackExpress() {
        return backExpress;
    }

    public void setBackExpress(String backExpress) {
        this.backExpress = backExpress;
    }

    public String getBackExpressNo() {
        return backExpressNo;
    }

    public void setBackExpressNo(String backExpressNo) {
        this.backExpressNo = backExpressNo;
    }

    public int getCustomerReason() {
        return customerReason;
    }

    public void setCustomerReason(int customerReason) {
        this.customerReason = customerReason;
    }

    public String getResolve() {
        return resolve;
    }

    public void setResolve(String resolve) {
        this.resolve = resolve;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
