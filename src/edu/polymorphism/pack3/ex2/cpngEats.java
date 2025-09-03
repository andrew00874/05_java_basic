package edu.polymorphism.pack3.ex2;
/*
* 작성 순서
*
* 부모클래스 다음에 구현해야하는 기능들
* 부모클래스
* 구현해야하는 기능들
*
* 은 가능하나
* 구현해야하는 기능들 다음에 부모클래스가 올 수 없음!!!!
* */
public class cpngEats extends DeliverApp implements DeliveryService {
    public cpngEats(String username) {
        super("쿠팡이츠", username);
    }

    @Override
    public void orderFood() {
        System.out.println("쿠팡이츠 : 음식 주문 완료");
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("쿠팡 주문번호 : " + orderId + "GPS로 실시간 추적중입니다.");
    }
}
