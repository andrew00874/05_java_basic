package edu.practice.day2;

import java.util.Scanner;

public class Practice4 {
    Scanner sc = new Scanner(System.in);
    public void method4(){
        System.out.print("숫자를 입력하세요: ");
        int a = sc.nextInt();
        int cnt = 0;
        for (int i = 2; i <= a/2 + 1; i++) {
            cnt = i;
            if (a % i == 0) {
                System.out.printf("%d은/는 소수가 아닙니다", a);
                break;
            }
        }
        if (cnt == a/2 + 1)
            System.out.printf("%d은/는 소수입니다.", a);
    }
}
