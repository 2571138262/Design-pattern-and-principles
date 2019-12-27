package com.example.demo.designpattern设计模式.behavioral行为型.templatemethod模板方法模式;

/**
 * 设计模式课程
 */
public class DesifnPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
