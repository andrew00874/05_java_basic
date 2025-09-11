package edu.polymorphism.pack4;

public class Chrome extends GoogleService{

    public Chrome() {
        super("Chrome");
    }

    public void Browser(String url) {
        System.out.println(url + " 로 이동합니다.");
    }

}
