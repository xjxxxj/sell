package com.xinyan.sell.form;

import java.io.Serializable;

/**
 * 封装product商品ID和商品数量
 */
public class ProductForm implements Serializable {
    private static final long serialVersionUID = 423939619062109326L;
    //商品id
    private  Integer productId;
    //商品数量
    private Integer productQuantity;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
}
