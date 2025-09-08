package edu.practice.day11;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SafeFileManager {
    public void method1() {
        Map<String, String> fileMap = new HashMap<>(); // 파일명 : 파일경로
        Map<String, Long> fileSizeMap = new HashMap<>(); // 파일명 : 파일크기
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);
        // 초기 데이터
        fileMap.put("config", "config.txt");
        fileMap.put("log", "system.log");
        fileMap.put("data", "data.csv");

        // "config.txt" 파일을 읽어서 내용 출력
        // FileNotFoundException, IOException 처리
        // Map에서 파일 정보 조회 시 null 체크
        // finally에서 파일 스트림 닫기 및 "파일 관리 작업 완료" 메시지

        String fm = fileMap.get("config"); // config 탭에 존재하는 config.txt 가져오기

        // 파일 읽는 방법
        try {
            br = new BufferedReader(new FileReader(fm));
            // 파일 쓰기, 생성, 읽기는 모두 try-catch 로 예외처리해야함
        } catch (FileNotFoundException e) {
            //만약에 파일이 존재하지 않을경우
            // 파일을 생성하시겠습니까? 물어보고
            // Scanner 이용해서 yes라고 대답하면
            // File을 이용해서 config.txt 파일 생성
            // 파일 생성을 완료합니다.
            System.out.print("파일이 존재하지 않습니다. 생성하시겠습니까? (yes/no) : ");
            if (sc.nextLine().equals("yes")) {
                File f = new File(fm);
                try {
                    f.createNewFile();
                    System.out.println("파일이 생성되었습니다.");
                } catch (IOException ex) {
                    System.out.println("something went wrong.");
                }
            } else {
                System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}

