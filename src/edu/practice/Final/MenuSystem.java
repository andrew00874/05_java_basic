package edu.practice.Final;

import java.util.Scanner;

public class MenuSystem {
    private Scanner scanner;
    private MemberService memberService;

    public MenuSystem(){
        this.scanner = new Scanner(System.in);
        this.memberService = new MemberService();
    }
    // 프로그램 시작
    public void start() {
        // printWelcome() 호출
        // while(true) 무한루프로 showMainMenu() 반복 호출
        // try-catch로 예외 처리
        while(true){
            try {
                showMainMenu();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 환영 메시지 출력
    private void printWelcome() {
        // 프로그램 제목과 환영 메시지를 예쁘게 출력
        System.out.println();
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║          회원 관리 시스템         ║");
        System.out.println("║                                  ║");
        System.out.println("║                                  ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.println();
    }

    // 메인 메뉴 표시
    private void showMainMenu() {
        // "1. 회원가입, 2. 프로그램 종료" 메뉴 출력
        // scanner.nextLine()으로 입력 받기
        // Integer.parseInt()로 선택 번호 파싱
        // switch문으로 분기 처리
        // NumberFormatException 예외 처리
        System.out.println("메인 메뉴");
        System.out.println("1. 회원가입");
        System.out.println("2. 프로그램 종료");
        printSeparator();
        System.out.print("선택하세요 (1-2) : ");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("회원가입");
                printSeparator();
                registerMenu();
            case 2:
                exitProgram();
                break;
        }
    }

    // 회원가입 메뉴
    private void registerMenu() {
        // "아이디, 비밀번호, 이름, 이메일, 전화번호, 이미지URL" 순서대로 입력
        // 이미지URL은 선택사항 (빈값이면 "기본이미지"로 설정)
        // memberService.register() 호출
        // 성공시 이미지 폴더 경로 안내
        // pressEnterToContinue() 호출
        System.out.print("아이디 (3자 이상): ");
        String ID = scanner.nextLine();
        System.out.print("비밀번호 (4자 이상): ");
        String password = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("이메일: ");
        String email = scanner.nextLine();
        System.out.println("전화번호: ");
        String phone = scanner.nextLine();
        System.out.println("이미지 URL(없으면 Enter): ");
        String imageUrl = scanner.nextLine();
        memberService.register(ID, password, name, email, phone, imageUrl);
    }

    // 프로그램 종료
    private void exitProgram() {
        // 종료 확인 메시지
        // "y" 입력시 프로그램 종료
        System.out.println("정말 종료하시겠습니까? y를 눌러 확인하세요.");
        if(scanner.nextLine().equals("y")){
            System.exit(0);
        }
    }

    // 구분선 출력
    private void printSeparator() {
        // "═══════════..." 형태의 구분선
        System.out.println("════════════════════════════════════");
    }

    // 계속하기 대기
    private void pressEnterToContinue() {
        // "엔터키를 눌러 계속..." 메시지 후 입력 대기
        System.out.print("\n엔터키를 눌러 계속...");
        scanner.nextLine();
        System.out.println();
    }

}
