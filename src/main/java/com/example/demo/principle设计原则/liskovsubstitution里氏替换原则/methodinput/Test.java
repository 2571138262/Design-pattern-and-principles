package com.example.demo.principle设计原则.liskovsubstitution里氏替换原则.methodinput;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        Child c = new Child();
        HashMap hashMap = new HashMap();
        c.method(hashMap);

        Base b = new Child();
        b.method(hashMap);
    }

}
