package edu.inheritance.ex0;

public class CompanyProgramRun {
    public static void main(String[] args) {
        System.out.println("===== 직원 관리 시스템 =====");

        // 직원 총 3명
        Dev dev = new Dev("김개발", 1001, 15000, "개발", "macbook");
        Dev dev2 = new Dev("김해킹", 1002, 19000, "개발", "vivobook");
        Designer des = new Designer("박디자인", 2001, 14000, "디자인", "Figma");
        Manager manager = new Manager("최매니저", 9999, 500000, "인사팀", 20, 100000);

        dev.info();
        dev2.info();
        des.info();
        manager.info();
        manager.work();
        manager.meeting();

    }
}
