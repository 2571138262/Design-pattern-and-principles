package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式.友好案例Subscribe注解;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    /**
     * 观察者注解 当被观察对象在事件总线中post了任务以后会触发观察者的这个方法
     * @param str
     */
    @Subscribe 
    public void subscribe(String str){
        // 业务逻辑
        System.out.println("执行subscribe方法， 传入的参数是：" + str);
    }
    
}
