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
        long sum = 0;
        long num;
        System.out.println("0을 입력하면 종료됩니다.");
        while (true){
            System.out.print("정수를 입력하세요 ");
            num = sc.nextLong();
            if (num != 0)
                sum += num;
            else
                break;
        }
        System.out.println("최종 합계 : " + sum);
    }
    public void method3(){
        int sum = 0;
        int num;
        System.out.println("0을 입력하면 종료됩니다.");
        do{
            System.out.print("정수를 입력하세요 ");
            num = sc.nextInt();
            sum += num;
        }while(num != 0);
        System.out.printf("최종 합계 : %d", sum);
    }
    public void method4(){
        String str = sc.nextLine();
        for(int i = str.length();i > 0;i--){
            System.out.printf("%c", str.charAt(i - 1));
        }
    }
    public void method5(){
        int answer = (int) (Math.random() * 10 + 1);
        int cnt = 0;
        int input;
        System.out.println("정답은 1~10 사이의 정수 입니다.");
        do {
            input = sc.nextInt();
            if (input > answer) {
                System.out.println("down");
            } else if(input < answer){
                System.out.println("up");
            }
            cnt++;
        }while(answer != input);
        System.out.println("정답입니다! 시도횟수 : " + cnt);
    }
    public void method6() {
        String password = "java1234";
        String guess;
        int cnt = 0;
        System.out.print("비밀번호를 입력하세요, 시도횟수 (0/5)");
        while (true) {
            guess = sc.nextLine();
            if (guess.equals(password)) {
                System.out.println("성공!");
                break;
            } else {
                cnt++;
                System.out.printf("비밀번호가 틀렸습니다, 시도횟수 (%d/5)", cnt);
            }
            if (cnt == 5) {
                System.out.println("시도횟수 초과, 접속을 차단합니다.");
                break;
            }
        }
    }
}
