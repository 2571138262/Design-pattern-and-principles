package com.example.demo.designpattern设计模式.structural结构型.flyweight享元模式;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String deparyment){
        Manager manager = (Manager) EMPLOYEE_MAP.get(deparyment);

        if (manager == null){
            manager = new Manager(deparyment);
            System.out.print("创建部门经理 ： " + deparyment);
            String reportContent = deparyment + "部门汇报： 此次报告的主要内容为 。。。。";
            manager.setReportContent(reportContent);
            System.out.println("    创建部门经理 ： " + reportContent);
            EMPLOYEE_MAP.put(deparyment, manager);

        }
        return manager;
    }

}
