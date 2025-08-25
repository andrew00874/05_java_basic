import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        /*
        * Scanner 클래스
        *
        * - 사용자로부터 입력을 받기 위해 Java 에서 제공하는 클래스
        *
        * - java.util 패키지에 존재
        * -> import로 구문 작성
        * -> java.util 내부 폴더 안에 만들어진 Scanner class를 호출하여 사용 가능
        *
        * 외부 라이브러리 > 자바 버전 폴더 > java.base 내에 유틸 폴더 내 존재
        *
        * Scanner.next() : 단어 (String) 1개 입력
        *                                       공백 문자 입력 시 입력 종료
        * Scanner.nextLine() : 문자열(String) 1개 입력
        *                                       엔터(개행 문자) 입력 시 종료
        * Scanner.nextInt() : int형 정수 1개 입력
        * Scanner.nextLong() : Long형 정수 1개 입력
        * Scanner.nextDouble() : Double 형 정수 1개 입력
        *
        * */

        // Scanner 사용하기

        // 1. 클래스 위에 import 구문 작성

        // 2. import한 Scanner 클래스를 이용해서 Scanner 객체 생성

        // * System.in : intelliJ 실행창이나 CLI (cmd = 명령 프롬프트)창에서 키보드로 입력

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 1: ");
        int num1 =  sc.nextInt(); // 다음 입력된 정수를 얻어와 num1 에 넣어주기

        System.out.print("정수 입력 2: ");
        int num2 =  sc.nextInt();

        System.out.print("실수 입력 : ");
        double num3 =  sc.nextDouble();

        System.out.print("단어 입력 (2개) : ");
        String word1 =  sc.next();
        String word2 =  sc.next();

        /*
        *  -next() / nextInt() / nextDouble() 등을 작성한 이후에
        * nextLine() 을 작성해야하는 상황이 오면
        * nextLine() 을 미리 한번 작성하기
        * */
        sc.nextLine();
        System.out.print("문장 입력 : ");
        String str1 =  sc.nextLine();
        /*
        *  JS에서는 변수 내부에 문자열, 숫자, boolean 값의 구분이 존재하지 않았음
        * Java에서는 각 변수마다 메모리 할당량을 측정하기 위해서
        * 변수이름 내부에 넣어줄 값의 종류가 무엇인지를 결정해주고,
        * 종류에 해당하는 값만 작성을 해야 합니다.
        *
        * 그렇지 않으면 Mismatch와 같은 Exception 예외 상황이 발생합니다.
        * */

        System.out.println("입력된 정수1 : " + num1);
        System.out.println("입력된 정수2 : " + num2);
        System.out.println("입력된 실수 : " + num3);
        System.out.println("입력된 단어 : " + word1 + ", " + word2);
        System.out.println("입력된 문장: " + str1);
    }
}
