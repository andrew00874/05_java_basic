package edu.practice.day3;

public class Practice1 {
    private String title;
    private String author;
    private int price;
    private boolean isAvailable = true;

    public Practice1(){
    }

    public Practice1(String title, String author, int price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrowBook(){
        if (isAvailable()) {
            setAvailable(false);
            System.out.println(getTitle() + "이 대출되었습니다.");
        } else{
            System.out.println("이미 대출된 책입니다.");
        }
    }

    public void returnBook(){
        if (isAvailable()) {
            System.out.println("이미 반납된 책입니다.");
        } else {
            setAvailable(false);
            System.out.println(getTitle() + "이 반납되었습니다.");
        }
    }
    
    public void displayBook(){
        System.out.println("=== 도서정보 ===");
        System.out.println("제목 : " + getTitle());
        System.out.println("저자 : " + getAuthor());
        System.out.printf("가격 : %,d\n", getPrice());
        if (isAvailable()) {
            System.out.println("대출 가능 : 가능");
        } else {
            System.out.println("대출 가능 : 불가능");
        }
    }
}
