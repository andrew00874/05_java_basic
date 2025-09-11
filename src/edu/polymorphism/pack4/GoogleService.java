package edu.polymorphism.pack4;

public class GoogleService {

    // 필드
    protected String ServiceName;
    protected boolean isLoggedIn;

    // 메서드
    // 기본생성자 파라미터 생성자
    public GoogleService(String serviceName) {
        ServiceName = serviceName;
    }

    public void login(String email){
        isLoggedIn = true;
        System.out.println(email + " 로 " + ServiceName + " 에 로그인 했습니다.");
    }

    public void logout(String email){
        isLoggedIn = false;
        System.out.println(email + " 로 " + ServiceName + " 에 로그아웃 했습니다.");
    }
}
