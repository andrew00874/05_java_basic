package edu.polymorphism.pack1.model;

public class iPhone extends SmartPhone{

    //IOS 운영체제 버전
    private int iosVersion;

    public iPhone() {
    }

    public iPhone(int iosVersion) {
        this.iosVersion = iosVersion;
    }

    public iPhone(String display, String newsAgency, String ap) {
        super(display, newsAgency, ap);
    }

    public iPhone(String display, String newsAgency, String ap, int iosVersion) {
        super(display, newsAgency, ap);
        this.iosVersion = iosVersion;
    }

    public int getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(int iosVersion) {
        this.iosVersion = iosVersion;
    }

    @Override
    public String toString() {
        return "IOS Version: " + iosVersion + super.toString();
    }
}
