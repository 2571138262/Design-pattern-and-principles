package com.example.demo.designpattern设计模式.creational创建型.prototype原型模式.clone;

import lombok.Data;

import java.util.Date;


public class Pig implements Cloneable{

    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig)super.clone();

        // 深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
//        return super.clone();
    }

    public Pig() {
    }

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
