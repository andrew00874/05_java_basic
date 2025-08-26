package edu.practice.day2;

import java.util.Scanner;

public class Practice7 {
    Scanner sc = new Scanner(System.in);
    public void method7(){
        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        int characters = 0;
        int numbers = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                characters++;
            }
            if (Character.isDigit(str.charAt(i))) {
                numbers++;
            }
        }
        System.out.println("=== 문자열 분석 결과 ===");
        System.out.println("총 글자 수 : " + str.length());
        System.out.println("영문자 : " + characters + "개");
        System.out.println("숫자 : " + numbers + "개");
    }
}
