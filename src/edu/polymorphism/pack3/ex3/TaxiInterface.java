package edu.polymorphism.pack3.ex3;

public interface TaxiInterface {
    // 추상클래스 내부의 작성된 추상 메서드를 인터페이스로 기능만 분리하여 작성하고
    // 추상메서드가 필요한 클래스에 interface TaxiInterface 를 구현하겠다 추가하여 문제없이
    // 동작하도록 수정

    public void callTaxi();
    public int calculateFare(int distance);
    public void showDriverInfo();
}
