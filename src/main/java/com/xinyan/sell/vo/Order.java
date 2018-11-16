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

/**
 * 封装order订单人信息
 */
@Data//data注解获取get方法,set方法和tostring方法
public class Order implements Serializable {
    private static final long serialVersionUID = 1731269387543124876L;
    //订单主人名字
    private String name;
    //订单主人电话
    private Integer phone;
    //订单主人地址
    private String address;
    //订单主人的微信openID
    private String openid;
    //封装集合对象items商品信息有多个对象
    private List<Product> items;


}
