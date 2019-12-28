package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.factory;

import com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销的策略工厂
 */
public class PromotionStrategyFactory {
    
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }

    // 默认的没有促销的策略
    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();
    
    private PromotionStrategyFactory() {
    }

    /**
     * 获取策促销略
     * @param promotionKey
     * @return
     */
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }
    
    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
