package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2;

// 正常收费子类
public class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}