package edu.op.ex;

// 폴더위치 + 파일이름 생성방법
// .활용해서 폴더 구분 후 파일명칭 작성
// edu.op.ex.OperatorEx

import java.util.Scanner;
import java.util.SortedMap;

/*
* 기능작성용 클래스
* */
public class OperatorEx {
    /* 자바에서는 모든 기능을 class 내부에 작성하기 때문에
    *  대부분의 기능을 메서드 형태로 사용
    *  파일이름.기능이름()
    * */
    public void test(){
        System.out.println("test");
    }

    /*
    * 입력 받은 정수가 3의 배수가 맞는지 확인하는 기능
    *
    * */
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int a = sc.nextInt();

        // boolean 변수 이름 보통 앞에 is 단어를 붙이므로 true/false를 위한 변수이름 임을 표기
        // 위에서 sc.nextInt(); 내부에 소비자가 작성한 숫자입력값을 a라는 변수 이름에 저장해놓고
        // a를 3으로 나누었을 때, 나머지가 0이면 True / 그외의 경우 False
        boolean isTrue =  (a % 3 == 0);
        System.out.printf("%d는 3의 배수입니다. : %b\n", a, isTrue);
    }

    // void 라는 것은 return 이 없고, 단순 출력만 진행하는 기능을 뜻함
    /*

    * JAVA

    * (변수) 바구니에 들어갈 데이터가
    * - 숫자, 문자, 사람이 만든 데이터 크기, 실수인가 등
    * 데이터를 담을 변수이름의 종류부터
    *
    *  기능을 실행할 때
    *  - 기능을 실행만 하면 되는 것인지
            public void 기능명칭(매개변수 자리, 파라미터의 자리){
                수행할 기능 작성
            }

    *  - 기능을 실행 후 실행 결과를 어딘가에 전달하는 기능인지
    *       public 전달할자료형 기능명칭(매개변수 자리, 파라미터의 자리){
                수행할 기능 작성
                return 전달할데이터;
            }

    * 프로그램을 수행하기 전에 정의해야할 사항이 많음
    * */
    /*
    * method2() 기능
    * 첫 번째 입력받은 수가 두 번째 입력 받은 수의 배수가 맞는지 확인
    *
    * 변수이름 : input1, input2 (int)
    *           boolean = isTrue
    * */
    public void method2(){
      Scanner sc = new Scanner(System.in);
      System.out.print("첫번째 정수 입력 ");
      int input1 = sc.nextInt();
      System.out.print("두번째 정수 입력 ");
      int input2 = sc.nextInt();
      boolean result = input1 % input2 == 0;
      System.out.printf("%d는 %d의 배수가 맞는가? : %b\n", input1, input2, result);
    }

    public void method3(){
        /* 삼항 연산자 : 조건식 ? 참 : 거짓;
        * String result = isTrue ? "짝수" : "홀수";
        *
        * 1. isTrue ? "짝수" : "홀수"
        *       boolean isTrue = (input % 2 == 0);
        *       위에서 input 결과가 true/false 로
        *       isTrue 라는 변수이름에 담겨짐
        *
        * 2. 담겨진 결과를 판별했을 때 ?   참이면 보여지거나 실행할 기능 설정
        *                          :    거짓이면 보여지거나 실행할 기능 설정
        *
        * if (조건식) {
        *   조건식이 true 일 경우 실행
        * } else {
        *   조건식이 false 일 경우 실행
        * }
        *
        * 에서 if 와 (), {} 를 생략하여 = ? : 으로 표현한 연산식
        *
        * */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int input1 = sc.nextInt();

        boolean isTrue = input1 % 2 == 0;
        String result = isTrue ? "짝수" : "홀수";
        System.out.printf("%d 은/는 %s 입니다", input1, result);
    }
    /*
    * [홀짝 검사기 V2]
    * 입력 받은 정수가 홀수 또는 짝수 또는 0인지 판별
    * 정수 입력 : 0
    * 0입니다.
    * -------------
    * 정수 입력 : 4
    * 짝수입니다.
    * -------------
    * 정수 입력 : 7
    * 홀수입니다.
    *
    * 변수 이름 : sc,
    *           int = input
    *           boolean = isZero isTrue
    *           삼항연산자
    *           String result "짝수" "홀수"
    *
    * */
    public void method4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("0입니다.");
        } else {
            boolean isOdd = num % 2 != 0;
            String result = isOdd ? "짝수입니다" : "홀수입니다";
            System.out.println(result);
        }
    }
}
