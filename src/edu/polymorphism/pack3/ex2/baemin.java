package edu.polymorphism.pack3.ex2;

public class baemin extends DeliverApp implements DeliveryService{

    public baemin(String username) {
        super("배민", username);
    }

    @Override
    public void orderFood() {
        System.out.println("배민 : 주문되었습니다.");
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("배민 주문번호 : " + orderId + "GPS로 실시간 추적중입니다.");
    }
}
