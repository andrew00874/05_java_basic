package edu.variable;

public class VariableEx4 {
    // 메인 메서드 : 자바 프로그램을 실행하는 구문 (기능)
    public static void main(String[] args) {

        // 상수 : 한번 값을 기록하면 값을 바꿀 수 없는 메모리 공간 명칭
        // 상수 키워드 : JS 에서는 const , JAVA 에서는 final <- 개발자간의 규칙
        // 상수 이름 작성 : 대문자로 작성, 연결되는 단어 사이에 언더바 구분 ex) MAX_HUMAN

        final double PI = 3.14;

        final int MIN = 0;
        final int MAX = 100;

        System.out.println("최소값 : " + MIN);
        System.out.println("최대값 : " + MAX);
    }
}
