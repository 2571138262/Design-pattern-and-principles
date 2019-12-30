package com.example.demo.designpattern设计模式.behavioral行为型.command命令模式;

/**
 * 课程视频
 */
public class CourseVideo {
    
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }
    
    public void open(){
        System.out.println(this.name + " 课程的视频开放");
    }
    
    public void close(){
        System.out.println(this.name + " 课程的视频关闭");
    }
}
