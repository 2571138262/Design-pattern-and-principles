package com.example.demo.designpattern设计模式.structural结构型.composite组合模式;


/**
 * 业务场景：慕课网有很多课程， 课程有名称和价格,
 *  例如Java课程，分属于Java课程的目录下，Python课程目录下有很对Python课程
 *
 */

/**
 * 目录组件 抽象，在父类中将所有课程的操作的实现都写完，然后由子类选择性的重写
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
