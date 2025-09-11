package edu.io.pack7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
* 로그인 로그아웃을 기록하기
* Windows C://더조은회사 로그파일/
* */
public class LoginLog {
    public void login() {
        Path path = Path.of("C:","더조은회사", "login.log");

        try {
            Files.createDirectories(path.getParent());
            System.out.println("로그인 기록 파일이 생성되었습니다.");
            String loginInfo = "유저가 로그인한 정보\n";

            Files.writeString(path,currentTIme() + loginInfo, StandardOpenOption.CREATE ,StandardOpenOption.APPEND);
            System.out.println("유저가 로그인한 정보를 작성 완료했습니다. -- 개발자가 단순코드 동작 확인용 출력문");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void logout() {
        Path path = Path.of("C:","더조은회사", "login.log");

        try {
            Files.createDirectories(path.getParent());

            String logoutInfo = "유저가 로그아웃한 정보\n";
            // StandardOpenOption 이 아무것도 없을 때 기본값 : CREATE
            // CREATE : 무조건 파일 다시 만들기
            // APPEND : 무조건 파일 내 내용 이어서 작성하기
            // 아래처럼 작성하면 -> 없으면 생성하고, 이어 작성하기
            Files.writeString(path, currentTIme() + logoutInfo , StandardOpenOption.CREATE , StandardOpenOption.APPEND);
            System.out.println("유저가 로그아웃한 정보를 작성 완료했습니다. -- 개발자가 단순코드 동작 확인용 출력문");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 로그인, 로그아웃 시간 기록하기
    public String currentTIme(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss - "));
    }

    public void timeComp() {
        long a = System.currentTimeMillis();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("a : " + a);
        System.out.println("now : " + now);
    }

    /*

    * System.currentTimeMillis() : 1970년 01월 01일 00:00 부터 흐른 시간을 숫자로 표현
    *       -> 파일이름 다르게 설정할 때 주로 사용
    *
    * LocalDateTime.now() : 현재 시간을 문자열 형태로 출력
    *       -> 로그인시간, 채팅 보낸 시간 소비자에게 보여주고, 기록할 때 주로 사용
    *
    * DateTimeFormatter.ofPattern("원하는 시간의 형태") : 현재 시간출력 형태를 원하는 시간의 형태로 변환
    *
    * LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss - ")
    *                                                           년 월 일 시 분 초 형태로 출력해달라 설정
    * */
}
