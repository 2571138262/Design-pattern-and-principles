package com.example.demo.designpattern设计模式.creational创建型.builder建造者模式;

public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String couresPPT,
                             String courseVideo, String courseArticle,
                             String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(couresPPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
