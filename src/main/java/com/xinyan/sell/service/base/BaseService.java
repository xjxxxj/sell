package com.xinyan.sell.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @program: sell
 * @description: 服务层父接口
 * 提供基础的查询，删除功能
 * @author: 谢庆香
 * @create: 2018-11-16 18:46
 **/
public interface BaseService<T> {

    /**
     * @Description: 根据主键查找记录
     * @Author: 谢庆香
     * @Date: 2018\11\16 0016
     * @Time: 18:49
     */
    T queryById(String id) ;
    /**
     * @Description: 查找所有的记录
     * @Author: 谢庆香
     * @Date: 2018\11\16 0016
     * @Time: 18:50
     */
    List<T> queryAll() ;
    /**
     * @Description: 分页查询
     * @Author: 谢庆香
     * @Date: 2018\11\16 0016
     * @Time: 18:53
     */
    Page<T> queryPage(Pageable pageable) ;
    /**
     * @Description: 根据id删除一条记录
     * @Author: 谢庆香
     * @Date: 2018\11\16 0016
     * @Time: 19:47
     */ 
    void deleteById(String id ) ;

    /**
     * @Description: 根据id删除多条记录
     * @Author: 谢庆香
     * @Date: 2018\11\16 0016
     * @Time: 19:51
     */
    void deleteBatchByIds(String[] ids) ;

}