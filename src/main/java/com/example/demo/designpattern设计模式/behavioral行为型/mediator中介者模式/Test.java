package com.example.demo.designpattern设计模式.behavioral行为型.mediator中介者模式;


public class Test {

    public static void main(String[] args) {
        User hudong = new User("Hudong");
        User houmingxin = new User("HouMingXin");

        hudong.sendMessage("Hey! HouMingXin Let's go to study");
        houmingxin.sendMessage("OK! Geely");
    }

}