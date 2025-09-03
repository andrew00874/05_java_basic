package edu.polymorphism.pack2.ex2;

public class Question extends Post{
    private int answerCount;

    public Question() {
    }

    public Question(String postId, String title, String author, String content) {
        super(postId, title, author, content);
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void addAnswer() {
        answerCount++;
    }
    @Override
    public void displayPost() {
        System.out.println("[Q&A]" + getTitle() + " 작성자 : " + getAuthor() + " 답변개수 : "+getAnswerCount() + "개 내용 : " + getContent() );
    }


}
