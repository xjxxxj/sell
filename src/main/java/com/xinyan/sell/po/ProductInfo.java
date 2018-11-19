package com.xinyan.sell.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**

* @Description:    ProductInfoVo  商品信息列表
* @Author:         Hp
* @CreateDate:     19/11/2018 10:04
* @UpdateUser:     Hp
* @UpdateDate:     19/11/2018 10:04
* @UpdateRemark:
* @Version:
*/
@Entity(name = "tb_product_info")
public class ProductInfo implements Serializable {
    private static final long serialVersionUID = 4103977930413886918L;
    /**
     * 商品Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品单价,单位：分
     */
    private Long price;
    /**
     * 商品描述
     */
    private String description;
    /**
     *  商品图标
     */
    private String icon;
    /**
     * 商品类目类型
     */
    private Integer categoryType;

    public ProductInfo() {
    }


    public ProductInfo(String name, Long price, String description, String icon, Integer categoryType) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.icon = icon;
        this.categoryType = categoryType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}
