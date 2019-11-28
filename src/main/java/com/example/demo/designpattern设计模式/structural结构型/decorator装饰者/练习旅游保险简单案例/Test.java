package com.example.demo.designpattern设计模式.structural结构型.decorator装饰者.练习旅游保险简单案例;

public class Test {

    public static void main(String[] args) {
        AInsuranceOfTravel aInsuranceOfTravel;
        // 购买基础保险
        aInsuranceOfTravel = new BaseTravelInsurance();

        // 追加意外保险1
        aInsuranceOfTravel = new Accident1(aInsuranceOfTravel);
        ((Accident1) aInsuranceOfTravel).thank();

        // 追加意外保险2
        aInsuranceOfTravel = new Accident2(aInsuranceOfTravel);
        ((Accident2) aInsuranceOfTravel).thank();


        System.out.println(" 您购买的保险有： " + aInsuranceOfTravel.getDesc() + "总计价格 ： " + aInsuranceOfTravel.getPrice());
    }

}
