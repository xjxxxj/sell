package com.xinyan.sell.po;

import javax.persistence.Entity;
import javax.persistence.Id;

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
public class Detail {
    @Id
    private String detailId;
    private String productId;
    private String productName;
    private Double productPrice;
    private Integer productQuantity;
    private String productIcon;
    private String productImage;

    public Detail() {
    }

    public Detail(String detailId, String productId, String productName, Double productPrice, Integer productQuantity, String productIcon, String productImage) {
        this.detailId = detailId;
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
        return "OrderDetailList{" +
                "detailId='" + detailId + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", productIcon='" + productIcon + '\'' +
                ", productImage='" + productImage + '\'' +
                '}';
    }
}
