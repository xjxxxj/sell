package com.xinyan.sell.vo;

import lombok.Getter;

@Getter
public enum OrderStatus {
    SUCCESS(0,"成功"),
    FAILED(1,"失败");

    private Integer code;
    private String msg;

    OrderStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
