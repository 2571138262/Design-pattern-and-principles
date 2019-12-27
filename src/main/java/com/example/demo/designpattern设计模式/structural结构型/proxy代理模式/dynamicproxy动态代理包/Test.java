package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.dynamicproxy动态代理包;

import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.IOrderService;
import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.Order;
import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        // 获取动态代理类
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }

}
