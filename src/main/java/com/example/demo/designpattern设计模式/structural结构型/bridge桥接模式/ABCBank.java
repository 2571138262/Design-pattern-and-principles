package com.example.demo.designpattern设计模式.structural结构型.bridge桥接模式;

/**
 * 中国农业银行
 */
public class ABCBank extends Bank{

    public ABCBank(Accout accout) {
        super(accout);
    }

    @Override
    Accout openAccount() {
        System.out.println("打开中国农业银行账号");
        accout.openAccount();
        return accout;
    }
}