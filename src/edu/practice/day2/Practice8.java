package edu.practice.day2;

import java.util.Scanner;

public class Practice8 {
    Scanner sc = new Scanner(System.in);
    public void method8(){
        System.out.println("5명의 성적을 입력하세요.");
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("%d번 학생 : ", i + 1);
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        int max = 0;
        int min = 100;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println();
        System.out.println("=== 성적 통계 ===");
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + (double)sum / numbers.length);
        System.out.println("최고점 : " + max);
        System.out.println("최저점 : " + min);

    }
}
