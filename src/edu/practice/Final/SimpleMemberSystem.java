package edu.practice.Final;

import java.util.Scanner;

public class SimpleMemberSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║          회원 관리 시스템         ║");
        System.out.println("║                                  ║");
        System.out.println("║                                  ║");
        System.out.println("╚══════════════════════════════════╝");

        System.out.println();
        FileManager manager = new FileManager();
        manager.createFolders();
        System.out.println();
        System.out.println("════════════════════════════════════");

        while(true){
            System.out.println("메인 메뉴");
            System.out.println("1. 회원가입");
            System.out.println("2. 프로그램 종료");
            System.out.println("════════════════════════════════════");
            System.out.print("선택하세요 (1-2) : ");
            int i = sc.nextInt();
            if (i == 1){
                System.out.println("회원가입");
                System.out.println("════════════════════════════════════");
                // 회원가입
            } else if(i == 2){
                break;
            }
        }
    }
}
