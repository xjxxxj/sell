package com.xinyan.sell.dto;

import com.xinyan.sell.po.ProductCategory;
import com.xinyan.sell.po.ProductInfo;
import java.util.List;

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
public class ProductByCategoryDto {
    /**商品类别*/
    private ProductCategory productCategory;
    /**该类别商品的信息*/
    private List<ProductInfo> foods ;

    public ProductByCategoryDto(ProductCategory productCategory, List<ProductInfo> foods) {
        this.productCategory = productCategory;
        this.foods = foods;
    }

    public ProductByCategoryDto() {
    }

    public String getName(){
        return this.productCategory.getName() ;
    }
    public Integer getType(){
        return this.productCategory.getType() ;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public List<ProductInfo> getFoods() {
        return foods;
    }

    public void setFoods(List<ProductInfo> foods) {
        this.foods = foods;
    }
}
