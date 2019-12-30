package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式.友好案例Subscribe注解;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {

    public static void main(String[] args) {
        // 创建了一个事件总线 
        // EventBus Guava 提供的实现观察者的核心类
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");
    }
    
}
