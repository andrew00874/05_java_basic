package edu.practice.day4;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(){
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        isAvailable = true;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void bookInfo(){
        System.out.println("도서명 : " + getTitle());
        System.out.println("저자 : "+ getAuthor());
        System.out.println("ISBN : " + getIsbn());
        if(isAvailable()){
            System.out.println("상태 : 대출가능");
        } else {
            System.out.println("상태 : 대출불가");
        }
    }
    public void tryBorrow(String who) {
        System.out.println(who + "님이 " + getTitle() + "대출 시도");
        System.out.println(borrowBook());
    }
    public void tryReturn(String who) {
        System.out.println(who + "님이 " + getTitle() + "반납 시도");
        System.out.println(returnBook());
    }
    public String borrowBook(){
        if (isAvailable()) {
            setAvailable(false);
            return "대출 성공";
        } else {
            return "이미 대출중";
        }
    }

    public String returnBook(){
        if (isAvailable()) {
            return "이미 반납됨";
        } else {
            setAvailable(false);
            return "반납 완료";
        }
    }
}
