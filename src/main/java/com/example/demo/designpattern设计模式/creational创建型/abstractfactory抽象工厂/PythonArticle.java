package com.example.demo.designpattern设计模式.creational创建型.abstractfactory抽象工厂;

public class PythonArticle extends Article {

    @Override
    public void produce() {
        System.out.println("编写Python手记");
    }
}
