package com.xinyan.sell.repository;

import com.xinyan.sell.po.BuyerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
  * @Description: 用户仓库
  * @Param:
  * @return:
  * @Author: 谢庆香
  * @Date: 2018\11\19 0019
  * @Time: 11:56
*/
public interface BuyerRepository extends JpaRepository<BuyerInfo , String> {
}
