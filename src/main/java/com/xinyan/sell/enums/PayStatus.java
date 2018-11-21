package com.xinyan.sell.enums;

import lombok.Getter;

import java.io.Serializable;

/**
 * @Description: PayStatus枚举类   支付状态举例
 * @Author: Hp
 * @CreateDate: 16/11/2018 17:22
 * @UpdateUser: Hp
 * @UpdateDate: 16/11/2018 17:22
 * @UpdateRemark:
 * @Version:
 */
public enum PayStatus implements Serializable {
    WAIT(1, "未支付"),
    FINISHED(0, "已支付");

    /**
     * 支付状态码
     */
    private Integer code;
    /**
     * 支付状态信息
     */
    private String msg;

    PayStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
