package com.example.demo.designpattern设计模式.behavioral行为型.chainofresponsibility责任链模式;

/**
 * 批准者   ---- Handler大部分都用Handler
 */
public abstract class Approver {

    /**
     * 责任链模式关键的写法：这个类里边包含了一个自己同样类型的对象
     *      也就是说这里如果使用this的话，不一定和这个approve相等
     */
    protected Approver approver;

    /**
     * 设置下一个批准者
     */
    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    /**
     * 发布课程手记 或 视频 由子类决定
     * @param course
     */
    public abstract void deploy(Course course);

}