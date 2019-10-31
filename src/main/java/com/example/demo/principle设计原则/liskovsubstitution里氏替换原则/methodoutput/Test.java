package com.example.demo.principle设计原则.liskovsubstitution里氏替换原则.methodoutput;

public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }

}
