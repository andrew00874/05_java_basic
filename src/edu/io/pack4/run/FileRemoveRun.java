package edu.io.pack4.run;

import edu.io.pack4.ex.FileRemoveService;

public class FileRemoveRun {
    //createFolder

    //createFile

    // 각 메서드 생성 후
    // createFolder를 이용해서 file/store 이라는 폴더 생성

    // createFile 에서는

    // file/store 폴더가 존재하는지 확인하고

    // 존재하면 Book.txt 파일 생성

    // 더조은책방 - 책 리스트 한 줄 추가 후
    // 생성 완료까지 확인
    public static void main(String[] args) {
        FileRemoveService fileRemoveService = new FileRemoveService();
        fileRemoveService.createFile();
    }
}
