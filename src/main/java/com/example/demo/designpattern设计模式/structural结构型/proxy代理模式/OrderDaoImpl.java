package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式;

/**
 * Dao层实现  模拟入库操作
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
