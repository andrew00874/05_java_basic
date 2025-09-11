package edu.polymorphism.pack4;

public class YouTube extends GoogleService{
    public YouTube(){
        super("YouTube");
    }

    public void watchVideo(String videoTitle) {
        System.out.println(videoTitle + "영상을 시청합니다.");
    }
}
