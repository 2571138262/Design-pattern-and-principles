package com.example.demo.designpattern设计模式.behavioral行为型.interpreter解释器模式;

import java.util.regex.Pattern;

/**
 * 调用栈的数据结构  字符串前几位为 传入的数据 6 100 11 后几位为 算术运算符 + *  ======== （11 + 100） * 6 
 */
public class Test {

    public static void main(String[] args) {
        String thornInputStr = "6 100 11 + *";
        ThornExpressionParser expressionParser = new ThornExpressionParser();
        int result = expressionParser.parse(thornInputStr);
        System.out.println("解释器计算结果 ： " + result);
    }
    
}
