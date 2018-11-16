package com.xinyan.sell.vo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderMainList {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private Integer orderAmount;
    private OrderStatus orderStatus;
    private PayStatus payStatus;
    private Date createTime;
    private Date updateTime;
    private OrderDetailList orderDetailList;

}
