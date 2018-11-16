package com.xinyan.sell.vo;

import lombok.Data;

import java.io.Serializable;

/**
* @Description:    ProductCategory类   商品类目信息表
* @Author:         Hp
* @CreateDate:     16/11/2018 17:18
* @UpdateUser:     Hp
* @UpdateDate:     16/11/2018 17:18
* @UpdateRemark:
* @Version:
*/
@Data
public class ProductCategory implements Serializable {
    /**
     * 实现Serializable，获取serialVersionUID，缓存ProductCategory对象信息
     */
    private static final long serialVersionUID = -2060451394641745921L;
    /**
     * 商品类目名称
     */
    private String name;
    /**
     * 商品类目类型
     */
    private Integer type;

}
