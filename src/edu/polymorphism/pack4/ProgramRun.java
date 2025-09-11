package edu.polymorphism.pack4;

import edu.inheritance.ex3.Youtube;

import java.util.Scanner;

public class ProgramRun {
    public static void main(String[] args) {
        YouTube yt = new YouTube();
        yt.watchVideo("나는 자연인이다.");

        Chrome cr = new Chrome();
        cr.Browser("네이버");

        // Scanner 를 이용해서 아이디를 입력받고,
        // 입력받은 아이디로 유튜브 크롬에
        // 모두 로그인 한다음 로그아웃까지 하기
        // String email = sc.nextLine()
        // 최초 1회만 가능
        String email = "user@email.com";
        GoogleService gs = new YouTube();
        gs.login(email);
        gs.logout(email);

        GoogleService gs2 = new Chrome();
        gs.login(email);
        gs.logout(email);
    }
}
