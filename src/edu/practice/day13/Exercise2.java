package edu.practice.day13;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Exercise2 {
    public void solution1 () {
        Path studentDir = Path.of("student");
        Path filePath = studentDir.resolve("info.txt");
        String content = "이름 : 홍길동\n나이 : 25\n전공 : 컴퓨터공학\n학년 : 3학년";
        try {
            Files.createDirectories(studentDir);
            System.out.println("폴더가 생성되었습니다.");
        } catch (IOException e){
            System.out.println("문제가 발생했습니다.");
        }
        try {
            Files.writeString(filePath, content);
            System.out.println("파일을 생성하고 내용을 적었습니다.");
        } catch (IOException e) {
            System.out.println("파일 생성에 문제가 발생했습니다.");
        }
        System.out.println("info.txt 의 내용");
        try {
            System.out.println(Files.readString(filePath));
        } catch (IOException e) {
            System.out.println("파일읽기 실패");
        }
    }
    public void solution2() {
        Path textDir = Path.of("downloads", "text", "download_data.txt");
        String textUrl = "https://httpbin.org/base64/SGVsbG8gV29ybGQhIEphdmEgRmlsZSBJTyBQcmFjdGljZQ==";

        try {
            Files.createDirectories(textDir.getParent());
            System.out.println("폴더 생성 완료");
            URL url = new URL(textUrl);
            InputStream is = url.openStream();
            Files.copy(is, textDir, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("파일 생성 완료 : " +textDir);
            System.out.println(Files.readString(textDir));
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void solution3() {
        String content = "이것은 백업문서입니다.";
        String baseName = "document";
        String extension = ".txt";
        Path dirPath = Path.of("backup", baseName + extension);
        int counter = 1;
        String fileName = baseName + extension;
        while(Files.exists(dirPath)){
            fileName = baseName + "_" + counter + extension;
            dirPath = Path.of("backup", fileName);
            counter++;
        }

        try {
            if(!Files.exists(dirPath.getParent())) {
                Files.createDirectories(dirPath.getParent());
                System.out.println("폴더 생성 완료");
            }
            Files.writeString(dirPath, content);
            System.out.println("파일 저장 완료 : " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void solution4() {
        Path tempDir = Path.of("temp");
        Path archiveDir = Path.of("archive");
        Path backupDir = Path.of("backup");
        Path sourceFile = tempDir.resolve("data.txt");
        Path targetFile = archiveDir.resolve("data.txt");
        Path backupFile = backupDir.resolve("data_backup.txt");
        String content = "이것은 백업문서입니다.";

        try {
            if(!Files.exists(tempDir)) {
                Files.createDirectories(tempDir);
            }
            Files.writeString(sourceFile, content);
            System.out.println("1단계 : 임시 파일 생성 완료 - " + sourceFile);
            if(!Files.exists(archiveDir) || !Files.exists(backupDir)) {
                Files.createDirectories(archiveDir);
                Files.createDirectories(backupDir);
                System.out.println("2단계: 폴더 생성 완료 - " + archiveDir + ", "+ backupDir);
            }
            Files.move(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("3단계 : 파일 이동 완료 - " + sourceFile + " -> " + targetFile);
            Files.copy(targetFile, backupFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("4단계 : 백업 복사 완료 - " + backupFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("모든 작업이 완료되었습니다.");
    }
    public void solution5() {
        System.out.println("=== 로그 생성기 시작 ===");
        System.out.println("로그 메시지를 입력하세요 ('종료'를 입력하면 종료됩니다.)");
        Path logsDir = Path.of("logs");
        Scanner sc = new Scanner(System.in);
        StringBuilder content = new StringBuilder();
        long timestamp = System.currentTimeMillis();
        String fileName = "log_" + timestamp + ".txt";
        int logCount = 0;

        try {
            Files.createDirectories(logsDir);
            String line;
            do {
                System.out.print("> ");
                line = sc.nextLine();
                if (line.equals("종료"))
                    break;
                line += "\n";
                content.append(line);
                logCount++;
            } while (true);
            Files.writeString(logsDir.resolve(fileName), content.toString());
            System.out.println("로그파일이 저장되었습니다 : " + logsDir.resolve(fileName));
            System.out.println("총 " + logCount + "개의 로그가 저장되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void solution6() {}
}
