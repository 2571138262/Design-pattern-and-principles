package com.example.demo.designpattern设计模式.behavioral行为型.state状态模式;

/**
 * 课程视频上下文对象
 */
public class CourseVideoContext {
    
    private CourseVideoState courseVideoState;
    // 播放状态
    public final static  PlayState PALY_STATE = new PlayState();
    // 停止状态
    public final static  StopState STOP_STATE = new StopState();
    // 暂停状态
    public final static  PauseState PAUSE_STATE = new PauseState();
    // 快进状态
    public final static  SpeedState SPEED_STATE = new SpeedState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }
    
    public void play(){
        this.courseVideoState.play();
    }

    public void speed(){
        this.courseVideoState.speed();
    }

    public void stop(){
        this.courseVideoState.stop();
    }

    public void pause(){
        this.courseVideoState.pause();
    }
}
