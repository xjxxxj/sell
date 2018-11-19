package com.xinyan.sell.service;

import com.xinyan.sell.po.Order;
import org.springframework.data.domain.Page;

/**
 * @Description: 订单服务接口
 * @Author: 谢庆香
 * @Date: 2018\11\19 0019
 * @Time: 11:44
 */

public interface OrderService {
    /*@program：订单（order）
     *创建订单
    *@author 李显君
    *@date 2018/11/19 16:42
    */
     Order createOrder(Order order);
    
    /*@program：订单（order）
     *订单列表
    *@author 李显君
    *@date 2018/11/19 16:53
    */
     Page<Order> findList(Order order);
    /*@program：订单（order）
    *查询订单
    *@author 李显君
    *@date 2018/11/19 17:16
    */
     Order findOrderById(String orderId);
    
    /*@program：订单（order）
    *取消订单
    *@author 李显君
    *@date 2018/11/19 17:19
    */
     Order cancelOrder(Order order);
    
    
    /*@program：订单（order）
    *支付订单
    *@author 李显君
    *@date 2018/11/19 17:21
    */
     Order payOrder(Order order);

}
