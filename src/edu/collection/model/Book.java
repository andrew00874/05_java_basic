package edu.collection.model;

//클래스를 생성할 때 model.Book 와 같은 형식으로 저장하면 model 이라는 폴더와 Book 문서가 동시 생성
public class Book {
    // 필드 속성 인스턴스 변수
    private String title;
    private String author;
    private int price;

    // 메서드 생성자 파라미터 생성자 게터 세터 toString 생성
    // 아래 작성한 모든 기능들은 추후 @생성자 @파라미터생성자 @개터 @세터 @투스트링과 같은 형태로
    // 추후에는 가볍고 편하게 작성할 예정
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
