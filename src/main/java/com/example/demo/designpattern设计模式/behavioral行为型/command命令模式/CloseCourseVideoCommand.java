package com.example.demo.designpattern设计模式.behavioral行为型.command命令模式;

public class CloseCourseVideoCommand implements Command {
    
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
