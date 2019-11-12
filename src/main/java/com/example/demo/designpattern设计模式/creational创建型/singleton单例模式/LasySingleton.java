package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

/**
 * 懒汉单例模式 ： 延迟加载
 */
public class LasySingleton {

    private static LasySingleton lasySingleton = null;

    private LasySingleton(){}

    /**
     * 在静态方法上加 sychronized 锁 相当于锁的是这个类的class文件， 相当于锁了这个类
     * 在非静态方法上加 sychronized 锁 相当于锁的是堆内存中生成的对象
     * @return
     */
    public synchronized static LasySingleton getInstance(){
//        synchronized (LasySingleton.class){
            if (lasySingleton == null){
                lasySingleton = new LasySingleton();
            }
//        }
        return lasySingleton;
    }

}
