package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式.reviewwithEventBus;

public class Question {

    // 用户名
    private String userName;
    // 问题的内容
    private String questionContent;
    
    private Course course;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
