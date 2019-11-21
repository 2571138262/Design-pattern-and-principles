package com.example.demo.designpattern设计模式.structural结构型.facade外观模式;

public class Test {

    public static void main(String[] args) {
        PointGift pointGift = new PointGift("T恤");

        GiftExchangeService giftExchangeService = new GiftExchangeService();

//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPointPaymentService(new PointPaymentService());
//        giftExchangeService.setShippinService(new ShippinService());

        giftExchangeService.giftExchange(pointGift);
    }

}
