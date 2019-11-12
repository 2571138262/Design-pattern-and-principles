package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

public class Test {

    public static void main(String[] args) {
//        LasySingleton instance = LasySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

        System.out.println("program end");
    }

}
