package com.example.demo.designpattern设计模式.structural结构型.adapter适配器模式.classAdapter类适配器模式;

public class Test {

    public static void main(String[] args) {

        Target target = new ConcreteTarget();
        target.request();


        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }

}
