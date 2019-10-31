package com.example.demo.principle设计原则.liskovsubstitution里氏替换原则.methodoutput;

import java.util.HashMap;

public class Child extends Base {

    @Override
    public HashMap method() {

        System.out.println("子类method被执行");
        HashMap hashMap = new HashMap();
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}
