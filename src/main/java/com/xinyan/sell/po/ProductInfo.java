package com.xinyan.sell.po;

import javax.persistence.Entity;
import javax.persistence.Id;

/**

* @Description:    ProductInfo  商品信息列表
* @Author:         Hp
* @CreateDate:     19/11/2018 10:04
* @UpdateUser:     Hp
* @UpdateDate:     19/11/2018 10:04
* @UpdateRemark:
* @Version:
*/
@Entity(name = "tb_product_info")
public class ProductInfo {
    /**商品Id*/
    @Id
    private String productId;
    /**商品名称*/
    private String productName;
    /**商品单价*/
    private Double productPrice;
    /**商品描述*/
    private String description;
    /**商品图标*/
    private String productIcon;
    /**商品所属类目名*/
    private String categoryName;
    /**商品类目类型*/
    private Integer categoryType;

    public ProductInfo() {
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", description='" + description + '\'' +
                ", productIcon='" + productIcon + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }

    public ProductInfo(String productId, String productName, Double productPrice, String description, String productIcon, String categoryName, Integer categoryType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.description = description;
        this.productIcon = productIcon;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}
