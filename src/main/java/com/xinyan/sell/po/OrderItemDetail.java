package com.xinyan.sell.po;

import com.xinyan.sell.utils.UUIDUtil;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**

* @Description:    Detail 订单项详情信息表
* @Author:         Hp
* @CreateDate:     17/11/2018 18:30
* @UpdateUser:     Hp
* @UpdateDate:     17/11/2018 18:30
* @UpdateRemark:
* @Version:
*/
@Entity(name = "tb_orderItem_detail")
public class OrderItemDetail implements Serializable {
    private static final long serialVersionUID = -6907727212568582223L;
    /**订单项详情id,唯一标识*/
    @Id
    private String detailId;
    /**订单项中，商品的id*/
    private Integer productId;
    /**商品的名字*/
    private String productName;
    /**商品的单价，单位：元*/
    private Double productPrice;
    /**商品的数量，单位：件*/
    private Integer productQuantity;
    /**商品的小图标，在商品列表时使用*/
    private String productIcon;
    /**商品的图片，在商品详情时使用*/
    private String productImage;
    /**订单项所属的订单id*/
    private String orderId ;

    public OrderItemDetail(ProductInfo productInfo){
        this.detailId = UUIDUtil.getCode32() ;
        this.productId = productInfo.getId() ;
        this.productName = productInfo.getName() ;
        this.productPrice = productInfo.getPrice() ;
        this.productIcon = this.getProductIcon() ;
        this.productImage = this.productIcon ;
    }

    public OrderItemDetail() {
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice.doubleValue()/100;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
