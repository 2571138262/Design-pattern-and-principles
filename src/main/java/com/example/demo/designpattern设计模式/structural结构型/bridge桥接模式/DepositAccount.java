package com.example.demo.designpattern设计模式.structural结构型.bridge桥接模式;

/**
 * 定期账号
 */
public class DepositAccount implements Accout{

    @Override
    public Accout openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}