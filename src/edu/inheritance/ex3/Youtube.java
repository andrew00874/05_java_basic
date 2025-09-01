package edu.inheritance.ex3;

public class Youtube extends GoogleService {
    private int subscriber;
    private boolean isPremium;

    public Youtube() { // setter로 super() 를 작성했으니
        super();        // 부모 클래스인 GoogleService 필드까지 YouTube 객체를 활용하여
    }                   //                                      데이터 저장을 setter로 할 수 있는 상태
    public Youtube(String serviceName, String userEmail, String userName, String accountType) {
        super(serviceName, userEmail, userName, accountType);
    }

    public Youtube(String serviceName, String userEmail, String userName, String accountType, int subscriber, boolean isPremium) {
        super(serviceName, userEmail, userName, accountType);
        this.subscriber = subscriber;
        this.isPremium = isPremium;
    }

    public int getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(int subscriber) {
        this.subscriber = subscriber;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    @Override
    public void search(){
        System.out.println("Youtube에서 동영상을 검색합니다.");
    }

    @Override
    public void share(){
        System.out.println("Youtube에서 동영상 링크를 공유합니다.");
    }

    public void uploadVideo(){
        System.out.println(userName + "님이 동영상을 업로드합니다.");
    }

    public void subscribe(){
        System.out.println(userName + "님이 채널을 구독합니다.");
        subscriber++;
    }

    public void watchAd(){
        if (!isPremium){
            System.out.println("광고를 시청합니다.");
        } else System.out.println("프리미엄 사용자는 광고가 없습니다.");
    }
}
