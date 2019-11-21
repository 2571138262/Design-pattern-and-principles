package com.example.demo.designpattern设计模式.creational创建型.prototype原型模式.clone;

import com.example.demo.designpattern设计模式.creational创建型.singleton单例模式.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test通过原型模式的clone来破坏单例 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton  hungrySingleton = HungrySingleton.getInstance();

        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");

        method.setAccessible(true);

        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);

        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }

}
