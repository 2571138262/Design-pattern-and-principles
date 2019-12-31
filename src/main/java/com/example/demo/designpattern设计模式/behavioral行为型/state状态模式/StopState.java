package com.example.demo.designpattern设计模式.behavioral行为型.state状态模式;

/**
 * 暂停状态
 */
public class StopState extends CourseVideoState{

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PALY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("Error 停止状态不能快进");
    }

    @Override
    public void pause() {
        System.out.println("Error 停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放课程视频状态");
    }
    
}
