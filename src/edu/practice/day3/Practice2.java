package edu.practice.day3;

public class Practice2 {
    private String model;
    private int batteryLevel;
    private boolean isPowerOn;

    public Practice2(){

    }
    public Practice2(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void status(){
        System.out.println("=== 스마트폰 상태 ===");
        System.out.println("모델 : " + getModel());
        System.out.println("배터리 : " + getBatteryLevel() + "%");
        if (isPowerOn()) {
            System.out.println("전원 상태 : ON");
        } else {
            System.out.println("전원 상태 : OFF");
        }
        System.out.println();
    }

    public void charge(){
        System.out.println("30% 충전되었습니다.");
        int level = getBatteryLevel();
        if (level + 30 > 100){
            level = 100;
        } else {
            level = level + 30;
        }
        setBatteryLevel(level);
        status();
    }
    public void useBattery(){
        System.out.println("배터리를 30% 사용했습니다.");
        setBatteryLevel(getBatteryLevel() - 30);
        if (getBatteryLevel() <= 0) {
            setBatteryLevel(0);
            poweroff();
        }
        status();
    }
    public void poweroff(){
        System.out.println("배터리가 0%가 되어 전원이 꺼졌습니다.");
        setPowerOn(false);
    }
}
