package edu.polymorphism.pack3.ex2;

/*
* 추상없는 부모 클래스 공통된 필드 + 공통된 메서드
* */
public abstract class DeliverApp {
    protected String Appname;
    protected String Username;

    public DeliverApp(String appname, String username) {
        Appname = appname;
        Username = username;
    }

    public String getAppname() {
        return Appname;
    }

    public void setAppname(String appname) {
        Appname = appname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void showAccount() {
        System.out.println("[" + getAppname() + "]" + getUsername() + "님의 계정입니다.");
    }

    public void payMoney(int amount) {
        System.out.println("[" +getAppname()+ "]" + amount + "원을 결제했습니다.");
    }
}
