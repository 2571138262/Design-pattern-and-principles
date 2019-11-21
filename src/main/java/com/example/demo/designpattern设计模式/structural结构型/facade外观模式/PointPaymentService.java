package com.example.demo.designpattern设计模式.structural结构型.facade外观模式;

/**
 * 支付服务
 */
public class PointPaymentService {

    public boolean pay(PointGift pointGift){
        // 扣减积分
        System.out.println("支付" + pointGift.getName() + " 积分成功");
        return true;
    }

}
