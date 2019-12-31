package com.example.demo.designpattern设计模式.behavioral行为型.visitor访问者模式;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMvn数据绑定");
        
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲");
        codingCourse.setPrice(299);
        
        BossCourse bossCourse = new BossCourse();
        bossCourse.setName("领导查看");
        bossCourse.setPrice(120);
        bossCourse.setCost(60);
        
        courseList.add(freeCourse);
        courseList.add(codingCourse);
        courseList.add(bossCourse);
        
        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
    
}
