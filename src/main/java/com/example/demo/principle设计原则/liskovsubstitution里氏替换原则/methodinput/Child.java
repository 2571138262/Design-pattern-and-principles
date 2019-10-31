package com.example.demo.principle设计原则.liskovsubstitution里氏替换原则.methodinput;

import java.util.Map;

public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }
}
