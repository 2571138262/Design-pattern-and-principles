package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式;

/**
 * 返现促销策略
 */
public class FanXianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("返现促销， 返回的金额存放到用户账户余额中");
    }
}
