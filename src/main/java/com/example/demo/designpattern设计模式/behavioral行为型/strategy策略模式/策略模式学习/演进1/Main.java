package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进1;

public class Main {

    public static void main(String[] args) {

        Context context;

        context = new Context(new ConcreateStrategyA());
        context.contextInterface();

        context = new Context(new ConcreateStrategyB());
        context.contextInterface();

        context = new Context(new ConcreateStrategyC());
        context.contextInterface();

    }

}