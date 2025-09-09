package edu.io.pack4.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethodService {
/*
* 폴더가 존재하는지 확인하고 폴더를 생성하는 기능
* */
    public void createDirMethod() {
        //windows macbook 에서 작성하는 슬래시 기법에 따라 폴더를 구분하여 사용할 수 있도록 설정
        Path path = Path.of("files","food", "dinner.txt");
        System.out.println("path : " + path);
        System.out.println("path.getParent() : " + path.getParent());
        Path dir = path.getParent();
        try {
            Files.createDirectories(dir); //files\food\dinner.txt -> dinner.txt 까지 폴더로 인식하고
            // 3개의 폴더가 생성됨
            System.out.println("폴더 생성이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("폴더 생성이 올바르지 않습니다.");
        }
    }

    public void createFileMethod() {
        Path path = Path.of("files","food", "dinner.txt");
        try {
            if(Files.isDirectory(path)) {
                Files.delete(path.getParent());
//                Files.delete(path.getFileName());
                //폴더 삭제
            }
            Files.createDirectories(path.getParent());
            if(!Files.exists(path)) {
                Files.writeString(path, "안녕하세요 저녁 메뉴 리스트입니다.");
                System.out.println("파일 생성이 완료되었습니다.");
            }
        } catch (IOException e) {
            System.out.println("파일 생성이 올바르지 않습니다.");
            e.printStackTrace();
        }
    }
    public void copyMethod() {
    }

    public void moveMethod() {
    }
}
