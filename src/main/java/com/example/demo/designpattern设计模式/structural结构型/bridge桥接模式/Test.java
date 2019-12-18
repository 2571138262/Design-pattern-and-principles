package com.example.demo.designpattern设计模式.structural结构型.bridge桥接模式;

public class Test {

    public static void main(String[] args) {
        // 创建银行
        Bank icbcBank = new ICBCBank(new DepositAccount());
        // 通过银行类型和账号类型得到账户
        Accout icbcAccout = icbcBank.openAccount();
        // 输出账户类型
        icbcAccout.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Accout icbcAccout2 = icbcBank2.openAccount();
        icbcAccout2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Accout abcAccout = abcBank.openAccount();
        abcAccout.showAccountType();
    }

}