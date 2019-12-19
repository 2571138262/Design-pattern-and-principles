package com.example.demo.designpattern设计模式.structural结构型.flyweight享元模式;

public class Manager implements Employee {

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    //        ---- 内部状态
    private String title = "部门经理";
    // 部门   ---- 此时就是一个外部状态， 由外部传递
    private String department;
    // 报告内容
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
