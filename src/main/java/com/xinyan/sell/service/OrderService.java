package com.xinyan.sell.service;

import com.xinyan.sell.dto.CreateOrderDto;
import com.xinyan.sell.dto.OrderDTO;
import com.xinyan.sell.dto.OrderDetailDto;
import com.xinyan.sell.po.Order;
import com.xinyan.sell.po.OrderItemDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

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
     * @param orderDTO
    */
    CreateOrderDto createOrder(CreateOrderDto orderDTO);
    
    /**@program：订单（order）
    *取消订单
    *@author 李显君
    *@date 2018/11/19 17:19
    */
     boolean cancelOrder(String openid , String orderId);

     /**
      * @Description: 分页查询某买家的订单信息
      * @Author: 谢庆香
      * @Date: 2018\11\20 0020
      * @Time: 10:34
      */
    OrderDTO findAll(OrderDTO orderDTO);

    /**
     * @Description: 买家获取订单详情信息
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 23:27
     */ 
    OrderDetailDto getOrderDetail(OrderDetailDto orderDetailDto);

    /**
     * @Description: 后台分页获取用户信息
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 19:37
     */
    Page<Order> findAll(PageRequest page);

    /**
     * @Description: 根据订单id查询订单
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 20:49
     */
    OrderDetailDto findAll(String orderId);
}
