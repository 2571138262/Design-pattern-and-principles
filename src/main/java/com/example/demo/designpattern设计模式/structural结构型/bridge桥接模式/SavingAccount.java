package com.example.demo.designpattern设计模式.structural结构型.bridge桥接模式;

/**
 * 活期账号
 */
public class SavingAccount implements Accout{

    @Override
    public Accout openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}