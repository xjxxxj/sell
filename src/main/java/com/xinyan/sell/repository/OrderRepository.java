package com.xinyan.sell.repository;

import com.xinyan.sell.po.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 订单仓库
 * @Author: 谢庆香
 * @Date: 2018\11\20 0020
 * @Time: 10:34
 */
public interface OrderRepository extends JpaRepository<Order,String>{

    /**
     * @Description: 分页查询某个商家的订单信息
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 14:20
     */ 
    Page<Order> findAllByBuyerOpenIdOrderByCreateTimeDesc(String openId , Pageable pageable) ;

}
