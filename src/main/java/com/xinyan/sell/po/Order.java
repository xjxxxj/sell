package com.xinyan.sell.po;

import com.xinyan.sell.enums.OrderStatus;
import com.xinyan.sell.enums.PayStatus;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**

* @Description:    OrderMain 主订单列表对象
* @Author:         Hp
* @CreateDate:     17/11/2018 18:35
* @UpdateUser:     Hp
* @UpdateDate:     17/11/2018 18:35
* @UpdateRemark:
* @Version:
*/
@Entity(name = "tb_order")
public class Order {
    /**订单Id*/
    @Id
    private String orderId;
    /**订单总金额，单位是分*/
    private Long orderAmount;
    /**订单状态 ，0：订单已完成 ；1：未完成,默认未完成*/
    private int orderStatus = OrderStatus.FAILED.getCode();
    /**支付状态 ， 0：已支付 ；1：未支付，默认未支付*/
    private int payStatus = PayStatus.WAIT.getCode();
    /**订单创建时间*/
    private Date createTime;
    /**订单修改时间*/
    private Date updateTime;

    public Order() {
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public Date getCreateTime() {
        if(this.createTime == null){
            this.createTime = new Date() ;
        }
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        if(this.updateTime == null){
            this.updateTime = new Date() ;
        }
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
