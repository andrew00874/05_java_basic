package edu.io.pack2.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteService {
    /*
    * Files.writeString() : Java 11부터 도입된 기능으로 간단히 문자열을 파일에 쓰는 방법
    *
    * 파일을 작성할 때
    * 파일을 열고, 파일 내부에 글자를 작성한다 표기하고,
    * try-catch를 이용해서 파일 생성하는데 문제가 없는지 확인하면서 진행
    * 영어, 숫자 이외 글자들 컴퓨터에서 글자 깨짐 없이 작성될 수 있도록
    * 인코딩하는 설정 또한 알아서 처리해주는 문서
    *
    * 자바 개발자들이 만든 class 문서 파일들
    * File : 가장 처음에 만들어진 파일에 관련된 기능들이 작성되어있는 문서
    *        java.io
    *
    * Files : Java7 부터 도입된 문서
    *         파일 및 디렉터리를 처리 (생성, 복사, 이동, 쓰기, 읽기 등)을 더 편리하고
    *         문제없이 사용할 수 있도록 개선된 기능들을 모아놓은 File 업그레이드 버전
    *         .writeString() : java11에서 추가된 기능
    *         문자열을 파일에 작성하는 기능을 전담
    *
    * Path : 주소 경로에 대한 정보를 기능적으로 작성해놓은 인터페이스
    *
    * Paths : Path 기능들을 활용해서 만든 문서 파일
    * */
    public void method1(){
        String filename = "file1.txt";
        String fileContent = "파일 1 내부에 글자를 작성할 겁니다.";

        try {
            // 파일들 문서를 이용해서 문자열로 글자를 작성
            Files.writeString(Paths.get(filename), fileContent);
            System.out.println(filename + "파일 저장");
            } catch (IOException e){
            throw new  RuntimeException(e);
        }
    }

    public void method2(){
        File f = new File("files");
        File f1 = new File("files/file1.txt");
        if (!f.exists()){
            f.mkdir();
            System.out.println("폴더 생성 완료");
        }
        if (!f1.exists()){
            try{
                f1.createNewFile();
                System.out.println("파일 생성 완료");
                Path filePath = f1.toPath();
                Files.writeString(filePath, "hi\nhow are you\nhaha");
            } catch(IOException e){
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
