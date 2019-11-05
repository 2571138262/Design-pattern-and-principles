package com.example.demo.designpattern设计模式.creational创建型.builder建造者模式.v2;

import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲Video")
//                .buildCourseArticle("Java设计模式精讲Article")
                .buildCourseQA("Java设计模式精讲QA").build();
        System.out.println(course);

        /**
         * ImmutableSet 是Google 的 guava 开源java 库
         */

    }

}
