package com.xinyan.sell.form;

import java.io.Serializable;
import java.util.List;

/**
 * 买家查询订单参数封装
 */
public class OrderForm implements Serializable {
    private static final long serialVersionUID = 1731269387543124876L;
    /**用户openid*/
    private String openid ;
    /**当前页码，默认为0*/
    private int page = 0 ;
    /**单页显示条数，默认10*/
    private int size  = 10 ;

    public OrderForm(String openid, int page, int size) {
        this.openid = openid;
        this.page = page;
        this.size = size;
    }

    public OrderForm() {
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
