package com.fh.enums;

/**
 * Created by M on 2016/1/12.
 */
public enum CustomerType {
    CHANGE(1,"换货"),BACK(1,"退货");

    private String name;

    private int key;

    private CustomerType(int key, String name){
        this.key = key;
        this.name = name;

    }
}
