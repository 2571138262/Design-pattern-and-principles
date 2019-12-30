package com.example.demo.designpattern设计模式.behavioral行为型.chainofresponsibility责任链模式;

/**
 * 手记批准者
 */
public class ArticleApprover extends Approver{

    @Override
    public void deploy(Course course) {
        if (course.getArticle() != null && !"".equals(course.getArticle())){
            System.out.println(course.getName() + " 含有手记批准");
            if (approver != null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName() + " 不包含手记，不批准，流程结束");
            return;
        }
    }
}