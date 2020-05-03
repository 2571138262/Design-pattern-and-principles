package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2;

// 返利收费子类
// 返利需要满足某个条件，返利多少
public class CashReturn extends CashSuper{

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        return money - Math.floor(money / moneyCondition) * moneyReturn;
    }
}