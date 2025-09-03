package edu.practice.day8;

public class YouTube implements VideoPlayer {
    private String videoTitle;

    public YouTube(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    @Override
    public void upload() {
        System.out.println( "📺 유튜브에"+getVideoTitle()+" 영상을 업로드합니다!");
    }

    @Override
    public void play() {
        System.out.println("▶️ 유튜브에서 " + getVideoTitle() +" 재생 중... 구독과 좋아요!");
    }
    @Override
    public void pause() {
        System.out.println("⏸️ 유튜브 영상을 일시정지합니다.");
    }
}
