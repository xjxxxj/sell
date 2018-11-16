package com.xinyan.sell.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfo {

    private Integer id;
    private String name;
    private BigDecimal price;
    private String description;
    private String icon;

}
