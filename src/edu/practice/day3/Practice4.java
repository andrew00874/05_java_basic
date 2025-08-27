package edu.practice.day3;

import java.util.Scanner;

public class Practice4 {

    private String name; // 학생명
    private int studentId; // 학번
    private int[] scores = new int[5]; // 과목별 점수 배열 (5과목)
    private String[] subjects; // 과목명 배열

    // 기본 생성자
    public Practice4() {
        this.subjects = new String[]{"국어", "영어", "수학", "과학", "사회"};
    }
    public Practice4(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void inputScores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== " + getName() + " 학생 성적 입력 ===");
        for (int i = 0; i < 5; i++) {
            System.out.print(getSubjects()[i] + " 점수: ");
            setScores(sc.nextInt());
        }
    }

}
