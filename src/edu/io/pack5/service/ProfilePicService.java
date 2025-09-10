package edu.io.pack5.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProfilePicService {

    public void createProfileFolder() {

        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        Path memberFolder1 = Path.of("profiles", "member01");
        Path memberFolder2 = Path.of("profiles", "member02");

        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder1);
            Files.createDirectories(memberFolder2);

            // 3. 폴더 내에 프로필 사진 저장하기
            Path pic1 = Path.of("profiles", "member01", "pic01.png");
            Path pic2 = Path.of("profiles", "member02", "pic02.png");

            Files.writeString(pic1, "프로필 사진 이미지입니다.");
            Files.writeString(pic2, "프로필 사진 이미지입니다.");

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생 했을 때 문제 해결");
            // 1. main server 끊기면 2번째 후보 서버로 저장 시작
            // 2. 이미지가 5MB 이상 초과되면 저장 못하게 하고, 5MB 를 초과할 수 없음을 사용자에게 알리기

        }
    }
}
