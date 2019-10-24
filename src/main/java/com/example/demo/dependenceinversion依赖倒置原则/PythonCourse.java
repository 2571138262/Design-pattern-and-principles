package com.example.demo.dependenceinversion依赖倒置原则;

public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Python课程");
    }
}
