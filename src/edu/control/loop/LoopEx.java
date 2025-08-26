package edu.control.loop;

import java.util.Scanner;

public class LoopEx {
    Scanner sc = new Scanner(System.in);
    public void method1() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", i);
        }
    }
    public void method2() {
        System.out.println("Enter two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (; num1 <= num2; num1++) {
            System.out.printf("%d ", num1);
        }
    }
    public void method3() {
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }
    public void method4() {
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("Max : %d,  Min : %d", Math.max(a, b), Math.min(a, b));
    }
    public void method5() {
        int i = sc.nextInt();
        for  (int j = 1; j <= 9; j++) {
            System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
    }


}
