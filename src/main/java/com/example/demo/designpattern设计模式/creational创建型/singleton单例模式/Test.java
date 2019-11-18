package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LasySingleton instance = LasySingleton.getInstance();

        System.out.println("main thread ==== " + ThreadLocalInstance.getInstance());
        System.out.println("main thread ==== " + ThreadLocalInstance.getInstance());
        System.out.println("main thread ==== " + ThreadLocalInstance.getInstance());
        System.out.println("main thread ==== " + ThreadLocalInstance.getInstance());
        System.out.println("main thread ==== " + ThreadLocalInstance.getInstance());
        System.out.println("main thread ==== " + ThreadLocalInstance.getInstance());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

//        // 测试序列化破坏单例
////        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
////
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
////        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        EnumInstance newInstance = (EnumInstance)oi.readObject();
//
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(newInstance.getData() == instance.getData());

        // 单例模式 - 反射攻击
        //Class<?> objectClass = Class.forName("HungrySingleton.class");
//        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;
//        Class objectClass = LasySingleton.class;
//        Class objectClass = EnumInstance.class;

//
//        Constructor constructor = objectClass.getDeclaredConstructor(); // 会报NoSuchMethodException
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);

        // thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
//        EnumInstance instance = (EnumInstance) constructor.newInstance("Thorn", 666);
//
//        LasySingleton instance = LasySingleton.getInstance();
//        LasySingleton newInstance = (LasySingleton)constructor.newInstance();

//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();


//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
//
//        System.out.println("program end");

//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();

    }

}
