package com.xinyan.sell.vo;


import lombok.Data;


import java.io.Serializable;
import java.math.BigDecimal;
/**
* @Description:    OrderDetailList类  订单商品详情信息表
* @Author:         Hp
* @CreateDate:     16/11/2018 16:44
* @UpdateUser:     Hp
* @UpdateDate:     16/11/2018 16:44
* @UpdateRemark:
* @Version:
*/
@Data
public class OrderDetailList implements Serializable {
    /**
     * 实现Serializable，获取serialVersionUID，缓存OrderDetailList对象信息
     */
    private static final long serialVersionUID = -6267470651070790231L;
    /**
     *订单详情主键Id
     */
    private String detailId;
    /**
     * 订单Id
     */
    private String orderId;
    /**
     * 订单商品Id
     */
    private Integer productId;
    /**
     * 订单商品名称
     */
    private String productName;
    /**
     * 订单商品单价
     * Attention：和金钱交易有关的使用BigDecimal
     */
    private BigDecimal productPrice;
    /**
     * 订单商品数量
     */
    private Integer productQuantity;
    /**
     * 订单商品图标
     */
    private String productIcon;
    /**
     * 订单商品展示图片
     */
    private String productImage;


}
