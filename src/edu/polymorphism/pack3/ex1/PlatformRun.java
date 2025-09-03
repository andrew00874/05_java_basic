package edu.polymorphism.pack3.ex1;

public class PlatformRun {
    public static void main(String[] args) {
        Facebook fb = new Facebook("자연인");
        fb.login();
        fb.post("오늘도 자연은 덥네요");
        fb.like("post001");
        fb.logout();

        System.out.println();

        Insta is = new Insta("이코");
        is.login();
        is.post("졸업");
        is.like("post001");
        is.logout();
    }
}
