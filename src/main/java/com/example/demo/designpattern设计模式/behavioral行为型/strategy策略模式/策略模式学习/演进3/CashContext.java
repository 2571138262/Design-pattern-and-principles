package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进3;

import com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2.CashNormal;
import com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2.CashRebate;
import com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2.CashReturn;
import com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2.CashSuper;

public class CashContext {

    public CashSuper cs = null;

    public CashContext(String type) {
        switch (type)
        {
            case "正常收费" :
                cs = new CashNormal();
                break;
            case "满 300 返 100" :
                cs = new CashReturn(300, 100);
                break;
            case "打 8 折" :
                cs = new CashRebate(0.8);
                break;
        }

    }



    public double getResule(double money){
        return cs.acceptCash(money);
    }
}