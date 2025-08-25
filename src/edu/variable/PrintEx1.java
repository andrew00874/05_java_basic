package edu.variable;

public class PrintEx1 {
    public static void main(String[] args) {
        /*
        * System.out ==  (intelliJ 기준) console 창
        *
        * System.out.print() :
        *  - () 내의 값을 출력 (출력 후 줄바꿈 X)
        *
        * System.out.println() :
        * - () 내의 값을 한 줄로 출력 (출력 후 줄바꿈 존재)
        *
        * System.out.printf("", 변수|값);
        * - 정해진 형식(패턴)에 맞게 문자열을 출력하는 구문
        *
        * - 첫 번째 매개 변수 ""
        * - 패턴이 적용된 문자열 작성
        * - 패턴 종류
        *
        * %d : 정수 (byte, short, int)
        * %c : 문자 (char)
        * %s : 문자열 (String)
        * %b : 논리 (boolean)
        * %f : 실수형 (float/double)
        *
        * 양수 : 오른쪽 정렬
        * 음수 : 왼쪽 정렬
        *
        * %숫자d : 정수가 출력된 칸을 숫자만큼 확보
        * ex) %-6d : ㅁㅁㅁㅁㅁㅁ 숫자 자리 확보
        *
        * %.숫자f : 소수점 아래 몇째 자리 까지 표시할지 지정
        *           (지정된 자리 아래에서 반올림 처리)
        *
        * - 두 번쨰 매개 변수
        * - 첫 번째 매개 변수 문자열 중 패턴에 들어갈 변수|값 을 순서대로 작성
        * */
        System.out.print("이름 : ");
        System.out.println("tje");

        System.out.println("입니다.");
        System.out.println("오늘도 행복한 자바 공부?");

        // 개행만 하려면 아래와 같이 작성
        System.out.println();
        System.out.println("개행됐냐?");

        String name = "더조은";
        int age = 20;
        double height = 190.35;
        char gender = 'M';
        boolean javaStudent = true;

        // 더조은은 20세 M 으로 키는 190.35 이고, 자바 공부 여부는 True이다.

        System.out.printf("%s은 %d세 %c성으로 키는 %.1f cm 이고, 자바공부여부는 %b 이다.", name, age, gender, height, javaStudent);

        // Java는 중괄호 내부에 작성하는것이 매우 중요하므로 반드시 class 내부에 작성

        System.out.println("\n==========================");

        // \n  === 개행 문자 (줄바꿈)
        System.out.printf("%8s %-6s %7d 원 %s \n", "20250825", "홍길동", 10000, "입금");
        System.out.printf("%8s %-6s %7d 원 %s \n", "20250825", "아파트관리비", 120000, "입금");
        System.out.printf("%8s %-6s %7d 원 %s \n", "20250825", "식자재마트", 3000, "입금");

        // Ctrl + alt + o : 사용안하는 import 삭제

    }
}
