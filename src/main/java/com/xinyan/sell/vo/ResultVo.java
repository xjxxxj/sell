package com.xinyan.sell.vo;

import java.io.Serializable;

/**
 * @Description: ResultVo  统一封装Json数据返回格式
 * @Author: Hp
 * @CreateDate: 17/11/2018 14:33
 * @UpdateUser: Hp
 * @UpdateDate: 17/11/2018 14:33
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class ResultVo implements Serializable {
    private static final long serialVersionUID = -7103945530792926099L;
    /**0:成功，1:失败*/
    private Integer code;
    /**提示信息*/
    private String msg;
    /**封装的返回数据*/
    private Object data;

    public static ResultVo error(String msg , Object errorObject){
        return new ResultVo(1,msg,errorObject) ;
    }
    public static ResultVo error(String msg){
        return new ResultVo(1,msg,null) ;
    }
    public static ResultVo error(){return new ResultVo(1,"失败" , null) ;}
    public static ResultVo ok(String msg , Object data){
        return new ResultVo(0,msg,data) ;
    }
    public static ResultVo ok(Object data){
        return new ResultVo(0,"成功" ,data) ;
    }
    public static ResultVo ok(String msg){return new ResultVo(0,msg,null);}
    public static ResultVo ok(){ return new ResultVo(0,"成功" ,null) ; }
    public ResultVo() {
    }

    protected ResultVo(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
