package com.example.demo.principle设计原则.singleresponsibility单一职责原则;

public interface ICourse {

    // 课程内容， 应该单独抽出一个接口
    String getCourseName();

    byte[] getCourseVideo();

    // 课程管理，
    void studyCourse();

    void refundCourse();
}
