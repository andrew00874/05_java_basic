package edu.practice.Final;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Member {
    private String ID;
    private String PW;
    private String Name;
    private String Email;
    private String Phone;
    private String IMG;
    private String joinDate;
    private String lastLogin;

    public Member(String ID, String PW, String name, String email, String phone, String IMG) {
        this.ID = ID;
        this.PW = PW;
        this.Name = name;
        this.Email = email;
        this.Phone = phone;
        this.IMG = IMG;

    }
    // 파일에서 읽어올 때 생성자 (8개 매개변수)
    public Member(String id, String password, String name, String email,
                  String phone, String imageUrl, String joinDate, String lastLogin) {
        this.ID = id;
        this.PW = password;
        this.Name = name;
        this.Email = email;
        this.Phone = phone;
        this.IMG = imageUrl;
        this.joinDate = joinDate;
        this.lastLogin = lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getID() {
        return ID;
    }

    public String getPW() {
        return PW;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getIMG() {
        return IMG;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    // 현재 시간 반환 (private)
    private String getCurrentTime() {
        // LocalDateTime 사용하여 "2025-01-16 14:30:25" 형식으로 반환
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }

    // 파일 저장 형식으로 변환
    public String toFileFormat() {
        // "|"로 구분하여 모든 필드를 하나의 문자열로 반환
        // 예: "user1|1234|김철수|kim@email.com|010-1234-5678|https://...|2025-01-16 14:30:25|"
        return getID() + "|" + getPW()+ "|"  + getName()+ "|" +getEmail()+ "|" + getPhone()+ "|" + getIMG() + "|" + getJoinDate() + "|" + getLastLogin();
    }

    // 파일에서 읽은 문자열을 Member 객체로 변환 (static)
    public static Member fromFileFormat(String line) {
        // line.split("\\|")으로 분리하여 Member 객체 생성
        // 8개 요소가 있을 때만 객체 생성, 아니면 null 반환
        List<String> listed = List.of(line.split("\\|"));
        if(listed.size() == 8) {
            return new Member(listed.get(0), listed.get(1), listed.get(2), listed.get(3), listed.get(4), listed.get(5), listed.get(6), listed.get(7));
        } return null;
    }

// toString() 오버라이드 - 회원 정보 보기
// 모든 getter 메서드들
// setLastLogin() 메서드만 (다른 setter는 없음)


    @Override
    public String toString() {
        return "Member{" +
                "ID='" + ID + '\'' +
                ", PW='" + PW + '\'' +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", IMG='" + IMG + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", lastLogin='" + lastLogin + '\'' +
                '}';
    }
}
