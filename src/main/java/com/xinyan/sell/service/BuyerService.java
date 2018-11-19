package com.xinyan.sell.service;

import com.xinyan.sell.po.BuyerInfo;

/**
  * @Description: 用户服务接口
  * @Param:
  * @return:
  * @Author: 谢庆香
  * @Date: 2018\11\19 0019
  * @Time: 11:50
*/
public interface BuyerService {
    /**
     * @Description: 根据用户openid查询用户
     * @Author: 谢庆香
     * @Date: 2018\11\19 0019
     * @Time: 11:52
     */
    BuyerInfo queryBuyerByOpenId(String openid);

    /** 
      * @Description: 添加一条买家信息 
      * @Param:  
      * @return:  
      * @Author: 谢庆香 
      * @Date: 2018\11\19 0019 
      * @Time: 14:29
    */ 
    void saveBuyer(BuyerInfo buyerInfo) ;
}
