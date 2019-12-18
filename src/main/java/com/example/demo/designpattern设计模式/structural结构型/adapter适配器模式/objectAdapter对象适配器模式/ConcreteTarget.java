package com.example.demo.designpattern设计模式.structural结构型.adapter适配器模式.classAdapter类适配器模式;

/**
 * 具体目标类
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
