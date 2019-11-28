package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.练习旅游保险简单案例;

public class Accident2 extends AbstractDecoratorOfTravel {

    public Accident2(AInsuranceOfTravel aInsuranceOfTravel) {
        super(aInsuranceOfTravel);
    }

    @Override
    protected void thank() {
        System.out.println("    感谢您另外购买意外保险 -- 2");
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " + 意外保险 2 ";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 450;
    }
}
