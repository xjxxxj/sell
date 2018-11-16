package com.xinyan.sell.vo;

import lombok.Data;


import java.math.BigInteger;

@Data
public class OrderDetailList {
    private String detailId;
    private String orderId;
    private Integer productId;
    private String productName;
    private BigInteger productPrice;
    private Integer productQuantity;
    private String productIcon;
    private String productImage;


}
