package edu.practice.day1;

public class Excercise1 {
    void method1(){
        String name= "김자바";
        int age = 25;
        double height = 175.5;
        char gender = 'M';
        String hobby = "프로그래밍";
        System.out.println("=== 개인정보 ===");
        System.out.printf("이름 : %s\n나이 : %d\n키 : %.1fcm\n성별 : %c\n취미: %s\n", name,age,height,gender,hobby);
    }
}
