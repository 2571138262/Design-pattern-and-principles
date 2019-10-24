package com.example.demo.dependenceinversion依赖倒置原则;

public class Test {

    public static void main(String[] args) {
        /**
         * 面向实现编程， 应用层直接依赖底层
         */
//        Baixiaowen b = new Baixiaowen();
//        b.studyJavaCourse();
//        b.studyFECourse();
        // v2
//        Baixiaowen b = new Baixiaowen();
//        b.studyImoocCourse(new JavaCourse());
//        b.studyImoocCourse(new PythonCourse());
//        b.studyImoocCourse(new FECourse());

        // v3
//        Baixiaowen b = new Baixiaowen(new JavaCourse());
//        b.studyImoocCourse();

        Baixiaowen b = new Baixiaowen();
        b.setiCourse(new JavaCourse());
        b.studyImoocCourse();

        b.setiCourse(new FECourse());
        b.studyImoocCourse();
    }

}
