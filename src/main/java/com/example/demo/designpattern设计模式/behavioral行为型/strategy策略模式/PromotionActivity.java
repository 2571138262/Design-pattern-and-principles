package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式;

/**
 * 促销活动， 用来包装促销策略
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    /**
     * 执行促销策略
     */
    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
