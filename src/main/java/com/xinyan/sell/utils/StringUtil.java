package com.xinyan.sell.utils;

/**
 * @program: sell
 * @description: 字符串工具类
 * @author: 谢庆香
 * @create: 2018-11-16 16:31
 **/
public class StringUtil {

    /**
     * @Description: 判断对个对象是否存在空对象
     * @Return boolean 任意对象为空返回false
     * @Author: 谢庆香
     * @Date: 2018\11\16 0016
     * @Time: 17:06
     */
    public boolean isNotNull(Object ... objects){
        if(objects != null && objects.length > 0){
            for(int i = 0 ; i < objects.length ; i ++){
                if(objects[0] == null){
                    return false ;
                }
            }
            return true ;
        }
        return false ;
    }

}