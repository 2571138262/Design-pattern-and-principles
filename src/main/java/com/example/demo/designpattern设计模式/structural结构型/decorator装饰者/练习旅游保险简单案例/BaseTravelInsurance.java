package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.练习旅游保险简单案例;

/**
 * 基础旅游保险
 */
public class BaseTravelInsurance extends AInsuranceOfTravel{

    @Override
    protected String getDesc() {
        return "    生命健康险";
    }

    @Override
    protected int getPrice() {
        return 1999;
    }
}
