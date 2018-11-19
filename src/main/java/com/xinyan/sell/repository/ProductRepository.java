package com.xinyan.sell.repository;

import com.xinyan.sell.po.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: sell
 * @description:商品仓库
 * @author: 谢庆香
 * @create: 2018-11-19 19:15
 **/
public interface ProductRepository extends JpaRepository<ProductInfo,String> {

}