package com.example.demo.singleresponsibility单一职责原则;

public interface ICourseContent {

    // 课程内容， 应该单独抽出一个接口
    String getCourseName();

    byte[] getCourseVideo();

}
