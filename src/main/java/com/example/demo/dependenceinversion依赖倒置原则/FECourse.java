package com.example.demo.dependenceinversion依赖倒置原则;

public class FECourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}
