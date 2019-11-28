package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.v2;

/**
 * 鸡蛋装饰者
 */
public class EggDecorator extends AbstractDecorator{

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "  加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }

    @Override
    protected void doSomething() {

    }
}
