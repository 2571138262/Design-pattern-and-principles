package com.example.demo.principle设计原则.dependenceinversion依赖倒置原则;

public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Python课程");
    }
}
