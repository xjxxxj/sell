package com.xinyan.sell.form;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: 谢庆香
 * @create: 2018-11-20 18:24
 **/
public class Item implements Serializable {

    private static final long serialVersionUID = -136129083328148670L;
    private Integer productId ;
    private Integer productQuantity ;

    public Item() {
    }

    public Item(Integer productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public static void main( String[] args ) throws IOException {

        List<Item> items = new ArrayList<>() ;
        items.add(new Item(2,4)) ;
        items.add(new Item(2,4)) ;
        String s = new ObjectMapper().writeValueAsString(items);
        System.out.println(s) ;

        List<Item> items1 = new ObjectMapper().readValue(s,ArrayList.class) ;
        System.out.println(items1) ;
    }

}