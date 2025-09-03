package edu.polymorphism.pack3.ex1;
//implements SNSMethod
public class Facebook extends MetaPlatform  {
    public Facebook(String userId) {
        super("Facebook", userId);
    }

    @Override
    public void post(String content) {
        System.out.println("[Facebook] 텍스트 게시물 : " + content);
    }

    @Override
    public void like(String postId) {
        System.out.println("[Facebook] 게시물 : " + postId + "에 좋아요를 눌렀습니다.");
    }
}
