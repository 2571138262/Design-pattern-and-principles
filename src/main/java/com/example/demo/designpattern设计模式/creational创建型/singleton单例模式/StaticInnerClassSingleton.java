package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

/**
 * 使用静态内部类实现单例模式
 *      JVM 在类的初始化阶段(class加载后，并且是线程使用之前)，会执行类的初始化，
 *      JVM会获取一个锁，这个锁会同步多个线程对一个类的初始化
 *
 *      Java 语言规范(5种情况的发生，类、接口等立刻被初始化)
 *          1、有一个A类型的实例被创建
 *          2、A类中声明的一个静态方法被调用
 *          3、A类中声明的一个静态成员被赋值
 *          4、A类中声明的一个静态成员被使用，并且这个成员不是一个常量成员
 *          5、A类中如果是一个顶级类， 并且在A类中有断言嵌套的使用
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
        if (InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

}
