package com.xinyan.sell.vo;

import com.xinyan.sell.enums.OrderStatus;
import com.xinyan.sell.enums.PayStatus;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
* @Description:    OrderMainList类  订单信息主表
* @Author:         Hp
* @CreateDate:     16/11/2018 16:52
* @UpdateUser:     Hp
* @UpdateDate:     16/11/2018 16:52
* @UpdateRemark:
* @Version:
*/

public class OrderMainListVo implements Serializable {
    /**
     * 实现Serializable，获取serialVersionUID，缓存OrderMainList对象信息
     */
    private static final long serialVersionUID = -1395574985103244624L;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 买家名称
     */
    private String buyerName;
    /**
     * 买家手机号
     */
    private String buyerPhone;
    /**
     * 买家地址
     */
    private String buyerAddress;
    /**
     * 买家OpenId
     * 唯一标识符
     */
    private String buyerOpenid;
    /**
     *订单总价格
     */
    private Integer orderAmount;
    /**
     *订单状态
     * SUCCESS(0,"成功"),
     * FAILED(1,"失败")
     */
    private OrderStatus orderStatus;
    /**
     *支付状态
     * WAIT(0,"未支付"),
     * FINISHED(1,"已支付")
     */
    private PayStatus payStatus;
    /**
     *订单创建时间
     * 一旦创建，不会更改
     */
    private Long createTime;
    /**
     *订单修改时间
     */
    private Long updateTime;
    /**
     *订单商品详情信息表
     */
    private OrderDetailListVo orderDetailListVo;

    public OrderMainListVo() {
    }

    public OrderMainListVo(String orderId) {
        this.orderId = orderId;
    }

    public OrderMainListVo(String orderId, String buyerName, String buyerPhone, String buyerAddress, String buyerOpenid, Integer orderAmount, OrderStatus orderStatus, PayStatus payStatus, Long createTime, Long updateTime, OrderDetailListVo orderDetailListVo) {
        this.orderId = orderId;
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.buyerAddress = buyerAddress;
        this.buyerOpenid = buyerOpenid;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
        this.payStatus = payStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.orderDetailListVo = orderDetailListVo;
    }

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

    public String getBuyerOpenid() {
        return buyerOpenid;
    }

    public void setBuyerOpenid(String buyerOpenid) {
        this.buyerOpenid = buyerOpenid;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public OrderDetailListVo getOrderDetailListVo() {
        return orderDetailListVo;
    }

    public void setOrderDetailListVo(OrderDetailListVo orderDetailListVo) {
        this.orderDetailListVo = orderDetailListVo;
    }

    @Override
    public String toString() {
        return "OrderMainListVo{" +
                "orderId='" + orderId + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", buyerAddress='" + buyerAddress + '\'' +
                ", buyerOpenid='" + buyerOpenid + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderStatus=" + orderStatus +
                ", payStatus=" + payStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", orderDetailListVo=" + orderDetailListVo +
                '}';
    }
}
