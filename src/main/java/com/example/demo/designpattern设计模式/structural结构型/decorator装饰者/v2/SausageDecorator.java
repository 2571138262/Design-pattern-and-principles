package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.v2;

/**
 * 香肠装饰者
 */
public class SausageDecorator extends AbstractDecorator{

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "  加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }

    @Override
    protected void doSomething() {

    }
}
