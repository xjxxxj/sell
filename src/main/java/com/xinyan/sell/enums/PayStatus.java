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
@Getter
public enum PayStatus implements Serializable {
    WAIT(0, "未支付"),
    FINISHED(1, "已支付");

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
}
