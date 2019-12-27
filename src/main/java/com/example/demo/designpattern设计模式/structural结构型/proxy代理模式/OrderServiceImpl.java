package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式;

/**
 * Service实现
 */
public class OrderServiceImpl implements IOrderService {
    
    private IOrderDao iOrderDao;
    
    @Override
    public int saveOrder(Order order) {
        // Spring会自己注入，这里就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
