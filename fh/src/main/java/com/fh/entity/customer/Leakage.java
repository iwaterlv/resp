package com.fh.entity.customer;

/**
 * Created by M on 2016/1/12.
 */

import com.fh.entity.BaseEntity;

import java.util.Date;

/**漏发实体*/
public class Leakage extends BaseEntity {
    /**标识ID*/
    private Integer id;

    /**淘宝会员号*/
    private String tbId;

    /**问题描述及解决方案*/
    private String prodesc;

    /**补发单号*/
    private String expressNo;

    /**提出人ID*/
    private String operateId;

    /**日期*/
    private Date date;

    /**问题解决进度   客服提出-库房处理-通知客户*/
    private String proprocess;

    /**问题解决状态*/
    private String prostate;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTbId() {
        return tbId;
    }

    public void setTbId(String tbId) {
        this.tbId = tbId;
    }



    public String getProdesc() {
        return prodesc;
    }

    public void setProdesc(String prodesc) {
        this.prodesc = prodesc;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getOperateId() {
        return operateId;
    }

    public void setOperateId(String operateId) {
        this.operateId = operateId;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }

    public String getProprocess() {
        return proprocess;
    }

    public void setProprocess(String proprocess) {
        this.proprocess = proprocess;
    }


}

