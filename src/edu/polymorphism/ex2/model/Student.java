package edu.polymorphism.ex2.model;

public class Student extends UniverseMember{
    private String studentMajor;
    private int studentGrade; // 학년
    private double studentGpa; // 학점

    public Student(){}

    public Student(String studentMajor, int studentGrade, double studentGpa) {
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentGpa = studentGpa;
    }

    public Student(String studentName, String studentId, String studentMajor, int studentGrade, double studentGpa) {
        super(studentName, studentId);
        this.studentMajor = studentMajor;
        this.studentGrade = studentGrade;
        this.studentGpa = studentGpa;
    }

    public Student(String name, String ID) {
        super(name, ID);
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public double getStudentGpa() {
        return studentGpa;
    }

    public void setStudentGpa(double studentGpa) {
        this.studentGpa = studentGpa;
    }

    public void displayStudentInfo() {
        System.out.println("학생 이름: " + getName());
        System.out.println("학번: " + getID());
        System.out.println("전공: " + studentMajor);
    }

    public void promoteStudent() {
        this.studentGrade++;
        System.out.println(getName() + " 학생이 " + studentGrade + "학년으로 진급했습니다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentMajor='" + studentMajor + '\'' +
                ", studentGrade=" + studentGrade +
                ", studentGpa=" + studentGpa +
                '}';
    }
}
