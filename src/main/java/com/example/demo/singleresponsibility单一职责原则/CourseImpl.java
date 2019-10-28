package com.example.demo.singleresponsibility单一职责原则;

public class CourseImpl implements ICourseManager, ICourseContent {

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
