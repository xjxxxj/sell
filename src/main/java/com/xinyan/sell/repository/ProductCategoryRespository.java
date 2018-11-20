package com.xinyan.sell.repository;

import com.xinyan.sell.po.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: sell
 * @description:
 * @author: 谢庆香
 * @create: 2018-11-20 14:43
 **/
public interface ProductCategoryRespository extends JpaRepository<ProductCategory,Integer> {
}