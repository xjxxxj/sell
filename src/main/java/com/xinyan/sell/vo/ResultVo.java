package com.xinyan.sell.vo;

import java.io.Serializable;

/**

* @Description:    ResultVo  统一封装Json数据返回格式
* @Author:         Hp
* @CreateDate:     17/11/2018 14:33
* @UpdateUser:     Hp
* @UpdateDate:     17/11/2018 14:33
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ResultVo implements Serializable {
    private static final long serialVersionUID = -7103945530792926099L;

    private Integer code;
    private String msg;
    private Object data;
    public ResultVo() {}

    public ResultVo(Integer code, String msg, Object data) {
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

    public void setCode() {
        this.code = code;
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
