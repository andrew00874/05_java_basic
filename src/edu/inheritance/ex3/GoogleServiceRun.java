package edu.inheritance.ex3;

public class GoogleServiceRun {
    public static void main(String[] args) {

        // 1. Gmail 객체 생성
        Gmail gmail = new Gmail("user@gmail.com","홍길동","개인계정",150,8);


        // 2. Youtube 객체 생성
        Youtube youtube = new Youtube("Youtube","user1@gmail.com","박길동","개인계정",50,true);


        System.out.println("=== 구글 서비스 사용자 정보 ===");
        gmail.showUserInfo();
        youtube.showUserInfo();

        System.out.println("\n=== 로그인 ===");
        gmail.login();
        youtube.login();

        System.out.println("\n=== 서비스별 검색 ===");
        gmail.search();
        youtube.search();

        System.out.println("\n=== 서비스별 고유 기능 ===");
        gmail.sendEmail();

        youtube.uploadVideo();
        youtube.subscribe();
        youtube.watchAd();

        System.out.println("구독자 수 :" + youtube.getSubscriber() + "명");

        System.out.println("\n=== 로그아웃 ===");
        gmail.logout();
        youtube.logout();

    }
}