package edu.practice.day2;

import java.util.Scanner;

public class Practice1 {
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int a =  sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int b = sc.nextInt();
        System.out.println();
        System.out.printf("%d부터 %d까지의 짝수\n", a, b);
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
