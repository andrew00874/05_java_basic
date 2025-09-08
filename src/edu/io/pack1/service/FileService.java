package edu.io.pack1.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*  OS : 운영체제
*
*  windows  / linux, mac
*  폴더     /  디렉터리
*
*  - 경로 표기 방법(하위폴더, 파일을 표시하는 형태가 다름)
*
* 백슬래시 ( \ , Windows) 슬래시 ( / , Linux, Mac)
*
* Java 언어의 특징 : 플랫폼에 독립적으로 윈도우 리눅스 맥에 상관없이
*                    똑같은 코드를 작성 가능한 것 처럼 /, \ 둘다 호환 가능
*
* - 경로 표기 방법
* 1) 절대 경로 : 하나의(절대적인) 기준으로부터 목표까지의 경로를 모두 표기하는 방법
*
* - 표기의 기준
* [ Windows ] : C :/ or D :/
* [Linux, Mac] : /Users, or /
*
* 2) 상대 경로 : 현재 위치를 기준으로 목표까지의 경로를 표기하는 방법
*
* // 자바에서 특정 경로 없이 파일만 생성하면, 자바 프로그램을 실행하는
* 메인 폴더를 기준으로 파일이 생성됨
* java_basic 폴더 아래에 파일이 생성됨
*
* */
public class FileService {
    /* File 클래스
    *  - java.io 패키지
    *  - 파일 / 디렉터리 관리하는 클래스
    *       (파일/디렉터리 존재 유무 관계 없음)
    *
    *  - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
    *
    *  - File 클래스 메서드 (기능들)
    *
    * boolean mkdir() : 디렉터리 생성 (한 개의 폴더생성 make directory) = folder
    * boolean mkdirs() : 디렉터리 생성 (여러 개의 폴더생성 make directory) = folder
    * boolean createNewFile() : 파일 생성
    * boolean delete() : 파일/디렉터리 삭제
    * String getName() : 파일 이름 반환
    * String parent() : 파일 저장된 디렉터리 반환
    * String getPath() : 전체 경로 반환
    * boolean isFile() : 현재 File 객체가 관리하는 것이 파일이면 true
    * boolean isDirectory() : 현재 File 객체가 관리하는 것이 디렉터리면 true
    * boolean exists() : 파일/디렉터리가 존재하면 true, 아니면 false
    * long length() : 파일 크기 반환
    * long lastModified : 파일 마지막 수정일 부터 현재까지지난 시간을 ms 단위로 반환
    * String[] list() : 디렉터리 내 파일 목록을 String[] 배열로 반환
    * File[] listFiles() : 디렉터리 내 파일 목록을 File[] 배열로 반환
    *
    * */
    public void method1() {
        // 제일 앞 "/" : 최상위 폴더 (== root, 절대 경로의 기준점)

        // C 드라이브 폴더 다음에 io_test 폴더와 gildong 길동 폴더가 존재하는지 확인하고
        // 존재하지 않으면 생성, 존재하면 생성하지 않음

        File folder = new File("/io_test/gildong");
        // 처음에는 존재하는지 하지 않는지 모르겠지만 개발자가 확인하고자 하는
        // 폴더의 명칭(들)을 가지고 있는 File 객체를 폴더들 이라는 이름으로 생성

        System.out.println("폴더들의 존재여부 확인 : " + folder.exists());

        //폴더 모두 생성
        folder.mkdirs(); // 폴더가 하나가 아닌 io_test 폴더 안에 gildong 이라는 폴더를 생성할 예정이기 때문
        System.out.println("마지막 폴더의 명칭 : " + folder.getName());
        System.out.println("마지막 폴더까지 오기 전 모든 경로들 : " + folder.getPath());
    }

    public void method2() {
        File file1 = new File("/io_test/gildong/filetest.txt");

        System.out.println("파일이 존재여부 확인 : " + file1.exists());
        try {
            file1.createNewFile();
        } catch(IOException e) {
            //실행 시도 할 때 문제가 생기면
            // 예외상황으로 인하여 자바 전체 프로그램을 중지하는 것이 아니라
            // 특정 기능에 대한 문제를 개발자가 회사나 프로그램에 알맞는 방향으로
            // 기능이 진행될 수 있도록 설정

            System.out.println("파일을 생성하는 도중 문제가 발생했습니다.");
            throw new RuntimeException(e);
        } catch(Exception e) {
            System.out.println("개발자가 발견하지 못한 문제를 확인, 추후 문제들에 대하여");
            System.out.println("Exception으로 도달하기 전에 catch문으로 해당하는 문제에 대해");
            System.out.println("개발자가 처리할 수 있도록 문제를 확인하는 공간");
            e.printStackTrace(); // 예외 정보 + 예외가 발생한 위치까지의 기능들 추적해서 출력
        }

    }

    public void method3() {
        File file2 = new File("/io_test/practice/filetest.txt"); // 경로 시작에 '/'가 없으면 현재 디렉터리 기준 상대경로

        try {
            File parentDir = file2.getParentFile(); // 상위 디렉터리(io_test/practice) 객체 가져오기

            // 상위 디렉터리가 존재하지 않으면 생성
            if (!parentDir.exists()) {
                if (parentDir.mkdirs()) {
                    System.out.println("상위 디렉터리 생성 완료");
                } else {
                    System.out.println("상위 디렉터리 생성 실패");
                    return; // 디렉터리 생성 실패 시 메서드 종료
                }
            }

            // 파일 생성
            if (file2.createNewFile()) {
                System.out.println("파일 생성 완료");
            } else {
                System.out.println("파일이 이미 존재합니다.");
            }
        } catch(IOException e) {
            System.out.println("파일 생성 오류");
            e.printStackTrace(); // 어떤 IO 오류인지 확인 가능
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void method4() {
        File file1 = new File("/io_test/practice/files/method4.txt");
        File dir = new File("/io_test/practice/files");

        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("폴더가 생성되었습니다.");
            }
        }

        if(file1.exists()) {
            System.out.println("이미 파일이 존재합니다.");
        } else {
            try{
                file1.createNewFile();
                System.out.println("파일 생성 완료");
            } catch(IOException e) {
                System.out.println("문제가 발생했습니다.");
                e.printStackTrace();
            } catch(Exception e) {
                System.out.println("문제가 발생했습니다.");
                e.printStackTrace();
            }
        }
    }

    public void method5() {
        // File 객체 생성

        File directory = new File("/Users/tj/Desktop/java-workspace/java_basic");

        // 저장된 폴더에 있는 모든 파일 / 폴더를 File[] 형태로 얻어오기
        File[] files = directory.listFiles();

        for(File file : files) {
            // 파일 이름
            String name = file.getName();

            // 마지막으로 파일을 수정한 날짜
            long lastModified = file.lastModified();

            // SimpleDateFormat : 간단히 날짜 형식을 지정
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            // 파일을 수정한 날짜를 사람들이 읽기 편한 형태로 변환
            String date = sdf.format(lastModified); // 변환된 데이터를 String date라는 변수 이름에 담기

            // 파일 유형
            String type;
            if (file.isFile()){ //폴더가 아니라 파일 형태가 맞다면
                type = "파일";
            } else {
                type = "폴더";
            }

            String size = file.length() + "B";
            if(file.isDirectory()){
                size = ""; // 폴더는 크기를 설정하지 않고 아무런 크기가 없는 상태
            }

            System.out.printf("%-40s %-20s %-5s %10s\n", name, date, type, size );
        }
    }
}
