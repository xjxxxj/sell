package com.xinyan.sell.exception;

import com.xinyan.sell.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Enumeration;

/**
 * @program: sell
 * @description: 统一异常处理类
 * @author: 谢庆香
 * @create: 2018-11-21 23:37
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandle {
    /**
     * @Description: 订单模块异常统一处理
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 23:54
     */ 
    @ExceptionHandler(OrderException.class)
    @ResponseBody
    public ResultVo orderExceptionhandle(HttpServletRequest request , OrderException e){
        log.error("请求url:" + request.getRequestURL().toString(),e);
        log.error("请求参数:" + getRequstParamsMessage(request));
        return ResultVo.error("请求错误，错误来自订单模块") ;
    }
    /**
     * @Description: 商品模块异常通用处理
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 23:56
     */ 
    @ExceptionHandler(ProductException.class)
    @ResponseBody
    public ResultVo productExceptionhandle(HttpServletRequest request , ProductException e){
        log.error("请求url:" + request.getRequestURL().toString(),e);
        log.error("请求参数:" + getRequstParamsMessage(request));
        return ResultVo.error("请求错误，错误来自商品模块") ;
    }

    @ExceptionHandler(SQLException.class)
    @ResponseBody
    public ResultVo sqlExceptionhandle(HttpServletRequest request , SQLException e){
        log.error("请求url:" + request.getRequestURL().toString(),e);
        log.error("请求参数:" + getRequstParamsMessage(request));
        return ResultVo.error("数据库操作异常异常") ;
    }
    /**
     * @Description: 运行时异常统一处理
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 23:58
     */ 
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResultVo runtimeExceptionhandle(HttpServletRequest request , RuntimeException e){
        log.error("请求url:" + request.getRequestURL().toString(),e);
        log.error("请求参数:" + getRequstParamsMessage(request));
        return ResultVo.error("程序运行异常") ;
    }
    /**
     * @Description: 运行时异常统一处理
     * @Author: 谢庆香
     * @Date: 2018\11\21 0021
     * @Time: 23:58
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVo exceptionhandle(HttpServletRequest request , Exception e){
        log.error("请求url:" + request.getRequestURL().toString(),e);
        log.error("请求参数:" + getRequstParamsMessage(request));
        return ResultVo.error("程序运行异常") ;
    }

    /**
     * @Description: 获取请求中的参数
     * @Author: 谢庆香
     * @Date: 2018\11\22 0022
     * @Time: 0:39
     */ 

    private String getRequstParamsMessage(HttpServletRequest request){
        String result = "[" ;
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String paramName = parameterNames.nextElement() ;
            result += (paramName + " = " + request.getParameter(paramName) + ",") ;
        }
        if(!result.equals("]")){
            result = result.substring(0,-1) ;
        }
        result += "]" ;
        return result ;
    }

}