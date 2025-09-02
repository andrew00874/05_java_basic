package edu.practice.day7.model;

public class KakaoTalk extends Kakao {
    private int friendCount;
    private boolean isOnline;
    private String serviceType;

    public KakaoTalk() {
        this.serviceType = "TALK";
    }

    public KakaoTalk(String serviceName, String userId, String userNickname, boolean isLoggedIn, int friendCount, boolean isOnline) {
        super(serviceName, userId, userNickname, isLoggedIn);
        this.friendCount = friendCount;
        this.isOnline = isOnline;
        this.serviceType = "TALK";
    }

    public KakaoTalk(int friendCount, boolean isOnline, String serviceType) {
        this.friendCount = friendCount;
        this.isOnline = isOnline;
        this.serviceType = serviceType;
    }

    public KakaoTalk(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        super(serviceName, userId, userNickname, isLoggedIn);
    }

    public KakaoTalk(String serviceName, String userId, String userNickname, int friendCount, boolean isOnline) {
        super(serviceName, userId, userNickname, isOnline);
        this.friendCount = friendCount;
        this.isOnline = isOnline;
    }

    public int getFriendCount() {
        return friendCount;
    }

    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public void login() {
        this.isLoggedIn = true;
        System.out.println(getUserNickname()+ "님이 " + getServiceName() + "에서 로그아웃했습니다.");
    }

    @Override
    public void logout() {
        this.isLoggedIn = false;
        System.out.println(userNickname + "님이 " + serviceName + "에서 로그아웃했습니다.");
    }

    @Override
    public void showUserInfo() {
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스: " + getServiceName());
        System.out.println("아이디: " + getUserId());
        System.out.println("닉네임: " + getUserNickname());
        System.out.println("로그인 상태: " + (isLoggedIn() ? "로그인" : "로그아웃"));
        System.out.println("서비스 타입: " + getServiceType());
        System.out.println("친구 수: " + getFriendCount());
        System.out.println("온라인 상태: " + (isOnline() ? "온라인" : "오프라인"));
    }

    @Override
    public void startService() {
        System.out.println("카카오톡을 시작합니다. 친구들과 채팅을 시작하세요!");
        if (isOnline()) {
            System.out.println("온라인 상태로 접속했습니다.");
        }
    }

    @Override
    public void stopService() {
        System.out.println("카카오톡을 종료합니다.");
        this.isOnline = false;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오톡 알림] " + message);
    }

    @Override
    public void performSpecialAction() {
        System.out.println("메시지가 전송되었습니다.");
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("[카카오톡에서 알림 수신] " + message);
    }

    public void sendMessage(String friendName, String message) {
        System.out.println(friendName + "에게 메시지 전송: " + message);
    }

    public void addFriend(String friendName) {
        setFriendCount(getFriendCount() + 1);
        System.out.println(friendName + "를 친구로 추가했습니다. (총 친구 수: " + friendCount + ")");
    }

    public void changeStatus(boolean online) {
        this.isOnline = online;
        System.out.println("상태를 " + (online ? "온라인" : "오프라인") + "으로 변경했습니다.");
    }
}
