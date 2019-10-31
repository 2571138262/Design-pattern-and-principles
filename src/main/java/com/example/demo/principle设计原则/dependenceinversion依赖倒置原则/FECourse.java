package com.example.demo.principle设计原则.dependenceinversion依赖倒置原则;

public class FECourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}
