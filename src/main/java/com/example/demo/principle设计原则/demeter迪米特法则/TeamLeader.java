package com.example.demo.principle设计原则.demeter迪米特法则;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }

}
