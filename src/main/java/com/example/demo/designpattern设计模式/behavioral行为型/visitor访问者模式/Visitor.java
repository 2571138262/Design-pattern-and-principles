package com.example.demo.designpattern设计模式.behavioral行为型.visitor访问者模式;

/**
 * 访问者 
 *      根据不同的 visitor 对相同的数据产生不同的操作行为
 */
public class Visitor implements IVisitor {

    // 访问免费资源，打印所有免费课程名称
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程名称为：" + freeCourse.getName());
    }

    // 访问实战课程，打印所有实战课程名称及价格
    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程名称为：" + codingCourse.getName() + "；价格为：" + codingCourse.getPrice());
    }

    // 老板访问课程
    @Override
    public void visit(BossCourse boss) {
        System.out.println("老板访问课程：" + boss.getName() + "；价格为：" + boss.getPrice() + "；成本为：" + boss.getCost());
    }
}
