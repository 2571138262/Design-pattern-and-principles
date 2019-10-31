package com.example.demo.principle设计原则.openclose开闭原则;

public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java从零到企业级电商项目开发", 345d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID: " + javaCourse.getId()
                + "  课程名称: " + javaCourse.getName()
        + "  课程原价: " + javaCourse.getPrice()
        + "  课程打折价格: " + javaCourse.getDiscountPrice());
    }

}
