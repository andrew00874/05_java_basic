package edu.oop.basic;

import java.sql.SQLOutput;

/*
* 계좌 기능 실행 클래스
* */
public class AccountRun {
    public static void main(String[] args) {
        Account a1 = new Account(); //Account() 는 기본 생성자를 호출해서 객체 생성

        // private이 설정된 값과 안된 값 접근가능 여부 확인
        // private을 적용한 변수(필드)는 외부에서 보이지 않음 (정보 은닉)

//        a1.getAccountNumber() = "1234";
//        Account 클래스 내부에 작성된 속성변수이름 accountNumber는 private형태이기 떄문에
//        다른 클래스에서 직접적으로 접근 불가
//        Account.accountNumber = "1234";

//        간접 접근 기능을 이용해서 값을 세팅
        a1.setName("홍길동"); //name이라는 변수이름을 간접적으로 사용하는 setName에서
        // 홍길동 명칭을 가지고 있는 상태

        // 간접 접근 기능을 이용해서 객체 내부에 저장되어 있는 데이터를 출력
        a1.getName(); // setName으로 저장한 데이터를 가져오기
        // getName은 가져오는 것이지 가져오는 것을 출력하는 메서드가 아님
        // getName으로 가져온 데이터를 확인하기 위해서는 System과 같은 출력문 내부에 작성해야함
        System.out.println(a1.getName());
        a1.setAccountNumber("123-456-789");
        a1.setPassword("1234");

        String a1Num = a1.getAccountNumber();
        String a1pw =  a1.getPassword();
        System.out.println(a1Num);
        System.out.println(a1pw);
    }
}
