package com.xinyan.sell.service.impl;

import com.xinyan.sell.dto.OrderDTO;
import com.xinyan.sell.service.OrderService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * @program: sell
 * @description:订单服务实现类
 * @author: 谢庆香
 * @create: 2018-11-19 11:45
 **/
@Service
public class OrderServiceImpl implements OrderService {

    /*@program：订单（order）
     *创建订单实现类
     *@author 李显君
     *@date 2018/11/19 16:42
     */
    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {

        return null;
    }

    /*@program：订单（order）
     *订单列表实现类
     *@author 李显君
     *@date 2018/11/19 16:53
     */
    @Override
    public Page<OrderDTO> findList(OrderDTO orderDTO) {
        return null;
    }
    /*@program：订单（order）
     *查询订单实现类
     *@author 李显君
     *@date 2018/11/19 17:16
     */
    @Override
    public OrderDTO findOrderById(String orderId) {
        return null;
    }
    /*@program：订单（order）
     *取消订单实现类
     *@author 李显君
     *@date 2018/11/19 17:16
     */
    @Override
    public OrderDTO cancelOrder(OrderDTO orderDTO) {
        return null;
    }
    /*@program：订单（order）
     *支付订单实现类
     *@author 李显君
     *@date 2018/11/19 17:16
     */
    @Override
    public OrderDTO payOrder(OrderDTO orderDTO) {
        return null;
    }
}