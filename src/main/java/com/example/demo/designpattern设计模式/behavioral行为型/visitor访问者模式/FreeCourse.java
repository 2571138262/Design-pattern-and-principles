package com.example.demo.designpattern设计模式.behavioral行为型.visitor访问者模式;

/**
 * 免费课程  没有价格
 */
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor iVisitor){
        iVisitor.visit(this);
    }
    
}
