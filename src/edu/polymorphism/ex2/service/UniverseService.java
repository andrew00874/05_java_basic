package edu.polymorphism.ex2.service;

import edu.polymorphism.ex2.model.Professor;
import edu.polymorphism.ex2.model.Student;
import edu.polymorphism.ex2.model.Course;
import edu.polymorphism.ex2.model.Book;

/*
* 대학교 기능 서비스
* */
public class UniverseService {
    // 1. 교수님 정보 입력할 수 있는 객체 생성
    Student student1 = new Student("이순신", "20230001", "컴퓨터공학과", 2, 4.3);
    Professor prof1 = new Professor("홍길동", "PROF007", "컴퓨터공학과");
    Course course1 = new Course("자바 프로그래밍", "CS101", 50);
    Book book1 = new Book("객체지향의 사실과 오해", "조영호");
    // 2. 학생 정보 입력할 수 있는 객체 생성

    public void enrollInCourse() {
        if (course1.getCurrentEnrollment() < course1.getMaxEnrollment()) {
            course1.setCurrentEnrollment((course1.getCurrentEnrollment() + 1));
            System.out.println(student1.getName() + " 학생이 " + course1.getName() + " 강의를 수강신청했습니다. (현재 수강인원: " + course1.getCurrentEnrollment() + "명)");
        } else {
            System.out.println("수강 인원이 가득 찼습니다.");
        }
    }

    // 여러 정보가 복합적으로 사용되는 메서드 (학생이 책을 대출)
    public void checkOutBook() {
        if (!book1.isBookCheckedOut()) {
            book1.setBookCheckedOut(true);
            book1.setCheckoutUser(student1.getName());
            System.out.println(student1.getName() + " 학생이 '" + book1.getName() + "' 책을 대출했습니다.");
        } else {
            System.out.println("'" + book1.getName() + "' 책은 이미 " + book1.getCheckoutUser() + "님이 대출 중입니다.");
        }
    }

    public void returnBook() {
        if (book1.isBookCheckedOut()) {
            book1.setBookCheckedOut(false);
            System.out.println(book1.getCheckoutUser() + "님이 '" + book1.getName() + "' 책을 반납했습니다.");
            book1.setCheckoutUser(null);
        } else {
            System.out.println("해당 도서는 대출 상태가 아닙니다.");
        }
    }

    // 모든 정보를 한 번에 출력하는 메서드
    public void displayAllSchoolInfo() {
        System.out.println("======= 학교 시스템 정보 =======");
        System.out.println("\n--- 학생 정보 ---");
        student1.displayStudentInfo();
        System.out.println("학년: " + student1.getStudentGrade() + ", 학점: " + student1.getStudentGpa());

        System.out.println("\n--- 교수 정보 ---");
        prof1.displayProfessorInfo();

        System.out.println("\n--- 강의 정보 ---");
        System.out.println("강의명: " + course1.getName() + ", 학수번호: " + course1.getID());
        System.out.println("수강인원: " + course1.getCurrentEnrollment() + "/" + course1.getMaxEnrollment());

        System.out.println("\n--- 도서 정보 ---");
        book1.displayBookInfo();
        System.out.println("==============================");
    }
}
