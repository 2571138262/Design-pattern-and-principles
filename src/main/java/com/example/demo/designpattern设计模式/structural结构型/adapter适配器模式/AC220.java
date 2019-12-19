package com.example.demo.designpattern设计模式.structural结构型.adapter适配器模式;

/**
 * 交流电 220V    ----------- 被适配者
 */
public class AC220 {

    public int outPutAC220V(){
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }

}
