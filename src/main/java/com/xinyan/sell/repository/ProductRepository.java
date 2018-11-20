package com.xinyan.sell.repository;

import com.xinyan.sell.po.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: sell
 * @description:商品仓库
 * @author: 谢庆香
 * @create: 2018-11-19 19:15
 **/
public interface ProductRepository extends JpaRepository<ProductInfo,String> {
    /**
     * @Description: 根据类别id查询商品
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 20:43
     */ 
    List<ProductInfo> findAllByCategoryType(int categoryType) ;
    /**
     * @Description: 批量查询商品
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 20:45
     */ 
    List<ProductInfo> findAllByIdIn(List<Integer> ids) ;
}