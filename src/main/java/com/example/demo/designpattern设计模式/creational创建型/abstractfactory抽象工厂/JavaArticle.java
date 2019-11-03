package com.example.demo.designpattern设计模式.creational创建型.abstractfactory抽象工厂;

public class JavaArticle extends Article {

    @Override
    public void produce() {
        System.out.println("编写Java手记");
    }
}
