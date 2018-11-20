package com.xinyan.sell.exception;

/**
 * @program: sell
 * @description: 商品不存在异常
 * @author: 谢庆香
 * @create: 2018-11-20 20:51
 **/
public class ProductNotExitException extends RuntimeException {

    public ProductNotExitException(String message) {
        super(message);
    }
}