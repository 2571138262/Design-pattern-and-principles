package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式;

import java.util.Observable;

/**
 * 课程 
 *      继承了  Observable 就成了被观察对象
 */
public class Course extends Observable {
    
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName() + " 在 " + course.getCourseName() + "提交了一个问题");
        // 被观察者状态发生改变
        setChanged();
        // 唤醒观察者
        notifyObservers(question);
    }
}
