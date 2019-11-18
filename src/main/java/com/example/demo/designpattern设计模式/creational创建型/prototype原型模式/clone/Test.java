package com.example.demo.designpattern设计模式.creational创建型.prototype原型模式.clone;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig)pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(6666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }

}
