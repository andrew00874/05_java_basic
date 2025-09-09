package edu.practice.day12;

public class ThereIsNoFileException extends RuntimeException {
    public ThereIsNoFileException(String message) {
        super(message);
    }
    public ThereIsNoFileException() {}
}
