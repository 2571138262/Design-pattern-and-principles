package com.example.demo.designpattern设计模式.structural结构型.facade外观模式;

public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private ShippinService shippinService = new ShippinService();
    private PointPaymentService pointPaymentService = new PointPaymentService();

//    public void setQualifyService(QualifyService qualifyService) {
//        this.qualifyService = qualifyService;
//    }
//
//    public void setShippinService(ShippinService shippinService) {
//        this.shippinService = shippinService;
//    }
//
//    public void setPointPaymentService(PointPaymentService pointPaymentService) {
//        this.pointPaymentService = pointPaymentService;
//    }

    public void giftExchange(PointGift pointGift){
        if (qualifyService.isAvailable(pointGift)){
            // 资格校验通过
            if (pointPaymentService.pay(pointGift)){
                // 如果字符积分成功
                String shippingOrderNo = shippinService.shipGite(pointGift);
                System.out.println("物流系统下单成功，订单号为： " + shippingOrderNo);
            }
        }
    }
}
