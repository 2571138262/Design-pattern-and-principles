package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式;

/**
 * 反现金促销策略
 */
public class FanDaiJinJuanPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("返现金促销");
    }
}
