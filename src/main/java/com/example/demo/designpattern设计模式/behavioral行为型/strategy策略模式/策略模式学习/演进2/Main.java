package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2;

public class Main {

    public static void main(String[] args) {
        CashSuper cs = null;

        cs = CashFactory.createCashAccept("正常收费");
        System.err.println("正常收费 ：" + cs.acceptCash(1000d));

        cs = CashFactory.createCashAccept("满 300 返 100");
        System.err.println("满 300 返 100 ：" + cs.acceptCash(1000d));

        cs = CashFactory.createCashAccept("打 8 折");
        System.err.println("打 8 折 ：" + cs.acceptCash(1000d));
    }

}