package com.xinyan.sell.controller;

import com.xinyan.sell.dto.OrderDTO;
import com.xinyan.sell.form.OrderForm;
import com.xinyan.sell.po.BuyerInfo;
import com.xinyan.sell.service.BuyerService;
import com.xinyan.sell.service.OrderService;
import com.xinyan.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: sell
 * @description: 订单模块控制层
 * @author: 谢庆香
 * @create: 2018-11-19 11:35
 **/
@Controller
@RequestMapping("/sell")
public class OrderAdminController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("order/list")
    public ModelAndView toList(Model model , @RequestParam(value = "page" , required = false , defaultValue = "0") int page){
        PageRequest pageable = new PageRequest(page,10) ;
        Page<OrderDTO> orderList = orderService.findList(pageable);
        model.addAttribute("OrderList",orderList.getContent());
        return new ModelAndView("order/list","orderList",model);
    }
}