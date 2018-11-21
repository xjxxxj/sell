package com.xinyan.sell.controller;

import com.xinyan.sell.dto.CreateOrderDto;
import com.xinyan.sell.dto.OrderDTO;
import com.xinyan.sell.dto.OrderDetailDto;
import com.xinyan.sell.exception.OrderException;
import com.xinyan.sell.form.CreateOrderForm;
import com.xinyan.sell.form.OrderForm;
import com.xinyan.sell.po.BuyerInfo;
import com.xinyan.sell.po.Order;
import com.xinyan.sell.po.OrderItemDetail;
import com.xinyan.sell.service.BuyerService;
import com.xinyan.sell.service.OrderService;
import com.xinyan.sell.utils.ObjectUtils;
import com.xinyan.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


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
    private BuyerService buyerServiceService ;

    /**
     * @Description: 后台分页获取订单信息
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 21:49
     */ 
    @GetMapping("/seller/order/list")
    private ModelAndView getOrderListWithPage
            (@RequestParam(value = "page" , required = false , defaultValue = "0") int page
            ,@RequestParam(value = "size" , required = false , defaultValue = "1") int size){

        //创建分页对象
        PageRequest pageable = new PageRequest(page, size,new Sort(Sort.Direction.DESC,"updateTime"));
        //分页查询所有的订单
        Page<Order> orderPage = orderService.findAll(pageable);
        return new ModelAndView("/order/list" , "page" , orderPage) ;
    }

    /**
     * @Description: 创建订单
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 20:09
     */ 
    @PostMapping("/buyer/order/create")
    @ResponseBody
    public ResultVo create(CreateOrderForm createOrderForm) throws OrderException {
        //查看该用户是否存在
        String openid = createOrderForm.getOpenid();
        BuyerInfo buyerInfo = buyerServiceService.queryBuyerByOpenId(openid);
        CreateOrderDto createOrderDto = null ;
        if(ObjectUtils.isNotNull(buyerInfo)){
            //将form对象封装为dto对象
            createOrderDto = new CreateOrderDto(createOrderForm);
            //调用创建订单服务
            try {
                createOrderDto = orderService.createOrder(createOrderDto) ;
            } catch (Exception e) {
                throw new OrderException("添加订单异常") ;
            }
            createOrderDto.setCreateOrderForm(null);
        }else {
            return ResultVo.error() ;
        }
        return ResultVo.ok(createOrderDto) ;
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
        //订单为空
        if(orderDTO.getOrders() == null || orderDTO.getOrders().size() ==0){
            return ResultVo.ok("暂无订单信息") ;
        }
        return ResultVo.ok(orderDTO.getOrders()) ;
    }
    /**
     * @Description: 查看订单详情
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 23:06
     */ 
    @GetMapping("/buyer/order/detail")
    @ResponseBody
    public ResultVo getOrderDetail(String openid , String orderId) throws OrderException {
        if(!ObjectUtils.isNotNull(openid,orderId)) {
            return ResultVo.error() ;
        }
        OrderDetailDto orderDetailDto = new OrderDetailDto(orderId, openid);
        orderDetailDto = orderService.getOrderDetail(orderDetailDto) ;
        if(orderDetailDto == null){
            throw new OrderException("用户" + openid + "查询编号为" + orderId + "的订单失败") ;
        }
        return ResultVo.ok(orderDetailDto) ;
    }
    /**
     * @Description: 后台查看订单详情
     * @Author: 谢庆香
     * @Date: 2018\11\20 0020
     * @Time: 23:06
     */
    @GetMapping("/seller/order/detail")
    public ModelAndView getOrderDetail(String orderId){
        if(!ObjectUtils.isNotNull(orderId)) {
            return new ModelAndView("/common/error" , "msg" , "无此订单") ;
        }
        OrderDetailDto orderDetailDto = orderService.findAll(orderId) ;
        System.out.println(orderDetailDto.getOrderStatus()) ;
        return new ModelAndView("/order/detail" , "orderDetailDto",orderDetailDto) ;
    }

    /**
     * @Description: 取消订单
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 0:12
     */
    @PostMapping("/buyer/order/cancel")
    @ResponseBody
    public ResultVo cancel(String openid , String orderId){
        if(!ObjectUtils.isNotNull(openid,orderId)) {
            return ResultVo.error() ;
        }
        boolean result = orderService.cancelOrder(openid, orderId);
        if(result){
            return ResultVo.ok() ;
        }else {
            return ResultVo.error() ;
        }

    }

}