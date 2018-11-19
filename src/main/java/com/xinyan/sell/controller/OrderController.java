package com.xinyan.sell.controller;

import com.xinyan.sell.form.OrderForm;
import com.xinyan.sell.po.BuyerInfo;
import com.xinyan.sell.service.BuyerService;
import com.xinyan.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: sell
 * @description: 订单模块控制层
 * @author: 谢庆香
 * @create: 2018-11-19 11:35
 **/
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService ;
    @Autowired
    private BuyerService userService ;
    /**创建订单*/
    @RequestMapping("/create")
    @ResponseBody
    public ResultVo create(OrderForm orderForm){
        ResultVo resultVo = new ResultVo();
        //查看用户是否存在
        BuyerInfo buyerInfo = userService.queryBuyerByOpenId(orderForm.getOpenid()) ;
        if(buyerInfo == null){

        }
        return resultVo ;
    }


}