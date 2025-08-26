package edu.control.loop;

import java.util.Scanner;

public class LoopEx2 {
    Scanner sc = new Scanner(System.in);
    public void method1() {
        for(int a = 2; a <= 9; a++){
            for(int b = 1; b <= 9; b++){
                System.out.printf("%d * %d = %2d\n",a,b,a*b);
            }
            System.out.println("===========");
        }
    }
}
