package edu.exception.ex;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        System.out.println("존재하지 않는 ID입니다.");
    }
    public UserNotFoundException(String message) {
        super(message);
    }
}
