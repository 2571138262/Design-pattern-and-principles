package com.example.demo.designpattern设计模式.behavioral行为型.iterator迭代器模式;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {
    
    private List courseList;
    // 位置
    private int position; 
    
    Course course;
    
    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);
        course = (Course) courseList.get(position);
        position ++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (position < courseList.size()){
            return false;
        }
        return true;
    }
}
