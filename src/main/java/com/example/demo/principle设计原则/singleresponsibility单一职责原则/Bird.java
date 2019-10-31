package com.example.demo.principle设计原则.singleresponsibility单一职责原则;

public class Bird {

    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName + "用脚走");
        }else {
            System.out.println(birdName + "用翅膀飞");
        }
    }

}
