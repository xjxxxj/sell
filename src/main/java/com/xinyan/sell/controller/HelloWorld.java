package com.xinyan.sell.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sell
 * @description: 测试项目能否正常启动
 * @author: 谢庆香
 * @create: 2018-11-16 09:56
 **/
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!" ;
    }

}