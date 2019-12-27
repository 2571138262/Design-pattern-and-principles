package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.staticproxy静态代理包;

import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.Order;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        
        // 获取静态代理类
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
    
}
