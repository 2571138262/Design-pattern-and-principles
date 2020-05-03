package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进1;

// 上下文
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 上下文接口
    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}