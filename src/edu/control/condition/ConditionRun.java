package edu.control.condition;

// 폴더위치 edu 폴더 안에 control 폴더 안에 condition 폴더에 위치해있습니다.
public class ConditionRun {
    /*
    * Function 이라면 method1() 형태로 단독 사용 가능
    * method 라면 객체.method1() 형태로 특정 클래스나 예약어에 존재하는 기능 사용 형태로 작성
    * 자바에서는 Class 형태가 기본이기 때문에 메서드 형태로 모든 기능 작성
    * */
    public static void main(String[] args) {
        ConditionEx con = new ConditionEx();
//        con.method2();
        con.method3();
    }
}
