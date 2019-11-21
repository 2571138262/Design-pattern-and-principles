package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

import java.io.Serializable;

/**
 * 饿汉式
 *      在类加载的时候就初始化
 *      缺点是如果这个类始终没有用过，就会造成内存的浪费
 */
public class HungrySingleton implements Serializable, Cloneable {

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 解决序列化破坏单例模式的问题
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }


    /**
     * 原型模式 -- 破坏单例测试
     *      避免克隆破坏 1、不要继承Cloneable接口
     *                 2、如果实现了Cloneable， 那么重写clone()方法，直接调用getInstance()方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
