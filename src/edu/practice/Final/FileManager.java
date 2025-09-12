package edu.practice.Final;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class FileManager {
    private static final Path MEMBER_FILE = Path.of("C:", "MemberSystem", "data", "members.txt");
    private static final Path IMAGES_DIR = Path.of("C:", "MemberSystem", "images");

    public void createFolders() {
        try {
            System.out.println("시스템 폴더가 생성되었습니다!");
            Files.createDirectories(MEMBER_FILE.getParent());
            System.out.println(" - 데이터 : " + MEMBER_FILE.getParent());
            Files.createDirectories(IMAGES_DIR);
            System.out.println(" - 이미지 : " + IMAGES_DIR);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // 회원 정보 저장 (추가)
    public void saveMember(Member member) {
        // member.toFileFormat() + "\n"
        // Files.writeString() 사용
        // StandardOpenOption.CREATE, StandardOpenOption.APPEND 옵션

        try {
            Files.writeString(MEMBER_FILE, member.toFileFormat() + "\n", StandardOpenOption.CREATE ,StandardOpenOption.APPEND);
            System.out.println("파일이 저장되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 모든 회원 정보 읽기
    public List<Member> loadAllMembers() {
        // Files.readAllLines() 사용
        // 각 줄을 Member.fromFileFormat()으로 변환
        // 빈 줄 제외하고 List<Member>로 반환
        List<Member> members = new ArrayList<>();
        try {
            if (Files.exists(MEMBER_FILE)) {
                List<String> lines = Files.readAllLines(MEMBER_FILE);
                for (String line : lines) {
                    if (!line.trim().isEmpty()) {
                        Member member = Member.fromFileFormat(line);
                        if (member != null) {
                            members.add(member);
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return members;
    }

    // 이미지 폴더 경로 반환
    public Path getImagesDir() {
        return IMAGES_DIR;
    }
}
