package com.example.demo.designpattern设计模式.structural结构型.adapter适配器模式;

public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();

        dc5.outputDC5V();
    }

}
