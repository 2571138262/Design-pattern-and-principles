package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.v2;

public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
