package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进1;

// 具体算法A
public class ConcreateStrategyA extends Strategy{

    @Override
    public void AlgorithmInterface() {
        System.err.println("算法A实现");
    }
}