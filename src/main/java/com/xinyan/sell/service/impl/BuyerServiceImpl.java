package com.xinyan.sell.service.impl;

import com.xinyan.sell.po.BuyerInfo;
import com.xinyan.sell.repository.BuyerRepository;
import com.xinyan.sell.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: sell
 * @description:用户服务实现类
 * @author: 谢庆香
 * @create: 2018-11-19 11:50
 **/
@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerRepository buyerRepository ;
    /**
     * @Description: 根据用户openid查询用户
     * @Author: 谢庆香
     * @Date: 2018\11\19 0019
     * @Time: 11:52
     */
    @Override
    public BuyerInfo queryBuyerByOpenId(String openid) {
        return buyerRepository.findOne(openid) ;
    }

    @Override
    public void saveBuyer(BuyerInfo buyerInfo) {

    }
}