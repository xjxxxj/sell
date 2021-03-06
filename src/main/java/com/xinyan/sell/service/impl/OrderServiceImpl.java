package com.xinyan.sell.service.impl;

import com.xinyan.sell.dto.CreateOrderDto;
import com.xinyan.sell.dto.OrderDTO;
import com.xinyan.sell.dto.OrderDetailDto;
import com.xinyan.sell.exception.ProductException;
import com.xinyan.sell.po.Order;
import com.xinyan.sell.po.OrderItemDetail;
import com.xinyan.sell.po.ProductInfo;
import com.xinyan.sell.repository.OrderItemDetailRepository;
import com.xinyan.sell.repository.OrderRepository;
import com.xinyan.sell.repository.ProductRepository;
import com.xinyan.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @program: sell
 * @description:订单服务实现类
 * @author: 谢庆香
 * @create: 2018-11-19 11:45
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository ;

    @Autowired
    private ProductRepository productRepository ;
    @Autowired
    private OrderItemDetailRepository itemDetailRepository ;
   /**
    * @Description: 创建订单服务
    * @Author: 谢庆香
    * @Date: 2018\11\20 0020
    * @Time: 22:49
    */ 
    @Override
    @Transactional
    public CreateOrderDto createOrder(CreateOrderDto createOrderDto) throws ProductException{
        log.info("用户：" + createOrderDto.getCreateOrderForm().getOpenid() + "请求创建订单,订单号为" + createOrderDto.getOrderid());
        List<LinkedHashMap<String, Integer>> items = createOrderDto.getCreateOrderForm().getItems();
        //存储订单中所有商品的id
        List<Integer> productInfoIds = new ArrayList<>() ;
        for(int i = 0 ; i < items.size() ; i ++){
            //将商品id存在list集合中
            productInfoIds.add(items.get(i).get("productId"))  ;
        }
        //查找订单中商品相关信息
        List<ProductInfo> productInfos = productRepository.findAllByIdIn(productInfoIds) ;

        if(items.size() != productInfos.size()){
            throw new ProductException("商品不存在") ;
        }
        //用list集合存储所有的订单项信息
        List<OrderItemDetail> orderItemDetails = new ArrayList<>() ;
        //创建订单项pojo对象
        for(int i = 0 ; i < productInfos.size() ; i ++){
            OrderItemDetail orderItemDetail = new OrderItemDetail(productInfos.get(i));
            orderItemDetail.setOrderId(createOrderDto.getOrderid());
            orderItemDetail.setProductQuantity(items.get(i).get("productQuantity"));
            orderItemDetails.add(orderItemDetail) ;
        }
        //创建订单pojo
        Order order = new Order(createOrderDto, orderItemDetails);
        //存储订单数据
        orderRepository.save(order) ;
        //批量存储订单项数据
        itemDetailRepository.save(orderItemDetails) ;
        log.info("用户：" + createOrderDto.getCreateOrderForm().getOpenid() + "订单成功,订单号为" + createOrderDto.getOrderid());
        //提醒商家收到新订单



        return createOrderDto;
    }

    /**@program：订单（order）
     *取消订单实现类
     *@author 李显君
     *@date 2018/11/19 17:16
     */
    @Override
    public boolean cancelOrder(String openid , String orderId) {
        log.info("用户：" + openid + "请求取消订单,订单号为" + orderId);
        //根据orderId获取订单
        Order order = orderRepository.findOne(orderId);
        //判断该订单是否属于该人
        if(!openid.equals(order.getBuyerOpenId())){
            return false ;
        }
        //如果订单已完成
        if(order.getOrderStatus() == 0){
            return false ;
        }
        //如果订单未完成，已付款
        if(order.getPayStatus() == 0){
            //通知商家审核取消订单请求
            //商家同意后删除订单项及订单
            //退款
        }
        //订单未付款
        //删除该订单的订单项
        itemDetailRepository.deleteByOrderId(orderId) ;
        //删除该订单
        orderRepository.delete(orderId);
        log.info("用户：" + openid + "成功取消订单,订单号为" + orderId);
        return true;
    }

    /** 
      * @Description:分页查询某买家的订单信息
      * @Param:  
      * @return:  
      * @Author: 谢庆香 
      * @Date: 2018\11\20 0020 
      * @Time: 11:31
    */ 
    @Override
    public OrderDTO findAll(OrderDTO orderDTO) {
        //分页获取所有的该用户的订单信息
        Page<Order> byBuyerOpenId = orderRepository.findAllByBuyerOpenIdOrderByCreateTimeDesc(orderDTO.getOpenid(), orderDTO.getPage());
        //将订单信息封装在dto对象中
        orderDTO.setOrders(byBuyerOpenId.getContent());
        return orderDTO;
    }

    /**
     * @Description: 买家获取自己某个订单的信息
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 23:28
     */ 
    @Override
    public OrderDetailDto getOrderDetail(OrderDetailDto orderDetailDto) {
        //根据orderId查询订单基本信息
        Order order = orderRepository.findOne(orderDetailDto.getOrderId());
        //判断该订单是否属于此用户
        if(order != null && order.getBuyerOpenId().equals(orderDetailDto.getBuyerOpenid())){
            BeanUtils.copyProperties(order,orderDetailDto);
            //根据订单id查订单项
            List<OrderItemDetail> items = itemDetailRepository.findAllByOrderId(orderDetailDto.getOrderId());
            //将订单详情集合封装到dto对象中
            orderDetailDto.setOrderDetailList(items);
            return orderDetailDto ;
        }
        return null;
    }

    /**
     * @Description:后台分页获取订单
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 19:37
     */ 
    @Override
    public Page<Order> findAll(PageRequest page) {
        return orderRepository.findAll(page) ;
    }
    /**
     * @Description: 后台查看订单详情
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 20:49
     */
    @Override
    public OrderDetailDto findAll(String orderId) {
        OrderDetailDto orderDetailDto = new OrderDetailDto(orderId);
        //根据orderId查询订单基本信息
        Order order = orderRepository.findOne(orderId);
        if(order != null){
            BeanUtils.copyProperties(order,orderDetailDto);
            //根据订单id查订单项
            List<OrderItemDetail> items = itemDetailRepository.findAllByOrderId(orderDetailDto.getOrderId());
            //将订单详情集合封装到dto对象中
            orderDetailDto.setOrderDetailList(items);
            return orderDetailDto ;
        }
        return null;
    }


}