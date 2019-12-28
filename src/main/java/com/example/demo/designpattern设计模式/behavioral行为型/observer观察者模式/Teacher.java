package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * 讲师类 
 *      讲师观察的是课程，而不是问题，问题属于课程，
 *      观察者就是就是teacher 被观察者就是Course
 *      
 *      实现了 Observer 就成了 观察者
 */
public class Teacher implements Observer {
    
    // 讲师名称
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * 
     * @param o  被观察的对象
     * @param arg  消息的传递 
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + " 老师的 " + course.getCourseName() + " 课程接收到一个 " + question.getUserName() + " 提交的问答 ：" + question.getQuestionContent());
    }
}
