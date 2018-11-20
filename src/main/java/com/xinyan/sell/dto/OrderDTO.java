package com.xinyan.sell.dto;

import com.xinyan.sell.enums.OrderStatus;
import com.xinyan.sell.enums.PayStatus;

import java.util.Date;

/**
 * @program：sell
 * @Auther:李显君
 * @Date: 2018/11/19 17 :46
 */
public class OrderDTO {
    /**订单id*/
    private String orderId;
    /**卖家名字*/
    private String buyerName;
    /**卖家电话*/
    private String buyerPhone;
    /**卖家地址*/
    private String buyerAddress;
    /**订单总金额*/
    private Long orderAmount;
    /**订单状态 ，0：订单已完成 ；1：未完成,默认未完成*/
    private int orderStatus = OrderStatus.FAILED.getCode();
    /**支付状态 ， 0：已支付 ；1：未支付，默认未支付*/
    private int payStatus = PayStatus.WAIT.getCode();
    /**订单创建时间*/
    private Date createTime;
    /**订单修改时间*/
    private Date updateTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
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
}
