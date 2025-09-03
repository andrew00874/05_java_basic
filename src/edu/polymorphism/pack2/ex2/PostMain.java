package edu.polymorphism.pack2.ex2;

import java.awt.image.renderable.RenderableImage;

public class PostMain {
    public static void main(String[] args) {
        Notice notice = new Notice("N001", "사이트 점검 안내", "관리자", "오늘 밤 12시 점검합니다.", "긴급");
        Question question = new Question("Q001", "회원가입이 안돼요", "김질문", "회원가입 버튼을 눌러도 반응이 없습니다.");
        Review review = new Review("R001", "서비스 이용 후기", "이후기", "정말 좋은 서비스네요!", 5);
        Post[] posts = {notice, question, review};
        System.out.println("===============");
        for(Post post : posts) {
            post.displayPost();
            post.like();
            post.share();
            System.out.println("===============");
        }
    }
}
