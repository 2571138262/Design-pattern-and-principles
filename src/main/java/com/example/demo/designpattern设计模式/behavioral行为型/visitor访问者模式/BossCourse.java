package com.example.demo.designpattern设计模式.behavioral行为型.visitor访问者模式;

public class BossCourse extends Course{

    private int price;
    
    private int cost;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
