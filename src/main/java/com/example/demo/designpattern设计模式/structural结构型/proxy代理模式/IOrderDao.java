package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式;

/**
 * dao层 mapper
 */
public interface IOrderDao {

    /**
     * 入库操作
     * @param order
     * @return
     */
    int insert(Order order);
    
}
