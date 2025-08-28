package edu.practice.day4;

public class Calculator {
    public static int calculate(int a, int b){
        return a+b;
    }
    public static double calculate(double a, double b){
        return a+b;
    }
    public static int calculate(int a, int b, String operation){
        return switch (operation.charAt(0)) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> {
                System.out.println("잘못된 연산자입니다.");
                yield 0;
            }
        };
    }
    public static int calculate(int[] numbers){
        int i = 0;
        int sum = 0;
        while(i < numbers.length){
            sum += numbers[i++];
        }
        return sum;
    }
    public static void calculate(){
        System.out.println("기본 실행 : 계산기 실행");
    }
}
