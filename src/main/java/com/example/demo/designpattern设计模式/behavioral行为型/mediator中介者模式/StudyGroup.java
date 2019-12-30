package com.example.demo.designpattern设计模式.behavioral行为型.mediator中介者模式;

import java.util.Date;

/**
 * 学习群
 */
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

}