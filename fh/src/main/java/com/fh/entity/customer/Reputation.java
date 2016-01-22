package com.fh.entity.customer;

/**
 * Created by M on 2016/1/12.
 */
/**好评*/
public class Reputation {
    /**好评id*/
    private int reputationId;

    /**淘宝会员*/
    private String tbId;

    /**返现金额*/
    private double sums;

    /**返现原因*/
    private String reason;

    public Reputation() {
    }

    public int getReputationId() {
        return reputationId;
    }

    public void setReputationId(int reputationId) {
        this.reputationId = reputationId;
    }

    public String getTbId() {
        return tbId;
    }

    public void setTbId(String tbId) {
        this.tbId = tbId;
    }

    public double getSums() {
        return sums;
    }

    public void setSums(double sums) {
        this.sums = sums;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
