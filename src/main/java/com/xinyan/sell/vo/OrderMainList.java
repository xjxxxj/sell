package com.xinyan.sell.vo;

import com.xinyan.sell.enums.OrderStatus;
import com.xinyan.sell.enums.PayStatus;
import lombok.Data;

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
@Data
public class OrderMainList implements Serializable {
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
    private BigDecimal orderAmount;
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
    private Date createTime;
    /**
     *订单修改时间
     */
    private Date updateTime;
    /**
     *订单商品详情信息表
     */
    private OrderDetailList orderDetailList;

}
