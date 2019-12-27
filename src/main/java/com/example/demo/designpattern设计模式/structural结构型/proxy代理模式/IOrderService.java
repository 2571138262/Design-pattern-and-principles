package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式;

/**
 * Service层
 */
public interface IOrderService {

    /**
     * 保存订单
     * @param order 订单对象
     * @return 生效行数
     */
    int saveOrder(Order order);
    
}
