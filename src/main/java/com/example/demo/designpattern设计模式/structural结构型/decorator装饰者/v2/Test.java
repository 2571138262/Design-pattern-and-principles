package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.v2;

public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        // 要一个煎饼
        aBattercake = new Battercake();
        // 加一个鸡蛋
        aBattercake = new EggDecorator(aBattercake);
        // 再加一个鸡蛋
        aBattercake = new EggDecorator(aBattercake);
        // 加一个火腿
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + "销售价格 ： " + aBattercake.cost());
    }
}
