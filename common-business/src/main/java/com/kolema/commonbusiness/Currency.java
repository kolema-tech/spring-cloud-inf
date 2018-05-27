package com.kolema.commonbusiness;

/**
 * Summary:
 * @author zhenpeng
 * Desc: https://www.currency-iso.org/dam/downloads/lists/list_one.xml
 */
public enum Currency {
    /**
     * 港幣
     */
    HKD(344),
    /**
     * 台幣
     */
    TWD(901);

    private int code;

    private Currency(int code) {
        this.code = code;
    }
}
