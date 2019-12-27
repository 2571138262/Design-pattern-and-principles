package com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.staticproxy静态代理包;

import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.IOrderService;
import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.Order;
import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.OrderServiceImpl;
import com.example.demo.designpattern设计模式.structural结构型.proxy代理模式.db.DataSourceContextHolder;

/**
 * OrderService的静态代理
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    /**
     * 保存订单 的增强    ------------ 静态代理
     *
     * @param order 订单对象
     * @return 生效行数
     */
    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    // 执行saveOrder之前要执行的代码
    private void beforeMethod(Order order) {
        int userId= order.getUserId();
        // 分库编号选择
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到 【db"+dbRouter+"】处理数据");

        // todo 设置DataSource;
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        System.out.println("静态代理  before code");
    }

    // 执行saveOrder之后要执行的代码
    private void afterMethod() {
        System.out.println("静态代理  after code");
    }
}
