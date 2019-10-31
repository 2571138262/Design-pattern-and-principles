package com.example.demo.designpattern设计模式.creational创建型.factorymethod工厂方法;

public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
