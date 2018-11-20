package com.xinyan.sell.service;

import com.xinyan.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;

/**
 * @Description: 订单服务接口
 * @Author: 谢庆香
 * @Date: 2018\11\19 0019
 * @Time: 11:44
 */

public interface OrderService {
    /**@program：订单（order）
     *创建订单
    *@author 李显君
    *@date 2018/11/19 16:42
    */
     OrderDTO createOrder(OrderDTO orderDTO);
    
    /**@program：订单（order）
     *订单列表
    *@author 李显君
    *@date 2018/11/19 16:53
    */
     Page<OrderDTO> findList(OrderDTO orderDTO);

    /**@program：订单（order）
    *查询订单
    *@author 李显君
    *@date 2018/11/19 17:16
    */
     OrderDTO findOrderById(String orderId);
    
    /**@program：订单（order）
    *取消订单
    *@author 李显君
    *@date 2018/11/19 17:19
    */
     OrderDTO cancelOrder(OrderDTO orderDTO);
    
    
    /**@program：订单（order）
    *支付订单
    *@author 李显君
    *@date 2018/11/19 17:21
    */
     OrderDTO payOrder(OrderDTO orderDTO);

     /**
      * @Description: 分页查询某买家的订单信息
      * @Author: 谢庆香
      * @Date: 2018\11\20 0020
      * @Time: 10:34
      */
    OrderDTO findAll(OrderDTO orderDTO);
}
