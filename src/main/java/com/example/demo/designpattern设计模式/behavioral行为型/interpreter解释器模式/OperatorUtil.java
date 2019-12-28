package com.example.demo.designpattern设计模式.behavioral行为型.interpreter解释器模式;

/**
 * 工具类
 */
public class OperatorUtil {
    
    public static boolean isOperator(String symbol){
        return (symbol.equals("+") || symbol.equals("*"));
    }

    /**
     * 获取表达式符号解释器
     * @param firstExpression
     * @param secondExpression
     * @param symbol
     * @return
     */
    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol){
        if (symbol.equals("+")){
            return new AddInterpreter(firstExpression, secondExpression);
        }else if (symbol.equals("*")){
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
    
}
