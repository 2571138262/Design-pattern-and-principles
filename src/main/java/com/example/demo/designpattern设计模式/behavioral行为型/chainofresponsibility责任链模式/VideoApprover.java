package com.example.demo.designpattern设计模式.behavioral行为型.chainofresponsibility责任链模式;

/**
 * 视频批准者
 */
public class VideoApprover extends Approver{

    @Override
    public void deploy(Course course) {
        if (course.getVideo() != null && !"".equals(course.getVideo())){
            System.out.println(course.getName() + " 含有视频批准");
            if (approver != null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName() + " 不包含视频，不批准，流程结束");
            return;
        }
    }
}