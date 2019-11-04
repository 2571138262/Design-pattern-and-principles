package com.example.demo.designpattern设计模式.creational创建型.builder建造者模式;


import lombok.Data;

@Data
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    // question answer
    private String courseQA;

}
