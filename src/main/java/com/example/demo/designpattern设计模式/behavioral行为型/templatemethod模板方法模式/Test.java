package com.example.demo.designpattern设计模式.behavioral行为型.templatemethod模板方法模式;

public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start----");
        ACourse designPatternCourse = new DesifnPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end----");

        System.out.println("前端课程start----");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end----");
    }
}
