package com.example.demo.designpattern设计模式.structural结构型.adapter适配器模式.objectAdapter对象适配器模式;

public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // ..
        adaptee.adapteeRequest();
        // ..
    }
}
