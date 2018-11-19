package com.xinyan.sell.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**

* @Description:    Detail 商品详情信息表
* @Author:         Hp
* @CreateDate:     17/11/2018 18:30
* @UpdateUser:     Hp
* @UpdateDate:     17/11/2018 18:30
* @UpdateRemark:
* @Version:
*/
@Entity(name = "tb_detail")
public class Detail implements Serializable {
    private static final long serialVersionUID = -6907727212568582223L;
    /**订单项详情id,唯一标识*/
    @Id
    private String detailId;
    /**订单项中，商品的id*/
    private String productId;
    /**商品的名字*/
    private String productName;
    /**商品的单价，单位：分*/
    private Long productPrice;
    /**商品的数量，单位：件*/
    private Integer productQuantity;
    /**商品的小图标，在商品列表时使用*/
    private String productIcon;
    /**商品的图片，在商品详情时使用*/
    private String productImage;
    /**订单项所属的订单id*/
    private String orderId ;

    public Detail() {
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
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

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
