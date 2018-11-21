package com.xinyan.sell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: sell
 * @description: 后台管理的Controller
 * @author: 谢庆香
 * @create: 2018-11-19 16:17
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {
    /**
     * @Description: 去订单列表页面
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 19:26
     */ 
    @RequestMapping("order/list")
    public String toList(Model model){
        return "order/list" ;

    }

}