package com.example.demo.principle设计原则.liskovsubstitution里氏替换原则.methodinput;

import java.util.HashMap;

public class Base {

    public void method(HashMap map){
        System.out.println("父类被执行");
    }

}
