package com.xinyan.sell.controller;

import com.xinyan.sell.dto.OrderDTO;
import com.xinyan.sell.form.CreateOrderForm;
import com.xinyan.sell.form.OrderForm;
import com.xinyan.sell.po.BuyerInfo;
import com.xinyan.sell.po.Order;
import com.xinyan.sell.service.BuyerService;
import com.xinyan.sell.service.OrderService;
import com.xinyan.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpRequest;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import java.util.Enumeration;

/**
 * @program: sell
 * @description: 订单模块控制层
 * @author: 谢庆香
 * @create: 2018-11-19 11:35
 **/
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService ;
    @Autowired
    private BuyerService userService ;
    /**创建订单*/
    @PostMapping("/buyer/order/create")
    @ResponseBody
    public ResultVo create(CreateOrderForm createOrderForm){
        System.out.println(createOrderForm) ;
        System.out.println(createOrderForm.getItems()) ;
        return ResultVo.ok() ;
    }


    /**
     * @Description: 分页获取订单信息
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 10:14
     */
    @GetMapping("/buyer/order/list")
    @ResponseBody
    public ResultVo getOrderWithPage(OrderForm orderForm){
        //将form对象封装为dto对象
        String openid = orderForm.getOpenid() ;
        Pageable pageable = new PageRequest(orderForm.getPage(),orderForm.getSize()) ;
        OrderDTO orderDTO = new OrderDTO(openid, pageable);
        //调用service，分页查询订单信息
        orderDTO = orderService.findAll(orderDTO) ;
        return ResultVo.ok(orderDTO.getOrders()) ;
    }

}