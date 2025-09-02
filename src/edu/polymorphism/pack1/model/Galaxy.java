package edu.polymorphism.pack1.model;

public class Galaxy extends SmartPhone {
    private int androidVersion;

    public Galaxy() {
    }

    public Galaxy(String display, String newsAgency, String ap, int androidVersion) {
        super(display, newsAgency, ap);
        this.androidVersion = androidVersion;
    }

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    @Override
    public String toString() {
        return "Galaxy androidVersion: " + androidVersion + super.toString();
    }
}
