package com.xinyan.sell.dto;

import com.xinyan.sell.po.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;


/**
 * @program：sell
 * @Auther:李显君
 * @Date: 2018/11/19 17 :46
 */
public class OrderDTO implements Serializable {
    private static final long serialVersionUID = 1254263340087283384L;
    /**买家openid*/
    private String openid ;
    /**分页数据*/
    private Pageable page ;
    /**封装返回值*/
    private List<Order> orders ;

    public OrderDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public OrderDTO(String openid, Pageable page) {
        this.openid = openid;
        this.page = page;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Pageable getPage() {
        return page;
    }

    public void setPage(Pageable page) {
        this.page = page;
    }
}
