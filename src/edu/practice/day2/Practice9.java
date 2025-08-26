package edu.practice.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice9 {
    Scanner sc = new Scanner(System.in);
    public void method9() {
        System.out.print("배열 크기를 입력하세요 (1~10) : ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int[] rev = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("%d번째 숫자 : ", i + 1);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            rev[length-i-1] = arr[i];
        }
        String str = Arrays.toString(arr);
        String revStr = Arrays.toString(rev);
        System.out.println("원본 배열 : " + str);
        System.out.println("뒤집힌 배열 : " + revStr);
    }
}
