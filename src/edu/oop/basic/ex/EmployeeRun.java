package edu.oop.basic.ex;

import java.util.Scanner;

public class EmployeeRun {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        // 기본생성자를 활용해서 데이터 추가
        emp1.setName("김개발");
        emp1.setAge(28);
        emp1.setDept("개발팀");
        emp1.setPosition("PM");
        emp1.setSalary(4500);
        emp1.setEmployeeId("DEV100");
        emp1.setWorkYears(2);
        // 필수 생성자를 이용해서 핵심 정보를 우선적으로 데이터 작성
        // 이외 데이터는 set을 활용해서 추가

        //Employee 에 존재하지 않는 매개변수생성자를 호출하면 '생성자를 해결할 수 없습니다.'와 함께
        //Employee에 코드를 생성 -> 이럴 때는 코드를 생성하기 보다는 활용하고자 하는 class를 방문하여
        //생성자에 존재하는 필수 생성자에서 매개변수가 어떤 순서대로 작성되어 있는지 확인하는게 낫다.
        Employee emp2 = new Employee("박기획", "기획팀", "팀장", "GH14");
        // 회원가입을 할 떄 필수로 작성해야하는 매개변수들 필수로 데이터 저장해야하는 값들을 담은 변수명칭
        emp2.setSalary(5500);
        emp2.setWorkYears(8);
        emp2.setAge(35);

        Employee emp3 = new Employee();
        emp3.setName("최신입");
        emp3.setAge(24);
        emp3.setDept("인사팀");
        emp3.setPosition("사원");
        emp3.setSalary(3300);
        emp3.setEmployeeId("HR003");
        emp3.setWorkYears(1);
        System.out.println("===== 전 직원 상세 정보 =====");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println("===== 자기소개 =====");
        emp1.introduce();
        emp2.introduce();
        emp3.introduce();
        System.out.println("===== 근무현황 =====");
        emp1.work();
        emp2.work();
        emp3.work();
        System.out.println("===== 연봉정보 =====");
        emp1.salInfo();
        emp2.salInfo();
        emp3.salInfo();
        System.out.println("===== 승진 대상자 확인 =====");
        emp1.checkPromo();
        emp2.checkPromo();
        emp3.checkPromo();
        System.out.println("===== 퇴직금 계산 =====");
        emp1.retirement();
        emp2.retirement();
        emp3.retirement();
    }
}
