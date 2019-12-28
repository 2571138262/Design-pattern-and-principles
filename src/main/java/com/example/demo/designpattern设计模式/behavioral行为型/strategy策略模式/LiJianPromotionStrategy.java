package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式;

/**
 * 立减促销策略
 */
public class LiJianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("立减促销， 课程的价格直接减去配置的价格");
    }
}
