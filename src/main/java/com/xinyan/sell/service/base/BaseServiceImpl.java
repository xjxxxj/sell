package com.xinyan.sell.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

/**
 * @program: sell
 * @description: 服务层父接口的实现类
 * @author: 谢庆香
 * @create: 2018-11-16 19:50
 **/
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private JpaRepository<T,String> jpaRepository ;

    @Override
    public T queryById(String id) {
        return jpaRepository.findOne(id);
    }

    @Override
    public List<T> queryAll() {
        return jpaRepository.findAll();
    }

    @Override
    public Page<T> queryPage(Pageable pageable) {
        return jpaRepository.findAll(pageable);
    }

    @Override
    public void deleteById(String id) {
        jpaRepository.delete(id);
    }

    @Override
    public void deleteBatchByIds(String[] ids) {
        List strings = Arrays.asList(ids);
        jpaRepository.deleteInBatch(strings);
    }
}