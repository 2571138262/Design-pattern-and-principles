package com.example.demo.designpattern设计模式.creational创建型.simpleFactory简单工厂;

public class Test {

    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null){
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null){
            return;
        }
        video.produce();
    }

}
