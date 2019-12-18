package com.example.demo.designpattern设计模式.structural结构型.bridge桥接模式;

/**
 * 银行
 */
public abstract class Bank {

    protected Accout accout;

    public Bank(Accout accout) {
        this.accout = accout;
    }

    abstract Accout openAccount();
}