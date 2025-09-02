package edu.practice.day7.model;

public class KakaoPay extends Kakao{
    private int balance;
    private String bankAccount;
    private String serviceType;

    public KakaoPay() {
        this.serviceType = "PAY";
    }

    public KakaoPay(String serviceName, String userId, String userNickname, int balance, String bankAccount) {
        super(serviceName, userId, userNickname, true);
        this.balance = balance;
        this.bankAccount = bankAccount;
        this.serviceType = "PAY";
    }

    public KakaoPay(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        super(serviceName, userId, userNickname, isLoggedIn);
    }

    public KakaoPay(int balance, String bankAccount, String serviceType) {
        this.balance = balance;
        this.bankAccount = bankAccount;
        this.serviceType = serviceType;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
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
        System.out.println("잔액: " + getBalance() + "원");
        System.out.println("연결 계좌: " + getBankAccount());
    }

    @Override
    public void startService() {
        System.out.println("카카오페이를 시작합니다. 간편결제 서비스가 준비되었습니다!");
        System.out.println("현재 잔액: " + balance + "원");
    }

    @Override
    public void stopService() {
        System.out.println("카카오페이를 종료합니다. 결제 내역을 저장했습니다.");
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("[카카오페이 알림] " + message);
    }

    @Override
    public void performSpecialAction() {
        System.out.println("결제되었습니다.");
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("[카카오페이에서 알림 수신] " + message);
    }
    public boolean processPayment(int amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println(amount + "원 결제 완료. 잔액: " + getBalance() + "원");
            return true;
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + getBalance() + "원");
            return false;
        }
    }

    public void refund(int amount) {
        setBalance(getBalance() + amount);
        System.out.println(amount + "원 환불 완료. 잔액: " + getBalance() + "원");
    }

    public void chargeBalance(int amount) {
        setBalance(getBalance() + amount);
        System.out.println(amount + "원 충전 완료. 잔액: " + getBalance() + "원");
    }

    public void transferMoney(String recipient, int amount) {
        if (processPayment(amount)) {
            System.out.println(recipient + "에게 " + amount + "원 송금 완료");
        }
    }
}
