package com.example.demo.designpattern设计模式.creational创建型.singleton单例模式;

/**
 * 基于ThreadLocal的线程单例
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
            = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){}

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }



}
