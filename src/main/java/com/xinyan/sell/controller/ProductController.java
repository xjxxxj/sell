package com.xinyan.sell.controller;

import com.xinyan.sell.vo.ProductVo;
import com.xinyan.sell.vo.ResultVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sell
 * @description: 商品模块控制器
 * @author: 谢庆香
 * @create: 2018-11-19 16:34
 **/
@RestController
@RequestMapping("/buyer/product")
public class ProductController {
    @RequestMapping("/list")
    public ResultVo getProductList(){
        return ResultVo.ok() ;
    }

}