package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.练习旅游保险简单案例;

/**
 * 旅游保险装饰者抽象
 */
public abstract class AbstractDecoratorOfTravel extends AInsuranceOfTravel{

    private AInsuranceOfTravel aInsuranceOfTravel;

    public AbstractDecoratorOfTravel(AInsuranceOfTravel aInsuranceOfTravel) {
        this.aInsuranceOfTravel = aInsuranceOfTravel;
    }

    protected abstract void thank();

    @Override
    protected String getDesc() {
        return this.aInsuranceOfTravel.getDesc();
    }

    @Override
    protected int getPrice() {
        return this.aInsuranceOfTravel.getPrice();
    }
}
