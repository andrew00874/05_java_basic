package edu.control.loop;

import java.util.Scanner;

public class LoopEx3 {
    Scanner sc=new Scanner(System.in);
    public void method1(){
        System.out.print("문자열을 주세요 ");
        String str=sc.nextLine();
        int i = 0;
        while(i < str.length()){
            System.out.printf("%2d 번째 문자는 %c이다.\n", i, str.charAt(i));
            i++;
        }
    }
    public void method2(){
        int sum = 0;
        int num;
        while (true){
            System.out.print("정수를 입력하세요, -1을 입력하면 종료됩니다. ");
            num = sc.nextInt();
            if (num != -1)
                sum += num;
            else
                break;
        }
        System.out.println("최종 합계 : " + sum);
    }
}
