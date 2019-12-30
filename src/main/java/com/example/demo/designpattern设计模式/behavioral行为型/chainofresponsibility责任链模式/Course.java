package com.example.demo.designpattern设计模式.behavioral行为型.chainofresponsibility责任链模式;

public class Course {

    private String name;
    private String article;
    private String video;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}