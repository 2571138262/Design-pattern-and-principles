package com.example.demo.designpattern设计模式.behavioral行为型.observer观察者模式;

public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");
        
        // 给被观察者添加一个观察者
        course.addObserver(teacher1);
        course.addObserver(teacher2);
        
        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("Thorn");
        question.setQuestionContent("Java主函数如何编写");
        
        course.produceQuestion(course, question);
    }
    
}
