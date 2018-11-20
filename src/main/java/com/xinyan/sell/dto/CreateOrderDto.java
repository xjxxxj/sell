package com.xinyan.sell.dto;

import com.xinyan.sell.form.CreateOrderForm;
import com.xinyan.sell.utils.UUIDUtil;

/**
 * @program: sell
 * @description: 创建订单的dto对象
 * @author: 谢庆香
 * @create: 2018-11-20 20:20
 **/
public class CreateOrderDto {

    /**订单号*/
    private String orderid ;
    /**创建订单传递的数据*/
    private CreateOrderForm createOrderForm ;

    public CreateOrderDto(CreateOrderForm createOrderForm) {
        this.createOrderForm = createOrderForm;
        this.orderid = UUIDUtil.getCode32() ;
    }

    public CreateOrderDto() {
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public CreateOrderForm getCreateOrderForm() {
        return createOrderForm;
    }

    public void setCreateOrderForm(CreateOrderForm createOrderForm) {
        this.createOrderForm = createOrderForm;
    }
}