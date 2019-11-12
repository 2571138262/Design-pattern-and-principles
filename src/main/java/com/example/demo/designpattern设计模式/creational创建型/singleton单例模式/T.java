package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

public class T implements Runnable {

    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();

//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "     " + instance);
    }
}
