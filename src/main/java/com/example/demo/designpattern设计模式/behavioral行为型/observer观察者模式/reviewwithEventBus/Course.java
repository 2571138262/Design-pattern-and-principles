package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式.reviewwithEventBus;

public class Course {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    /**
     * 发布课程问题
     * @param course
     * @param question
     */
    public void produceQuestion(Course course, Question question){
        question.setCourse(course);
        System.out.println(question.getUserName() + " 在 " + course.getCourseName() + "提交了一个问题");
    }
}
