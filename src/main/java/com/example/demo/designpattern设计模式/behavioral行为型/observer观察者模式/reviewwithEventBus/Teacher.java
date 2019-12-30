package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式.reviewwithEventBus;

import com.google.common.eventbus.Subscribe;

/**
 * 教师类， 观察者
 */
public class Teacher {

    // 讲师名称
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * 当被观察对象在事件总线中post了任务(消息)以后会触发观察者的这个方法
     * @param q  消息的传递 
     */
    @Subscribe
    public void acceptQuestion(Question q) {
        Question question = (Question) q; 
        Course course = q.getCourse();
        System.out.println(teacherName + " 老师的 " + course.getCourseName() + " 课程接收到一个 " + question.getUserName() + " 提交的问答 ：" + question.getQuestionContent());
    }
}
