package com.xinyan.sell.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
/**
* @Description:    ProductInfo类  前端展示的商品信息
* @Author:         Hp
* @CreateDate:     16/11/2018 17:20
* @UpdateUser:     Hp
* @UpdateDate:     16/11/2018 17:20
* @UpdateRemark:
* @Version:
*/
@Data
public class ProductInfo implements Serializable {
    /**
     * 实现Serializable，获取serialVersionUID，缓存ProductInfo对象信息
     */
    private static final long serialVersionUID = -4768879223933770876L;
    /**
     * 商品主键id
     */
    private Integer id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品单价
     */
    private BigDecimal price;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 商品图片
     */
    private String icon;

}
