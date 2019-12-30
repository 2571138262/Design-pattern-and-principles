package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式.reviewwithEventBus;

import com.google.common.eventbus.EventBus;

public class Test {

    public static void main(String[] args) {
        // 创建线程总线
        EventBus eventBus = new EventBus();
        // 实例化教师类， 作为观察者
        Teacher teacher1 = new Teacher("Mr.Bai");
        Teacher teacher2 = new Teacher("Miss.Li");
        // 为总线注册观察者
        eventBus.register(teacher1);
        eventBus.register(teacher2);
        
        // 业务逻辑代码 --- 模拟学生提交问题
        Course course = new Course("java设计模式精讲");
        Question question = new Question();
        question.setUserName("小明");
        question.setQuestionContent("java中观察者模式怎么用？");
        
        // 向业务总线中提交消息（任务）
        course.produceQuestion(course, question);
        eventBus.post(question);
    }
    
}
