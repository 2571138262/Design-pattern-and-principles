package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.v1版本不够优雅;

public class BattercakeWithEgg extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
