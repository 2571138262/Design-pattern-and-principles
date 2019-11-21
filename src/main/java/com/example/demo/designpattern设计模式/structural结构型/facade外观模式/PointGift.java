package com.example.demo.designpattern设计模式.structural结构型.facade外观模式;

/**
 * 积分礼物
 */
public class PointGift {

    private String name;

    public PointGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
