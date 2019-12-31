package com.example.demo.designpattern设计模式.behavioral行为型.state状态模式;

/**
 * 课程视频状态 ：播放、快进、暂停、停止 ...
 */
public abstract class CourseVideoState {
    
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }
    
    // 播放
    public abstract void play();
    // 快进
    public abstract void speed();
    // 暂停
    public abstract void pause();
    // 停止
    public abstract void stop();
}
