package edu.inheritance.ex2;

// 오토바이 클래스
class Motorcycle extends Vehicle {

    private int cc;
    private boolean isHelmetOn;
    public Motorcycle(String brand, String model, int year, String color, int cc, boolean isHelmetOn) {
        super(brand, model, year, color);
        this.cc = cc;
        this.isHelmetOn = isHelmetOn;
    }
    public Motorcycle() {

    }

    @Override
    public void accelerate() {
        System.out.print("오토바이가 스로틀을 돌려");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.print("오토바이가 브레이크 레버를 당겨");
        super.brake();
    }

    public void wheelie() {
        System.out.println("오토바이가 앞바퀴를 들어 윌리를 합니다.");
    }

    public void putOnHelmet() {
        System.out.println("오토바이 운전자가 헬멧을 씁니다.");
    }
}