package edu.practice.day3;

public class PracticeRun {
    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        Practice2 p2 = new Practice2();

//        p1.setTitle("JAVA 프로그래밍");
//        p1.setAuthor("김개발");
//        p1.setPrice(15000);
//        p1.displayBook();
//        System.out.println();
//        p1.borrowBook();
//        System.out.println();
//        p1.displayBook();
//        System.out.println();
//        p1.returnBook();
//        System.out.println();
//        p2.setBatteryLevel(100);
//        p2.setModel("Iphone 16 pro");
//        p2.setPowerOn(true);
//        System.out.println(p2.getModel()+ "의 전원이 켜졌습니다.");
//        p2.status();
//        p2.useBattery();
//        p2.useBattery();
//        p2.useBattery();
//        p2.charge();
//        p2.useBattery();
//        p2.useBattery();
        Practice3 p3 = new Practice3("김재민", "3333-1111", 49000, "2424");
        Practice3 p3a = new Practice3("김준식", "3333-1234", 50000, "1234");
//        p3.status();
//        p3a.status();
//        p3.deposit(20000);
//        p3.deposit(20000);
//        p3.deposit(20000);
//        p3a.deposit(20000);
//        p3.transfer("2424", p3a, 10000);
//        p3.transfer("424", p3a, 10000);
//        p3a.transfer("1234",p3,300000);
//        p3.checkTransactionCount();
//        p3a.checkTransactionCount();
//        Practice4 p4 = new Practice4();
//        p4.setName("홍길동");
//        p4.setStudentId(2016726023);
//        p4.inputScores();
//        p4.printReport();

        Practice5 p5 = new Practice5("현대", "아반떼");
        p5.displayCarInfo();
        p5.startEngine();
        p5.accelerate(50);
        p5.drive(100);
        p5.displayCarInfo();
        p5.startEngine();
        p5.stopEngine();
        p5.accelerate(50);
        p5.brake(100);
        p5.startEngine();
        p5.drive(100);
        p5.accelerate(160);
        p5.refuel(100);
        p5.drive(900);
        p5.displayCarInfo();

    }
}
