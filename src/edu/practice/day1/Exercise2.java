package edu.practice.day1;

import java.util.Scanner;

public class Exercise2 {
    void method2(){
        System.out.println("정수를 두개 입력하세요");
        Scanner sc = new Scanner(System.in);
        int num1 =  sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("=== 계산결과 ===");
        System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
        System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
        System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
        System.out.printf("%d / %d = %.2f\n",num1,num2,(double)num1/num2);
    }
}
