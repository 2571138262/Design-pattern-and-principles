package com.example.demo.designpattern设计模式.structural结构型.facade外观模式;

/**
 * 积分校验
 */
public class QualifyService {

    public boolean isAvailable(PointGift pointGift){
        System.out.println("校验" + pointGift.getName() + " 积分资格通过，库存通过");
        return true;
    }

}
