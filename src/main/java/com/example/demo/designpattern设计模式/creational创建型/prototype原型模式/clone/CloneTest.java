package com.example.demo.designpattern设计模式.creational创建型.prototype原型模式.clone;


import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneListWithDate clwd = new CloneListWithDate();
        List<Date> dates = new ArrayList<>();
        Date date = new Date();
        date.setTime(66666666666L);
        dates.add(date);
        Date date1 = new Date();
        date1.setTime(77777777777L);
        dates.add(date1);
        clwd.setDates(dates);

        CloneListWithDate clwd1 = (CloneListWithDate) clwd.clone();

        System.out.println(clwd);
        System.out.println(clwd1);
        System.out.println(clwd == clwd1);
    }

}
