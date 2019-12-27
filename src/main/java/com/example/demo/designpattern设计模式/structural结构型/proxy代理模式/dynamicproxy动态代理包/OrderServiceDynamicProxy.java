package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.dynamicproxy动态代理包;

import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.Order;
import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    // 目标对象
    private Object target;

    /**
     * 通过构造器注入
     * @param target
     */
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 绑定方法 获取动态对象
     * @return
     */
    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        // 这个值就是要被增强的方法的返回值
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }
    
    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before code");
        if (obj instanceof Order){
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        // 分库编号选择
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到 【db"+dbRouter+"】处理数据");

        // todo 设置DataSource;
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理  after code");
    }
}
