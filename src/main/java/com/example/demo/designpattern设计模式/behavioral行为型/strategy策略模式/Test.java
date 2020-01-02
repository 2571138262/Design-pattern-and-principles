package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式;

import com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.factory.PromotionStrategyFactory;
import org.apache.commons.lang.StringUtils;

public class Test {

    public static void main(String[] args) {
        // 618促销活动  -- 立减促销
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        // 1111双十一促销活动  -- 返现促销
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();

    }
    

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        
//        String promotionKey = "LIJIAN";
//        
//        if (StringUtils.equals(promotionKey, "LIJIAN")){
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        }else if (StringUtils.equals(promotionKey, "FANXIAN")){  
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }// ......
//        promotionActivity.executePromotionStrategy();
//    }

    // 策略模式 + 工厂模式
//    public static void main(String[] args) {
//        String promotionKey = "AAA";
//        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
//        promotionActivity.executePromotionStrategy();
//    }
    
}
