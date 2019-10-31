package com.example.demo.principle设计原则.dependenceinversion依赖倒置原则;

public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习java课程");
    }
}
