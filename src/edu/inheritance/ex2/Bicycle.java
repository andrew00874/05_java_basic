package edu.inheritance.ex2;

class Bicycle extends Vehicle {

    private int gearCount;
    private boolean isElectric;

    public Bicycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    public Bicycle(String brand, String model, int year, String color, int gearCount, boolean isElectric) {
        super(brand, model, year, color);
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    public Bicycle(){

    }

    @Override
    public void accelerate() {
        System.out.print("자전거가 페달을 밟아");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.print("자전거가 브레이크를 잡아");
        super.brake();
    }

    public void ringBell() {
        System.out.println("자전거가 벨을 울렸습니다.");
    }

    public void pedal() {
        System.out.println("자전거가 페달을 밟았습니다.");
    }
}
