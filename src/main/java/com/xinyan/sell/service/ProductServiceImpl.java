package com.xinyan.sell.service;

import com.xinyan.sell.dto.ProductDto;
import com.xinyan.sell.po.ProductInfo;
import com.xinyan.sell.repository.ProductRepository;
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
    public List<ProductDto> findAll() {
        ProductDto productDto = new ProductDto();
        List<ProductInfo> productInfoList = productRepository.findAll();
        ProductInfoVo foods = productDto.getFoods();
        for(ProductInfo productInfo:productInfoList){

        }
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