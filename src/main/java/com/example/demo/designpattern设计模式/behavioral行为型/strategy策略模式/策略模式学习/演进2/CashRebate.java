package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2;

// 打折收费子类
public class CashRebate extends CashSuper{

    // 折扣
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}