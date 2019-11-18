package com.example.demo.designpattern设计模式.creational创建型.prototype原型模式.abstractprototype;

public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
