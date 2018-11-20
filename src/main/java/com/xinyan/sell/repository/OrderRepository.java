package com.xinyan.sell.repository;

import com.xinyan.sell.po.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
/**

* @Description:    java类作用描述
* @Author:         Hp
* @CreateDate:     20/11/2018 18:01
* @UpdateUser:     Hp
* @UpdateDate:     20/11/2018 18:01
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface OrderRepository extends JpaRepository<Order,String> {
    @Override
    Page<Order> findAll(Pageable pageable);
}
