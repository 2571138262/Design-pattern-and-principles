package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式.友好案例Subscribe注解;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    
    @Subscribe
    public void subscribe(String str){
        // 业务逻辑
        System.out.println("执行subscribe方法， 传入的参数是：" + str);
    }
    
}
