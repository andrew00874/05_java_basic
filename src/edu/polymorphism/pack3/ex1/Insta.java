package edu.polymorphism.pack3.ex1;
//implements SNSMethod
public class Insta extends MetaPlatform  {
    public Insta(String userId) {
        super("Insta", userId);
    }

    @Override
    public void post(String content) {
        System.out.println("[Insta] 텍스트 게시물 : " + content);
    }

    @Override
    public void like(String postId) {
        System.out.println("[Insta] 게시물 : " + postId + "에 하트를 눌렀습니다.");
    }
}
