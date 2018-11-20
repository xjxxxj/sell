package com.xinyan.sell.service.impl ;

import com.xinyan.sell.dto.ProductByCategoryDto;
import com.xinyan.sell.po.ProductInfo;
import com.xinyan.sell.repository.ProductRepository;
import com.xinyan.sell.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: 谢庆香
 * @create: 2018-11-19 19:07
 **/
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository ;
    @Override
    public ProductInfo findOne(String productId) {
        return null;
    }

    /**
     * @Description: 获取所有商品信息
     * @Author: 谢庆香
     * @Date: 2018\11\19 0019
     * @Time: 19:15
     */
    @Override
    public List<ProductByCategoryDto> findAll() {

        return null ;
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return null;
    }
}