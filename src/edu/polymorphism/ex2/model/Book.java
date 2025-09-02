package edu.polymorphism.ex2.model;

public class Book extends UniverseMember{
    private String bookAuthor;
    private boolean isBookCheckedOut; // 대출 여부
    private String checkoutUser; // 대출한 사용자

    public Book() {
    }

    public Book(String bookTitle, String bookAuthor, String bookIsbn, boolean isBookCheckedOut, String checkoutUser) {
        super(bookTitle, bookIsbn);
        this.bookAuthor = bookAuthor;
        this.isBookCheckedOut = isBookCheckedOut;
        this.checkoutUser = checkoutUser;
    }

    public Book(String bookAuthor, boolean isBookCheckedOut, String checkoutUser) {
        this.bookAuthor = bookAuthor;
        this.isBookCheckedOut = isBookCheckedOut;
        this.checkoutUser = checkoutUser;
    }

    public Book(String name, String ID) {
        super(name, ID);
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public boolean isBookCheckedOut() {
        return isBookCheckedOut;
    }

    public void setBookCheckedOut(boolean bookCheckedOut) {
        isBookCheckedOut = bookCheckedOut;
    }

    public String getCheckoutUser() {
        return checkoutUser;
    }

    public void setCheckoutUser(String checkoutUser) {
        this.checkoutUser = checkoutUser;
    }

    public void displayBookInfo() {
        System.out.println("도서 제목: " + getName());
        System.out.println("저자: " + bookAuthor);
        System.out.println("대출 가능 여부: " + (isBookCheckedOut ? "불가" : "가능"));
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", isBookCheckedOut=" + isBookCheckedOut +
                ", checkoutUser='" + checkoutUser + '\'' +
                '}';
    }
}
