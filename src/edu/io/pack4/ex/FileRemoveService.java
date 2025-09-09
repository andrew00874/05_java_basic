package edu.io.pack4.ex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRemoveService {
    public void createFolder(){
        Path dirPath = Path.of("file", "store");
        try {
            Files.createDirectories(dirPath);
            System.out.println("폴더 생성이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("폴더 생성이 올바르지 않습니다.");
            e.printStackTrace();
        }
    }

    public void createFile(){
        Path path = Path.of("file", "store", "Book.txt");
        Path dirPath = path.getParent();
        if (Files.notExists(dirPath)) {
            createFolder();
            createFile();
        } else {
            try {
                Files.writeString(path, "더조은 책방 - 책 리스트");
                System.out.println("파일 생성 완료!");
            } catch (IOException e) {
                System.out.println("뭔가 문제가 발생했습니다.");
                e.printStackTrace();
            }
        }
    }
}
