package com.example.demo.designpattern设计模式.structural结构型.facade外观模式;

/**
 * 物流子系统
 */
public class ShippinService {

    public String shipGite(PointGift pointGift){
        // 物流系统的对接逻辑

        System.out.println(pointGift.getName() + "进入物流系统");

        String shippingOrderNo = "666";
        return shippingOrderNo;
    }

}
