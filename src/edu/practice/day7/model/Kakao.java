package edu.practice.day7.model;

public abstract class Kakao {
    protected String serviceName;
    protected String userId;
    protected String userNickname;
    protected boolean isLoggedIn;

    public Kakao() {
        this.isLoggedIn = false;
        this.serviceName = "UNKNOWN";
    }

    public Kakao(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.isLoggedIn = isLoggedIn;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void login() {
        this.isLoggedIn = true;
        System.out.println(getUserNickname()+ "님이 " + getServiceName() + "에서 로그아웃했습니다.");
    }

    public void logout() {
        this.isLoggedIn = false;
        System.out.println(userNickname + "님이 " + serviceName + "에서 로그아웃했습니다.");
    }

    public abstract void showUserInfo();
    public abstract void startService();
    public abstract void stopService();
    public abstract void sendNotification(String message);
    public abstract void performSpecialAction();
    public abstract void receiveNotification(String message);

}
