package com.example.demo.designpattern设计模式.structural结构型.adapter适配器模式.classAdapter类适配器模式;

/**
 * 适配者
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        // ...
        super.adapteeRequest();
        // ...
    }
}
