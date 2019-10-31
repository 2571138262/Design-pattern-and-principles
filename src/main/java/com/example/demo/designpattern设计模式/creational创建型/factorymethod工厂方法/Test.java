package com.example.demo.designpattern设计模式.creational创建型.factorymethod工厂方法;

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();

        Video video = videoFactory.getVideo();

        video.produce();


        VideoFactory videoFactory1 = new FEVideoFactory();

        Video video1 = videoFactory1.getVideo();

        video1.produce();
    }

}
