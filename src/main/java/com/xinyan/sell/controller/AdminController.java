package com.xinyan.sell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: sell
 * @description: 后台管理的Controller
 * @author: 谢庆香
 * @create: 2018-11-19 16:17
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("order/list")
    public String toList(){
        return "order/list" ;
    }

}