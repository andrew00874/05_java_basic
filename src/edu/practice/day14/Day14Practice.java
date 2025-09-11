package edu.practice.day14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.LocalTime.now;

public class Day14Practice {
    public void saveMemo() {
        Path path = Path.of("memo", "my_memo.txt");
        String content = "오늘은 JAVA 파일처리 배우는 날!\n화이팅!";
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, content);
            System.out.println("메모가 저장되었습니다: " + path.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("저장된 내용:");
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeDiary() {
        Path path = Path.of("diary", today(1) +"_일기.txt");
        Scanner sc = new Scanner(System.in);
        String content = "";
        try {
            Files.createDirectories(path.getParent());
            System.out.print("오늘의 일기를 작성하세요");
            content = today(1) + "일기" +sc.nextLine();
            Files.writeString(path, content);
            System.out.println("오늘의 일기가 작성되었습니다: " + path.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recordVisitor() {
        Path path = Path.of("visitors", "visitor_log.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, today(2) + " - 새로운 방문자가 들어왔습니다.\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("방문자 기록이 추가되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("=== 전체 방문자 기록 ===");
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createConfig() {
        Path path = Path.of("config", "app_config.txt");
        String content = "=== 앱 설정 파일 ===\n버전: 1.0\n언어: 한국어\n테마: 기본\n생성일: " + today(1);
        try {
            Files.createDirectories(path.getParent());
            if (Files.exists(path)) {
                System.out.println("기존 설정 파일을 업데이트합니다.");
            } else {
                System.out.println("새로운 설정 파일을 생성합니다.");
                Files.writeString(path, content);
                System.out.println("설정 파일이 생성되었습니다." + path.getFileName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String today(int format){
        return switch (format) {
            case 1 -> LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            case 2 -> LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            default -> null;
        };
    }
}
