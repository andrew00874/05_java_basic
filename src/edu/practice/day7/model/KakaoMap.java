package edu.practice.day7.model;

import java.util.Map;

public class KakaoMap extends Kakao{
    private String currentLocation;
    private boolean isGPSEnabled;
    private String serviceType;

    public KakaoMap() {
        this.serviceType = "MAP";
    }

    public KakaoMap(String serviceName, String userId, String userNickname, String currentLocation, boolean isGPSEnabled) {
        super(serviceName, userId, userNickname, true);
        this.currentLocation = currentLocation;
        this.isGPSEnabled = isGPSEnabled;
        this.serviceType = "Map";
    }

    public KakaoMap(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        super(serviceName, userId, userNickname, true);
    }

    public KakaoMap(String currentLocation, boolean isGPSEnabled, String serviceType) {
        this.currentLocation = currentLocation;
        this.isGPSEnabled = isGPSEnabled;
        this.serviceType = serviceType;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isGPSEnabled() {
        return isGPSEnabled;
    }

    public void setGPSEnabled(boolean GPSEnabled) {
        isGPSEnabled = GPSEnabled;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }



    @Override
    public void showUserInfo() {
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스: " + getServiceName());
        System.out.println("아이디: " + getUserId());
        System.out.println("닉네임: " + getUserNickname());
        System.out.println("로그인 상태: " + (isLoggedIn() ? "로그인" : "로그아웃"));
        System.out.println("서비스 타입: " + getServiceType());
        System.out.println("현재 위치: " + getCurrentLocation());
        System.out.println("GPS 상태: " + (isGPSEnabled() ? "활성화" : "비활성화"));
    }

    @Override
    public void startService() {
        System.out.println("카카오맵을 시작합니다. 길찾기 서비스가 준비되었습니다!");
        if (isGPSEnabled) {
            System.out.println("GPS가 활성화되었습니다.");
        }
    }

    @Override
    public void stopService() {
        System.out.println("카카오맵을 종료합니다. 경로 기록을 저장했습니다.");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오맵 알림] " + message);
    }

    @Override
    public void performSpecialAction() {
        System.out.println("직진후 좌회전하세요");
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("[카카오맵에서 알림 수신] " + message);
    }

    public void searchLocation(String location) {
        System.out.println("'" + location + "' 검색 결과를 표시합니다.");
    }

    public void findRoute(String start, String end) {
        System.out.println(start + "에서 " + end + "까지의 경로를 찾습니다.");
        System.out.println("예상 소요시간: 25분, 거리: 8.5km");
    }

    public void enableGPS() {
        this.isGPSEnabled = true;
        System.out.println("GPS를 활성화했습니다. 현재 위치: " + getCurrentLocation());
    }

    public void updateLocation(String location){
        setCurrentLocation(location);
    }
}
