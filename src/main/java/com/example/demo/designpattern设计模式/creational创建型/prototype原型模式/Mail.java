package com.example.demo.designpattern设计模式.creational创建型.prototype原型模式;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Mail implements Cloneable{

    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Clone mail object");
        return super.clone();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }
}
