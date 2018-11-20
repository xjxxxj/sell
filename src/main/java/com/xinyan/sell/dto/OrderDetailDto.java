package com.xinyan.sell.dto;

import com.xinyan.sell.po.OrderItemDetail;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: sell
 * @description: 订单详情的dto类
 * @author: 谢庆香
 * @create: 2018-11-20 23:09
 **/
public class OrderDetailDto implements Serializable {

    private static final long serialVersionUID = -1432079744889353695L;
    /**订单id*/
    private String orderId;
    /**订单总金额，单位是元，计算得出*/
    private Double orderAmount;
    /**订单状态 ，0：订单已完成 ；1：未完成,默认未完成*/
    private int orderStatus ;
    /**支付状态 ， 0：已支付 ；1：未支付，默认未支付*/
    private int payStatus ;
    /**订单创建时间*/
    private Date createTime;
    /**订单修改时间*/
    private Date updateTime;
    /**买家id*/
    private String buyerOpenid ;
    /**买家名字*/
    private String buyerName ;
    /**买家电话*/
    private String buyerPhone ;
    /**买家地址*/
    private String buyerAddress ;
    /**订单项详情*/
    private List<OrderItemDetail> orderDetailList ;

    public OrderDetailDto(String orderId, String buyerOpenid) {
        this.orderId = orderId;
        this.buyerOpenid = buyerOpenid;
    }

    public OrderDetailDto() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBuyerOpenid() {
        return buyerOpenid;
    }

    public void setBuyerOpenid(String buyerOpenid) {
        this.buyerOpenid = buyerOpenid;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public List<OrderItemDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderItemDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}