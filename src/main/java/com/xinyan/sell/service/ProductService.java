package com.xinyan.sell.service;

import com.xinyan.sell.dto.ProductByCategoryDto;
import com.xinyan.sell.po.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
* @Description:    ProductService 商品业务接口
* @Author:         Hp
* @CreateDate:     19/11/2018 14:31
* @UpdateUser:     Hp
* @UpdateDate:     19/11/2018 14:31
* @UpdateRemark:
* @Version:
*/
public interface ProductService {
    /**
    * description  根据商品Id查询商品信息
    * @author      Hp
    * @param productId
    * @return      ProductInfoVo
    * @exception
    * @date        19/11/2018 14:47
    */
    ProductInfo findOne(String productId);
    /**
    * @description 查询所有商品信息
    * @author      Hp
    * @param
    * @return     List<ProductInfoVo>
    * @exception
    * @date        19/11/2018 14:49
    */
    List<ProductByCategoryDto> findAll();
    /**
    * @description  分页查询所有商品信息
    * @author      Hp
    * @param       pageable
    * @return      Page<ProductInfoVo>
    * @exception
    * @date        19/11/2018 14:50
    */
    Page<ProductInfo> findAll(Pageable pageable);
    /**
    * @description  新增商品信息
    * @author      Hp
    * @param       productInfo
    * @return      ProductInfoVo
    * @exception
    * @date        19/11/2018 14:53
    */
    ProductInfo save(ProductInfo productInfo);


}
