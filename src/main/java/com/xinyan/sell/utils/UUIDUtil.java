package com.xinyan.sell.utils;

import java.util.UUID;

/**
 * @program: sell
 * @description: UUID工具类，包装了UUID，供获取随机32位字符串
 * @author: 谢庆香
 * @create: 2018-11-16 16:23
 **/
public class UUIDUtil {

    /**
     * @Description: 获取32为随机字符串
     * @Author: 谢庆香
     * @Date: 2018\11\16 0016
     * @Time: 16:41
     */
    public static String getCode32(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-" , "") ;
    }

}