package com.xinyan.sell.po;

import com.xinyan.sell.enums.OrderStatus;
import com.xinyan.sell.enums.PayStatus;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

/**

* @Description:    OrderMain 主订单列表对象
* @Author:         Hp
* @CreateDate:     17/11/2018 18:35
* @UpdateUser:     Hp
* @UpdateDate:     17/11/2018 18:35
* @UpdateRemark:
* @Version:
*/
@Entity
public class OrderMain implements Serializable {

    private static final long serialVersionUID = -3686024633074874350L;
    /**订单Id*/
    private String orderId;
    /**详情信息*/
    private String detailId;
    /**订单总金额*/
    private Double orderAmount;
    /**订单状态*/
    private OrderStatus orderStatus;
    /**支付状态*/
    private PayStatus payStatus;
    /**订单创建时间*/
    private Date createTime;
    /**订单修改时间*/
    private Date updateTime;

    public OrderMain() {
    }

    public OrderMain(String orderId, String detailId, Double orderAmount, OrderStatus orderStatus, PayStatus payStatus, Date createTime, Date updateTime) {
        this.orderId = orderId;
        this.detailId = detailId;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
        this.payStatus = payStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PayStatus getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(PayStatus payStatus) {
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

    @Override
    public String toString() {
        return "OrderMain{" +
                "orderId='" + orderId + '\'' +
                ", detailId='" + detailId + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderStatus=" + orderStatus +
                ", payStatus=" + payStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
