package com.example.demo.designpattern设计模式.creational创建型.abstractfactory抽象工厂;

public class PythonCourseFactory implements CourseFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
