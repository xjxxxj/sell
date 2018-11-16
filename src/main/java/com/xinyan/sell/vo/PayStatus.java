package com.xinyan.sell.vo;

import lombok.Getter;

@Getter
public enum PayStatus {
    WAIT(0,"未支付"),
    FINISHED(1,"已支付");


    private Integer code;
    private String msg;

    PayStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
