package com.example.demo.designpattern设计模式.behavioral行为型.interpreter解释器模式.Spring中的解析器;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Spring 的 EL 表达式 Expression Language
 */
public class SpringTest {

    public static void main(String[] args){
        org.springframework.expression.ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        int result = (Integer) expression.getValue();
        System.out.println(result);
    }
    
}
