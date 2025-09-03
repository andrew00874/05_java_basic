package edu.polymorphism.pack3.ex1;

public abstract class MetaPlatform {
    protected String PlatformName;
    protected String UserId;

    // 메서드 생성자 = main을 실행했을 때, 데이터를 담을 수 있도록 공간을 생성해주는 메서드
    // new MetaPlatform() 특별한 기준이나 규칙 없이 새로운 공간을 생성
    // new MetaPlatform(String, String) Platform 이름과 UserID가 있어야만 공간을 생성하는 것
    
    public MetaPlatform() {
    }

    public MetaPlatform(String platformName, String userId) {
        PlatformName = platformName;
        UserId = userId;
    }

    
    // getter, setter
    // getter : Client나 DB에서 전달받은 데이터를 사용할 수 있도록 하는 기능
    // setter : Client 한테 전달받은 데이터를 프로그램이 실행되는 동안 임시로 저장하여 보유하고 있는 기능
    public String getPlatformName() {
        return PlatformName;
    }

    public void setPlatformName(String platformName) {
        PlatformName = platformName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
    
    public void login() {
        System.out.println(getUserId() + "님이 " +  getPlatformName() + " 에 로그인 했습니다.");
    }
    
    public void logout() {
        System.out.println(getUserId() + "님이 " +  getPlatformName() + " 에 로그아웃 했습니다.");
    }

    public abstract void post(String content);
    public abstract void like(String postId);
}
