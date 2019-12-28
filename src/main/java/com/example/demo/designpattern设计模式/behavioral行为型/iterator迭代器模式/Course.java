package com.example.demo.designpattern设计模式.behavioral行为型.iterator迭代器模式;

/**
 * 业务场景 ： 网站的课程 
 *  课程的实体类
 */
public class Course {
    
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
