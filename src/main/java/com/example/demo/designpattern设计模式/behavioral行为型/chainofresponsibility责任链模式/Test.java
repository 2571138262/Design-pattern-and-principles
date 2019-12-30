package com.example.demo.designpattern设计模式.behavioral行为型.chainofresponsibility责任链模式;

public class Test {

    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new ArticleApprover();

        Course course = new Course();
        course.setName("Java设计模式精讲 -- By Geely");
        course.setArticle("Java设计模式精讲的手记");
        course.setVideo("Java设计模式精讲的视频");

        // 客户端来控制责任链条的顺序
        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }

}