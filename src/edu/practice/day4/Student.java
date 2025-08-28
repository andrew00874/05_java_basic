package edu.practice.day4;

public class Student {
    private String name;
    private String studentId;
    private int score;

    public Student() {

    }
    public Student (String studentId, String name, int score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void displayInfo(){
        System.out.println("학생명: " + getName());
        System.out.println("학번: " + getStudentId());
        System.out.println("점수: " + getScore());
        if (isPass(getScore()))
            System.out.println("결과 : 합격");
        else
            System.out.println("결과 : 불합격");
    }

    public boolean isPass(int score){
        return score >= 60;
    }
}
