package com.xinyan.sell.vo;



import java.io.Serializable;

/**
* @Description:    ProductInfo类  前端展示的商品信息
* @Author:         Hp
* @CreateDate:     16/11/2018 17:20
* @UpdateUser:     Hp
* @UpdateDate:     16/11/2018 17:20
* @UpdateRemark:
* @Version:
*/
public class ProductInfoVo implements Serializable {
    public ProductInfoVo() {
    }

    public ProductInfoVo(Integer id, String name, Integer price, String description, String icon) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.icon = icon;
    }

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
    private Integer price;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 商品图片
     */
    private String icon;

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
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
}
