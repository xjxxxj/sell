package com.xinyan.sell.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @program: sell
 * @description: 商品类别类
 * @author: 谢庆香
 * @create: 2018-11-20 01:09
 **/
@Entity(name = "tb_product_category")
public class ProductCategory implements Serializable , Comparable {
    private static final long serialVersionUID = -1147074259207160347L;
    /**商品类别id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer type ;
    /**商品类别名称*/
    private String name ;
    /**商品类别描述信息*/
    private String description ;
    /**商品类别优先级，默认为0，优先级越高，越排前面*/
    private Integer priority ;

    public ProductCategory(String name, String description, Integer priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public ProductCategory() {

    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof ProductCategory){
            return ((ProductCategory)o).getPriority() - this.getPriority() ;
        }
        return 0;
    }
}