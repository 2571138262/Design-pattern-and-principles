package com.example.demo.designpattern设计模式.structural结构型.bridge桥接模式;

/**
 * 中国工商银行
 */
public class ICBCBank extends Bank{

    public ICBCBank(Accout accout) {
        super(accout);
    }

    @Override
    Accout openAccount() {
        System.out.println("打开工商银行账号");
        accout.openAccount();
        return accout;
    }
}