package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

/**
 * 懒汉单例模式 - 双重指令锁
 */
public class LazyDoubleCheckSingleton {

    // volatile 禁止指令重排序， 保证内存可见性
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    /**
                     * java语言规范 ： intra-thread sematics
                     * 1、分配内存
                     * 3、设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                     * 2、初始化对象
                     */
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
