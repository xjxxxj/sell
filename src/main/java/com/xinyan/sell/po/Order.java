package com.xinyan.sell.po;

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
    /**订单状态 ，0：*/
    private int orderStatus;
    /**支付状态*/
    private PayStatus payStatus;
    /**订单创建时间*/
    private Date createTime;
    /**订单修改时间*/
    private Date updateTime;
    /**商品的订单项列表*/
    private List<Detail> detailList ;

    public Order() {
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

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
        //同时计算出总金额
        if(detailList != null && detailList.size() > 0){
            this.orderAmount = 0L ;
            for(Detail detail : detailList){
                this.orderAmount += detail.getProductPrice() * detail.getProductQuantity() ;
            }
        }
    }
}
