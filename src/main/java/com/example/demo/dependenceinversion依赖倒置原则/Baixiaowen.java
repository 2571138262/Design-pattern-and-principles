package com.example.demo.dependenceinversion依赖倒置原则;

public class Baixiaowen {

    private ICourse iCourse;

    /**
     * 通过set注入
     * @param iCourse
     */
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /**
     * 通过构造器的方式注入
     */
//    public Baixiaowen(ICourse iCourse){
//        this.iCourse = iCourse;
//    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }


//    /**
//     * 在调用学习课程方法的时候，具体的实现交给高层决定，(这里的高层是Test)
//     * @param iCourse
//     */
//    public void studyImoocCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }

//    public void studyJavaCourse(){
//        System.out.println("学习java课程");
//    }
//
//    public void studyFECourse(){
//        System.out.println("学习前端课程");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("学习前端课程");
//    }



}
