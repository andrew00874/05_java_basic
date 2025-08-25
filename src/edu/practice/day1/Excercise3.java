package edu.practice.day1;

import java.util.Scanner;

public class Excercise3 {
    void method3(){
        final double RATIO = 1.8;
        final int OFFSET = 32;
        System.out.println("현재 온도를 섭씨로 적어주세요");
        Scanner sc = new Scanner(System.in);
        double c_temp = sc.nextInt();
        double f_temp = c_temp * RATIO + OFFSET;
        System.out.printf("현재 화씨 %.1f도 입니다.\n", f_temp);
    }
}
