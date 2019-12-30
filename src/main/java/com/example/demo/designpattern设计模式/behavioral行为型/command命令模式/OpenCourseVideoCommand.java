package com.example.demo.designpattern设计模式.behavioral行为型.command命令模式;

public class OpenCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
