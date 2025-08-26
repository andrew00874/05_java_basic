package edu.practice.day2;

import java.util.Scanner;

public class Practice5 {
    public void method5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 구구단 프로그램 ===");
        System.out.println("1. 특정 단 출력");
        System.out.println("2. 전체 구구단 출력");
        System.out.println("0. 종료");
        while(true){
            System.out.print("선택 : ");
            int select = sc.nextInt();
            if(select == 0)
                break;
            switch (select) {
                case 1:
                    System.out.print("몇 단을 출력하시겠습니까? : ");
                    int a = sc.nextInt();
                    System.out.printf("[%d단]\n", a);
                    for (int i = 1; i <= 9; i++)
                        System.out.printf("%d x %d = %d\n", a, i, a * i);
                    break;
                case 2:
                    for (int i = 1; i <= 9; i++) {
                        System.out.printf("[%d단]\n", i);
                        for (int j = 1; j <= 9; j++)
                            System.out.printf("%d x %d = %d\n", i, j, (i * j));
                        System.out.println("===========");
                    }
                    break;
            }
        }
    }
}
