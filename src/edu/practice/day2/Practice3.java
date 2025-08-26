package edu.practice.day2;

import java.util.Scanner;

public class Practice3 {
    Scanner sc=new Scanner(System.in);
    public void method3(){
        System.out.print("팩토리얼을 구할 숫자를 입력하세요: ");
        int fact =  sc.nextInt();
        int res = 1;
        System.out.printf("%d! = ", fact);
        for (int i = fact; i > 0; i--) {
            res *= i;
            if (i != 1)
                System.out.printf("%d * ", i);
            else
                System.out.printf("%d = %d\n", i, res);
        }
    }
}
