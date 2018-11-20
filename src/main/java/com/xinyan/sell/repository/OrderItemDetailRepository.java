package com.xinyan.sell.repository;

import com.xinyan.sell.po.OrderItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
  * @Description: 订单项详情仓库
  * @Param:  
  * @return:  
  * @Author: 谢庆香 
  * @Date: 2018\11\20 0020 
  * @Time: 22:13
*/ 
public interface OrderItemDetailRepository extends JpaRepository<OrderItemDetail , String> {

    /**
     * @Description: 根据订单id获取订单项
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 0:27
     */ 
    List<OrderItemDetail> findAllByOrderId(String orderId) ;

    /**
     * @Description: 根据订单id删除订单项
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 0:31
     */ 
    List<OrderItemDetail> deleteByOrderId(String orderId) ;
}
