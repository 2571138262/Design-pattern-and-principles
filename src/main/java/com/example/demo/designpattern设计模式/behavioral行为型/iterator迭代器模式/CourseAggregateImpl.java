package com.example.demo.designpattern设计模式.behavioral行为型.iterator迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {
    
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        this.courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        this.courseList.remove(course);
    }

    /**
     * 获取课程集合迭代器
     * @return
     */
    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
