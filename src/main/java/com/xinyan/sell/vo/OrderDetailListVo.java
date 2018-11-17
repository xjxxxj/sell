package com.xinyan.sell.vo;

import java.io.Serializable;

/**
* @Description:    OrderDetailList类  订单商品详情信息列表
* @Author:         Hp
* @CreateDate:     16/11/2018 16:44
* @UpdateUser:     Hp
* @UpdateDate:     16/11/2018 16:44
* @UpdateRemark:
* @Version:
*/

public class OrderDetailListVo implements Serializable {
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
    private String  productId;
    /**
     * 订单商品名称
     */
    private String productName;
    /**
     * 订单商品单价
     * Attention：和金钱交易有关的使用BigDecimal
     */
    private Double productPrice;
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

    public OrderDetailListVo(String detailId, String orderId, String productId, String productName, Double productPrice, Integer productQuantity, String productIcon, String productImage) {
        this.detailId = detailId;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productIcon = productIcon;
        this.productImage = productImage;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "OrderDetailListVo{" +
                "detailId='" + detailId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", productIcon='" + productIcon + '\'' +
                ", productImage='" + productImage + '\'' +
                '}';
    }
}
