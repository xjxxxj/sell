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
    @RequestMapping("order/list")
    public ModelAndView toList(Model model){

        model.addAttribute("msg" , "失败") ;
        model.addAttribute("products" , "dfsdsfa") ;

        return new ModelAndView("/common/error" , "abc" , model) ;

    }

}