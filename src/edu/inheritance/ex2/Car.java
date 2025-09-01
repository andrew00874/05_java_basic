package edu.inheritance.ex2;

class Car extends Vehicle {

    private String fuel;
    private int door;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year, color);
    }

    public Car(String brand, String model, int year, String color, String fuel, int door) {
        super(brand, model, year, color);
        this.fuel = fuel;
        this.door = door;
    }

    public Car(){

    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public void accelerate() {
        System.out.print("자동차가 액셀러레이터를 밟아");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.print("자동차가 브레이크를 밟아");
        super.brake();
    }

    public void honk() {
        System.out.println("자동차가 경적을 울립니다.");
    }

    public void openTrunk() {
        System.out.println("자동차의 트렁크가 열렸습니다.");
    }
}
