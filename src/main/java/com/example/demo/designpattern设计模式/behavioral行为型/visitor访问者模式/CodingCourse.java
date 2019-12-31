package com.example.demo.designpattern设计模式.behavioral行为型.visitor访问者模式;

/**
 * 实战课程  有价格
 */
public class CodingCourse extends Course {
    
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public void accept(IVisitor iVisitor){
        iVisitor.visit(this);
    }
}
