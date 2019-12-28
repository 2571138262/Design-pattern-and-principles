package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式;

/**
 * 满减促销策略
 */
public class ManJianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("满减促销， 满200 - 20 元");
    }
}
