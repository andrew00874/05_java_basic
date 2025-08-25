package edu.control.condition;

import java.util.Scanner;

// 폴더위치 edu 폴더 안에 control 폴더 안에 condition 폴더에 위치해있습니다.
public class ConditionEx {

    public void method1(){

    }
    public void method2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age =  sc.nextInt();
        if(age <= 13) System.out.println("어린이입니다.");
        else if (age <= 18) System.out.println("청소년입니다.");
        else System.out.println("성인입니다.");
    }
    public void method3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇월인지 입력하세요 : ");
        int month = sc.nextInt();
        if (month < 1 || month > 12){
            System.out.println("잘못 입력했습니다.");
        } else if(month > 2 && month <= 5){
            System.out.println("봄");
        } else if(month > 6 && month <= 8){
            System.out.println("여름");
        } else if(month > 8 && month <= 10){
            System.out.println("가을");
        } else if(month > 10 || month == 1){
            System.out.println("겨울");
        }

    }
}
