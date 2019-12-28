package com.example.demo.designpattern设计模式.behavioral行为型.interpreter解释器模式;

/**
 * 乘法解释器
 */
public class MultiInterpreter implements Interpreter{

    private Interpreter firstExpression, secondExpression; // 俩个表达式

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpter() {
        return this.firstExpression.interpter() * this.secondExpression.interpter();
    }

    @Override
    public String toString() {
        return "*";
    }
}
