package com.example.demo.designpattern设计模式.behavioral行为型.templatemethod模板方法模式;

/**
 * 课程抽象类
 */
public abstract class ACourse {

    /**
     * 制作课程， 不希望子类修改
     */
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }
    
    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写手记");
    }
    
    // 钩子方法 是否需要写手记
    protected boolean needWriteArticle(){
        return false;
    }
    
    abstract void packageCourse();
}
