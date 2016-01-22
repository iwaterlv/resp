package com.fh.enums;

/**
 * Created by M on 2016/1/12.
 */
public enum CustomerReason {

    BACK(0,"7天无理由退换货"),WRONG(1,"错发"),LEAK(2,"残次");

    private int key;

    private String reason;

    private CustomerReason(int key,String reason){
        this.key = key;
        this.reason = reason;
    }
}
