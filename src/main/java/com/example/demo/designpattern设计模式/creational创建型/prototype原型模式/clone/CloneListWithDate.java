package com.example.demo.designpattern设计模式.creational创建型.prototype原型模式.clone;

import lombok.Data;

import java.util.Date;
import java.util.List;

public class CloneListWithDate implements Cloneable{

    private List<Date> dates;

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneListWithDate{" +
                "dates=" + dates +
                '}' + super.toString();
    }
}
