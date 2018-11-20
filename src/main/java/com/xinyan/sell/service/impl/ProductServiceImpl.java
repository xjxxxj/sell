package com.xinyan.sell.service.impl ;

import com.xinyan.sell.dto.ProductByCategoryDto;
import com.xinyan.sell.po.ProductCategory;
import com.xinyan.sell.po.ProductInfo;
import com.xinyan.sell.repository.ProductCategoryRespository;
import com.xinyan.sell.repository.ProductRepository;
import com.xinyan.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: sell
 * @description:
 * @author: 谢庆香
 * @create: 2018-11-19 19:07
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository ;
    @Autowired
    private ProductCategoryRespository categoryRespository ;
    @Override
    public ProductInfo findOne(String productId) {
        return null;
    }

    /**
     * @Description: 分类获取所有商品信息
     * @Author: 谢庆香
     * @Date: 2018\11\19 0019
     * @Time: 19:15
     */
    @Override
    public List<ProductByCategoryDto> findAllWithCategory() {
        List<ProductByCategoryDto> productByCategoryDtos = new ArrayList<>() ;
        //按照优先级排序查询商品类别信息
        List<ProductCategory> categories = categoryRespository.findAll(new Sort(Sort.Direction.DESC, "priority"));
        //按分类查询商品的信息
        for(ProductCategory category : categories){
            List<ProductInfo> allByCategoryType = productRepository.findAllByCategoryType(category.getType());
            //将类别信息及商品信息放到dto对象中
            productByCategoryDtos.add(new ProductByCategoryDto(category,allByCategoryType)) ;
        }
        return productByCategoryDtos ;
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