package com.xinyan.sell.po;

import com.xinyan.sell.dto.CreateOrderDto;
import com.xinyan.sell.enums.OrderStatus;
import com.xinyan.sell.enums.PayStatus;
import com.xinyan.sell.form.CreateOrderForm;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**

* @Description:    OrderMain 订单对象
* @Author:         Hp
* @CreateDate:     17/11/2018 18:35
* @UpdateUser:     Hp
* @UpdateDate:     17/11/2018 18:35
* @UpdateRemark:
* @Version:
*/
@Entity(name = "tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 4062850551827287900L;
    /**订单Id*/
    @Id
    private String orderId;
    /**订单总金额，单位是元，计算得出*/
    private Double orderAmount;
    /**订单状态 ，1：订单已完成 ；9：未完成,默认未完成*/
    private int orderStatus = OrderStatus.FAILED.getCode();
    /**支付状态 ， 1：已支付 ；0：未支付，默认未支付*/
    private int payStatus = PayStatus.WAIT.getCode();
    /**订单创建时间*/
    private Date createTime;
    /**订单修改时间*/
    private Date updateTime;
    /**买家id*/
    private String buyerOpenId ;
    /**买家名字*/
    private String buyerName ;
    /**买家电话*/
    private String buyerPhone ;
    /**买家地址*/
    private String buyerAddress ;

    public Order(CreateOrderDto createOrderDto, List<OrderItemDetail> itemDetails){
        this.orderId = createOrderDto.getOrderid() ;
        this.orderAmount = 0.0 ;
        for(OrderItemDetail orderItemDetail : itemDetails){
            this.orderAmount += (orderItemDetail.getProductPrice() * orderItemDetail.getProductQuantity()) ;
        }
        this.createTime = new Date() ;
        this.buyerOpenId = createOrderDto.getCreateOrderForm().getOpenid() ;
        this.buyerName = createOrderDto.getCreateOrderForm().getName() ;
        this.buyerPhone = createOrderDto.getCreateOrderForm().getPhone() ;
        this.buyerAddress = createOrderDto.getCreateOrderForm().getAddress() ;

    }

    public Order() {
    }

    public int getPayStatus() {
        return payStatus;
    }

    public String getBuyerOpenId() {
        return buyerOpenId;
    }

    public void setBuyerOpenId(String buyerOpenId) {
        this.buyerOpenId = buyerOpenId;
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

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getOrderAmount() {
        return orderAmount.doubleValue();
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
