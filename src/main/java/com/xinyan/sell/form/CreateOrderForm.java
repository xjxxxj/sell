package com.xinyan.sell.form;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @program: sell
 * @description: 买家创建订单请求参数封装
 * @author: 谢庆香
 * @create: 2018-11-20 15:32
 **/
public class CreateOrderForm {
    /**收货人姓名*/
    private String name ;
    /**收货人电话*/
    private String phone ;
    /**收货人地址*/
    private String address ;
    /**下单用户id*/
    private String openid ;
    /**订单项数据*/
    private List<LinkedHashMap<String , Integer>> items ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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

    public List<LinkedHashMap<String, Integer>> getItems() {
        return items;
    }

    public void setItems(String items) throws IOException {
       this.items = new ObjectMapper().readValue(items, ArrayList.class);
    }

}