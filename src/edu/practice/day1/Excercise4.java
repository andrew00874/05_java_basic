package edu.practice.day1;

import java.util.Scanner;

public class Excercise4 {
    void method4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        int num1 = sc.nextInt();
        System.out.print("영어 점수 : ");
        int num2 = sc.nextInt();
        System.out.print("수학 점수 : ");
        int num3 = sc.nextInt();
        double mean = (double)(num1 + num2 + num3) / 3;
        System.out.printf("평균 : %.2f", mean);
        if (mean >= 90)
            System.out.println("학점 : A");
        else if (mean >= 80)
            System.out.println("학점 : B");
        else if (mean >= 70)
            System.out.println("학점 : C");
        else if (mean >= 60)
            System.out.println("학점 : D");
        else
            System.out.println("학점 : F");
    }
}
