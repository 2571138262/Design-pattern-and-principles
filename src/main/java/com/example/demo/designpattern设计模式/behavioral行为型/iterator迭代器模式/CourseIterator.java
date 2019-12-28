package com.example.demo.designpattern设计模式.behavioral行为型.iterator迭代器模式;

public interface CourseIterator {

    /**
     *  获取下一个课程
     * @return
     */
    Course nextCourse();

    /**
     * 判断当前课程是否是最后一个课程
     * @return
     */
    boolean isLastCourse();
    
}
