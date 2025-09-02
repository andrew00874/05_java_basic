package edu.polymorphism.ex2.model;

public class Course extends UniverseMember{
    private int courseCredits; // 학점
    private int currentEnrollment; // 현재 수강 인원
    private int maxEnrollment; // 최대 수강 인원

    public Course() {}

    public Course(String courseName, String courseCode, int courseCredits, int currentEnrollment, int maxEnrollment) {
        super(courseName, courseCode);
        this.courseCredits = courseCredits;
        this.currentEnrollment = currentEnrollment;
        this.maxEnrollment = maxEnrollment;
    }

    public Course(int courseCredits, int currentEnrollment, int maxEnrollment) {
        this.courseCredits = courseCredits;
        this.currentEnrollment = currentEnrollment;
        this.maxEnrollment = maxEnrollment;
    }

    public Course(String name, String ID) {
        super(name, ID);
    }

    public Course(String name, String ID, int maxEnrollment) {
        super(name, ID);
        this.maxEnrollment = maxEnrollment;
    }
    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    public void setCurrentEnrollment(int currentEnrollment) {
        this.currentEnrollment = currentEnrollment;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }


    public void openCourse() {
        System.out.println("강의 [" + getName() + "]가 개설되었습니다. (최대 " + maxEnrollment + "명)");
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCredits=" + courseCredits +
                ", currentEnrollment=" + currentEnrollment +
                ", maxEnrollment=" + maxEnrollment +
                '}';
    }
}
