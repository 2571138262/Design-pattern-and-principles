package com.example.demo.designpattern设计模式.creational创建型.abstractfactory抽象工厂;

public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }

}
