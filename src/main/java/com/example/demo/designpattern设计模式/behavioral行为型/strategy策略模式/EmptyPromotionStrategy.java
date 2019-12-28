package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式;

/**
 * 默认的空策略
 */
public class EmptyPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
