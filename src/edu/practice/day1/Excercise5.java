package edu.practice.day1;

import java.util.Scanner;

public class Excercise5 {
    void method5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("출생년도를 입력하세요 : ");
        int year =  sc.nextInt();
        int age = 2025 - year;
        System.out.println("======= 나이정보 ========");
        System.out.printf("출생년도 : %d\n", year);
        System.out.printf("현재나이 : %d\n", age);
        System.out.printf("10년후 : %d\n", (age + 10));
        boolean isAdult = (age >= 20);
        System.out.printf("성인여부 : %b\n", isAdult);
        System.out.println("=======================");
    }
}
