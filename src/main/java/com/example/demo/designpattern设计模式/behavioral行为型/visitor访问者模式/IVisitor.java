package com.example.demo.designpattern设计模式.behavioral行为型.visitor访问者模式;

public interface IVisitor {
    
    void visit(FreeCourse freeCourse);
    
    void visit(CodingCourse codingCourse);
    
    void visit(BossCourse boss);
    
}
