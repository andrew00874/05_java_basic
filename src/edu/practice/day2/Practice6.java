package edu.practice.day2;

import java.util.Scanner;
import java.util.SortedMap;

public class Practice6 {
    Scanner sc = new Scanner(System.in);
    public void method6(){
        System.out.println("1~50 사이의 숫자를 맞혀보세요!");
        int ans = (int)(Math.random() * 50) + 1;
        int cnt = 1;
        while (cnt < 8){
            System.out.printf("시도 %d/7: ", cnt);
            int i = sc.nextInt();
            if (i < ans){
                System.out.println("입력한 숫자보다 정답이 작습니다.");
                cnt++;
                continue;
            }
            else if (i > ans){
                System.out.println("입력한 숫자보다 정답이 큽니다.");
                cnt++;
                continue;
            }
            else
                System.out.print("정답입니다! ");
                break;

        }
        System.out.printf("정답 : %d, 시도횟수: %d회", ans, cnt);
    }
}
