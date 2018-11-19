package com.xinyan.sell.dto;

import com.xinyan.sell.vo.ProductCategoryVo;
import com.xinyan.sell.vo.ProductInfoVo;

/**
 * @Description: Product Vo对象 封装了商品类目信息和前端展示的商品信息，
 * 在ResultVo中为Data对象.
 * @Author: Hp
 * @CreateDate: 16/11/2018 20:58
 * @UpdateUser: Hp
 * @UpdateDate: 16/11/2018 20:58
 * @UpdateRemark:
 * @Version:
 */
public class ProductDto {
    /**传入ProductCategoryVo对象*/
    private ProductCategoryVo category;

    /**传入ProductInfoVo对象*/
    private ProductInfoVo foods;

    public ProductDto() {
    }

    public ProductDto(ProductCategoryVo category, ProductInfoVo foods) {
        this.category = category;
        this.foods = foods;
    }

    public String getName() {
        return this.category.getName();
    }

    public Integer getType() {
        return this.category.getType();
    }

    public void setCategory(ProductCategoryVo category) {
        this.category = category;
    }

    public ProductInfoVo getFoods() {
        return foods;
    }

    public void setFoods(ProductInfoVo foods) {
        this.foods = foods;
    }
}
