package com.example.demo.designpattern设计模式.creational创建型.abstractfactory抽象工厂;

public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
