package edu.practice.day3;

import java.util.Scanner;

public class Practice5 {

    private String brand;
    private String model;
    private int fuel; // 연료량, 0~100
    private int speed = 0; // 현재 속도, 기본값 0
    private boolean isEngineOn = false; // 엔진 상태, 기본값 false
    private int totalDistance = 0; // 총 주행거리, 기본값 0

    // 기본 생성자
    public Practice5() {
        this.fuel = 100;
    }

    // 브랜드, 모델명만 받는 생성자 (fuel = 100으로 초기화)
    public Practice5(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.fuel = 100;
    }

    // 모든 필드를 받는 생성자
    public Practice5(String brand, String model, int fuel, int speed, boolean isEngineOn, int totalDistance) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.speed = speed;
        this.isEngineOn = isEngineOn;
        this.totalDistance = totalDistance;
    }

    // Getter and Setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    // Additional methods
    public void startEngine() {
        if (isEngineOn) {
            System.out.println("이미 시동이 걸려있습니다.");
        } else if (fuel == 0) {
            System.out.println("연료가 부족하여 시동을 걸 수 없습니다.");
        } else {
            isEngineOn = true;
            System.out.println(getModel() + " 엔진이 시동되었습니다.");
        }
    }

    public void stopEngine() {
        if (!isEngineOn) {
            System.out.println("이미 시동이 꺼져있습니다.");
        } else {
            isEngineOn = false;
            System.out.println(getModel() + " 엔진이 정지되었습니다.");
            setSpeed(0);
        }
    }

    public void accelerate(int speedUp) {
        if (!isEngineOn) {
            System.out.println("엔진이 꺼져있어 가속할 수 없습니다.");
        } else if (fuel == 0) {
            System.out.println("연료가 없어 가속할 수 없습니다.");
        } else {
            speed += speedUp;
            System.out.println(speedUp + "km/h로 가속했습니다. 현재 속도: " + speed + "km/h");
        }
    }

    public void brake(int speedDown) {
        setSpeed(getSpeed() - speedDown);
        if (getSpeed() < 0) {
            setSpeed(0);
        }
        System.out.println(speedDown + "km/h로 감속했습니다. 현재 속도: " + getSpeed() + "km/h");
    }

    public void refuel(int amount) {
        setFuel(getFuel() + amount);
        if (getFuel() > 100) {
            setFuel(100);
        }
        System.out.println(amount + "L 주유했습니다. 현재 연료량: " + getFuel() + "L");
    }

    public void drive(int distance) {
        if (!isEngineOn) {
            System.out.println("엔진이 꺼져있어 주행할 수 없습니다.");
            return;
        }
        if (getSpeed() == 0){
            System.out.println("속도가 0이여서 주행할 수 없습니다.");
            return;
        }
        int fuelNeeded = distance / 10; // 10km당 1L 소모
        if (fuel < fuelNeeded) {
            System.out.println("연료가 부족하여 " + distance + "km를 주행할 수 없습니다.");
            return;
        }

        fuel -= fuelNeeded;
        totalDistance += distance;
        System.out.println(distance + "km 주행했습니다. 연료 " + fuelNeeded + "L 소모되었습니다.");

        if (fuel == 0) {
            stopEngine();
            System.out.println("연료가 모두 소모되었습니다. 엔진을 정지합니다.");
        }
    }

    public void displayCarInfo() {
        System.out.println("\n=== 자동차 정보 ===");
        System.out.println("브랜드: " + brand);
        System.out.println("모델: " + model);
        System.out.println("연료량: " + fuel + "L");
        System.out.println("속도: " + speed + "km/h");
        System.out.println("엔진상태: " + (isEngineOn ? "ON" : "OFF"));
        System.out.println("총 주행거리: " + totalDistance + "km");
        System.out.println();
    }

}