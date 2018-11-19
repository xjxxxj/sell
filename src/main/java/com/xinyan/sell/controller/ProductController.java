package com.xinyan.sell.controller;

import com.xinyan.sell.service.ProductService;
import com.xinyan.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
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

    private ProductService productService ;
    /**
     * @Description: 获取所有商品类别
     * @Author: 谢庆香
     * @Date: 2018\11\19 0019
     * @Time: 17:21
     */
    @RequestMapping("/list")
    public ResultVo getProductList(){

        return ResultVo.ok() ;
    }

}