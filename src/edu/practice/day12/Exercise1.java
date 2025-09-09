package edu.practice.day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise1 {
    public void writer(Path dirpath, Path filepath, String Content){
        if(Files.notExists(dirpath)){
            try {
                Files.createDirectories(dirpath);
                System.out.println("폴더 생성 완료");
            } catch (IOException e) {
                System.out.println("파일 생성 문제 발생");
                e.printStackTrace();
            }
        }
        try {
            Files.writeString(filepath, Content);
            System.out.println("파일 생성 및 쓰기 완료");
        } catch (IOException e) {
            System.out.println("파일 생성 문제 발생");
            e.printStackTrace();
        }
    }

    public void reader(Path fp){
        try {
            if (Files.notExists(fp)){
                throw new ThereIsNoFileException();
            }
            String content = Files.readString(fp);
            System.out.println(fp.getFileName() + "의 내용 : " + content);
        } catch(ThereIsNoFileException e) {
            System.out.println("파일이 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void solution1() {
        Path folderPath = Path.of("practice");
        Path filePath = Path.of("practice", "hello.txt");
        String content = "안녕하세요. 자바 파일 처리 연습중입니다.";
        writer(folderPath, filePath, content);
    }

    public void solution2() {
        Path fp = Path.of("practice", "hello.txt");
        reader(fp);
    }

    public void solution3() {
        Path folderPath = Path.of("practice");
        Path filePath = Path.of("practice", "menu.txt");
        String content = "오늘의메뉴\n1. 김치찌개\n2. 불고기\n3. 비빔밥";

        writer(folderPath, filePath, content);
    }

    public void solution4() {
        Path folderPath = Path.of("practice");
        Path filePath = Path.of("practice", "temp.txt");
        writer(folderPath, filePath, "임시파일입니다.");
        reader(filePath);
        try {
            Files.delete(filePath);
            System.out.println(filePath.getFileName() + " 삭제 완료.");
        } catch (IOException e) {
            System.out.println("뭔가 문제가 발생했습니다.");
        }
    }

    public void solution5() {
        Path dirPath = Path.of("study", "java", "basic");
        Path note1Path = Path.of("study", "java", "basic", "note1.txt");
        Path note2Path = Path.of("study", "java", "basic", "note2.txt");
        String note1Content = "자바 기초 공부중";
        String note2Content = "파일 처리 배우는 중";

        writer(dirPath, note1Path, note1Content);
        writer(dirPath, note2Path, note2Content);

        reader(note1Path);
        reader(note2Path);
    }
}
