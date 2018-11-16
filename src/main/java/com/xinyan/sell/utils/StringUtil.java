package com.xinyan.sell.utils;

/**
 * @program: sell
 * @description: 字符串工具类
 * @author: 谢庆香
 * @create: 2018-11-16 16:31
 **/
public class StringUtil {

    public boolean isNotNull(Object ... objects){
        if(objects != null && objects.length > 0){
            for(int i = 0 ; i < objects.length ; i ++){
                if(objects[0] == null){
                    return false ;
                }
            }
        }else {
            return false ;
        }
        return true ;
    }

}