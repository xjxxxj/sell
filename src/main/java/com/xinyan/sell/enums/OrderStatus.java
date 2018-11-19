package com.xinyan.sell.enums;

import lombok.Getter;

import java.io.Serializable;

/**
 * @Description: OrderStatus 枚举类  订单完成状态信息举例
 * @Author: Hp
 * @CreateDate: 16/11/2018 17:26
 * @UpdateUser: Hp
 * @UpdateDate: 16/11/2018 17:26
 * @UpdateRemark:
 * @Version:
 */

public enum OrderStatus implements Serializable {

    SUCCESS(0, "成功"),
    FAILED(1, "失败");
    /**
     * 订单状态码
     */
    private Integer code;
    /**
     * 订单状态信息
     */
    private String msg;

    OrderStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
