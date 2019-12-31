package com.example.demo.designpattern设计模式.behavioral行为型.visitor访问者模式;

/**
 * 课程抽象类
 */
public abstract class Course {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void accept(IVisitor iVisitor);
}
