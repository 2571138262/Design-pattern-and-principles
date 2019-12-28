package com.example.demo.designpattern设计模式.behavioral行为型.iterator迭代器模式;

/**
 * 对课程进行处理的接口
 */
public interface CourseAggregate {
    
    void addCourse(Course course);
    void removeCourse(Course course);

    /**
     * 获得课程集合的迭代器
     * @return
     */
    CourseIterator getCourseIterator();
    
}
