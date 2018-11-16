package com.xinyan.sell.vo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data//data注解获取get方法,set方法和tostring方法
public class Order implements Serializable {
    private static final long serialVersionUID = 1731269387543124876L;
    //订单主人名字
    private String name ="jaerr";
    //订单主人电话
    private Integer phone=123456;
    //订单主人地址
    private String address="深圳宝安";
    //订单主人的微信openID
    private String openid ="fdfdllkdsg34325436";
    //封装集合对象items商品信息有多个对象
    private List<Product> items;

    {
        items = new ArrayList<>() ;

        items.add(new Product());
    }


    public static void main(String[] args) throws JsonProcessingException {
        String s = new ObjectMapper().writeValueAsString(new Order());
        System.out.println(s);
    }

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

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }
}
