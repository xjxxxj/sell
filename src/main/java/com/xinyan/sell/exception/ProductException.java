package com.xinyan.sell.exception;

/**
 * @program: sell
 * @description: 商品模块异常处理
 * @author: 谢庆香
 * @create: 2018-11-20 20:51
 **/
public class ProductException extends RuntimeException {

    public ProductException(String message) {
        super(message);
    }
}