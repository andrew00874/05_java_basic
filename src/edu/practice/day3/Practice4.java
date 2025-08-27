package edu.practice.day3;

import java.util.Scanner;

public class Practice4 {

    private String name; // 학생명
    private int studentId; // 학번
    private int[] scores = new int[5]; // 과목별 점수 배열 (5과목)
    private String[] subjects; // 과목명 배열
    private int sum;
    private double mean;
    private char grades;

    public char getGrades() {
        return grades;
    }

    public void setGrades(char grades) {
        this.grades = grades;
    }

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

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
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

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }


    public void inputScores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== " + getName() + " 학생 성적 입력 ===");
        for (int i = 0; i < 5; i++) {
            System.out.print(subjects[i] + " 점수: ");
            scores[i] = sc.nextInt();
        }
    }
    public void getGrade() {
        for (int i = 0; i < 5; i++) {
            setSum(getSum() + scores[i]);
        }
        setMean((double)(getSum() / 5));
        if (getMean() >= 90){
            setGrades('A');
        } else if (getMean() >= 80){
            setGrades('B');
        } else if (getMean() >= 70) {
            setGrades('C');
        }  else if (getMean() >= 60) {
            setGrades('D');
        } else {
            setGrades('F');
        }
    }
    public void printReport(){
        getGrade();
        System.out.printf("=== %s(%d) 성적표 ===", getName(), getStudentId());
        for (int i = 0; i < 5; i++) {
            System.out.println(subjects[i] + ": "  + scores[i]);
        }
        System.out.println("-----------------------");
        System.out.println("총점 : " + getSum());
        System.out.println("평균 : " + getMean());
        System.out.println("학점 : " + getGrades());
    }
}
