package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉单例模式 ： 延迟加载
 */
public class LasySingleton {

    private static LasySingleton lasySingleton = null;

    private static boolean flag = true;

    private LasySingleton(){
        if (flag){
            flag = false;
        }else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

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

    /**
     * 测试反射攻击
     * @param args
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objectClass = LasySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);

        LasySingleton o1 = LasySingleton.getInstance();

        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1, true);
        LasySingleton o2 = (LasySingleton) c.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }

}
