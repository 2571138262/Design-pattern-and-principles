package com.example.demo.designpattern设计模式.behavioral行为型.interpreter解释器模式;

public class NumberInterpreter implements Interpreter {

    private int number;
    public NumberInterpreter(int number){
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.valueOf(number);
    }

    @Override
    public int interpter() {
        return this.number;
    }
}
