package com.example.demo.designpattern设计模式.behavioral行为型.interpreter解释器模式;


import java.util.Stack;

public class ThornExpressionParser {
    
    private Stack<Interpreter> stack = new Stack<>();
    
    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray){
            if (!OperatorUtil.isOperator(symbol)){
                Interpreter numberExpression = new NumberInterpreter(symbol);   
                stack.push(numberExpression);
                System.out.println(String.format("入栈： %d", numberExpression.interpter()));
            }else {
                // 是运算符号可以计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d" , firstExpression.interpter(), secondExpression.interpter()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符：%s", operator));
                int result = operator.interpter();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈: %d", result));
            }
        }
        int result = stack.pop().interpter();
        return result;
    }
    
}
