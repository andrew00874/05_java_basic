package edu.practice.day2;

import java.util.Arrays;

import java.util.Scanner;

public class Practice10 {
   Scanner sc = new Scanner(System.in);
    public void method10(){
        System.out.println("=== 간단 로또 번호 생성기 ===");
        int[] lotto = new int[5];
        while(true){
            for (int i = 0; i < lotto.length; i++){
                lotto[i] = (int)(Math.random() * 45) + 1;
                for (int j = 0; j < i; j++){
                    if (lotto[i] == lotto[j]){
                        i--;
                        break;
                    }
                }
            }
            Arrays.sort(lotto);
            System.out.print("생성된 번호 : " );
            for (int i = 0 ; i < lotto.length; i++){
                System.out.print(lotto[i] + " ");
            }
            System.out.println();
            System.out.print("다시 생성하시겠습니까? (y/n) : ");
            String retry =  sc.nextLine();
            if (retry.equals("y")){
                continue;
            } else if (retry.equals("n")) {
                break;
            } else break;
        }

    }
}