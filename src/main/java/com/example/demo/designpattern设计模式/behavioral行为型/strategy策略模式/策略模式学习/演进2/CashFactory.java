package com.example.demo.designpattern设计模式.behavioral行为型.strategy策略模式.策略模式学习.演进2;

public class CashFactory
{

    public static CashSuper createCashAccept(String types)
    {
        CashSuper cs = null;
        switch (types)
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
        return cs;
    }

}