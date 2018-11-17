package com.xinyan.sell.form;

import java.io.Serializable;
import java.util.List;

/**
 * 封装创建订单参数
 */
public class OrderForm implements Serializable {
    private static final long serialVersionUID = 1731269387543124876L;
    /**订单主人名字*/
    private String name;
    /**订单主人电话*/
    private Integer phone;
    /**订单主人地址*/
    private String address;
    /**订单主人的微信openID*/
    private String openid;
    /**封装集合对象items商品信息有多个对象*/
    private List<ProductForm> items;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public List<ProductForm> getItems() {
        return items;
    }

    public void setItems(List<ProductForm> items) {
        this.items = items;
    }
}
