package edu.variable;
/*  범위주석
*
*  // 한줄 주석
*       주석 : 컴파일러가 해석되지 않는 구문
*               -> 코드 설명 작성 시 사용
*
*
* */

/* ******** 자바에서 첫 글자를 대문자로 작성한다는 것은 **********
* 외부 파일에서 개발자가 작성한 기능을 사용할 수 있다.
* 외부 폴더에서 만들거나 타인이 만들어놓은 코드 기능을 가져와서 사용한다는 표기
* 자바에서 예약어로 제공하는 것 이외의 기능
*       버전이 업그레이드 될 때마다 추가되는 기능 또한 대문자로 실행
* */

//  class : 자바 코드를 작성하는 영역
//              - 객체의 내용(속성, 기능)을 정의함
//              (JS의 생성자 함수와 비슷한 형태)
//  class 이름 = 파일 명칭과 동일하게 작성
public class Main {
    /*
    *   main 메서드
    * 자바 프로그램을 실행시키기 위해서 반드시 필요한 구문
    * 자바 프로그램을 실행하기 위한 설정
    * */
    public static void main(String[] args) {
        // System.out.println();
        // -> () 안의 문자열을 console에 출력 후 줄바꿈하는 기능
        // print = 줄바꿈 없이 가로로 이어서 출력
        // println = 출력 후 개행
        System.out.println("Hello World");
        System.out.println("Java는 코드 끝에 반드시 세미콜론(;)을 붙여야 합니다");
        System.out.println("합계 : " + (200 + 10) + "원");

        /*
        * JAVA API DOC 확인 : 궁금한 것은 자바가 만들어서 제공하는 코드에 대한 설명
        * 구글에서 java api doc을 검색하면
        * oracle에서 overview(자바 버전 작성)
        * 각자 컴퓨터에서 java-version으로 확인된 버전의 오버뷰를 확인
        * https://docs.oracle.com/en/java/javase/21/docs/api/index.html
        *
        * cmd 명령 프롬프트 창에서 확인한 자바 버전 21 버전이므로 21 API 확인 요망
        * */
    }
}