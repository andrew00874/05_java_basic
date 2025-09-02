package edu.polymorphism.ex2.model;

public class Professor extends UniverseMember{
    private String professorDepartment;
    private String professorOfficeLocation;
    private double professorSalary;

    public Professor() {}

    public Professor(String professorName, String professorId, String professorDepartment, String professorOfficeLocation, double professorSalary) {
        super(professorName, professorId);
        this.professorDepartment = professorDepartment;
        this.professorOfficeLocation = professorOfficeLocation;
        this.professorSalary = professorSalary;
    }

    public Professor(String professorDepartment, String professorOfficeLocation, double professorSalary) {
        this.professorDepartment = professorDepartment;
        this.professorOfficeLocation = professorOfficeLocation;
        this.professorSalary = professorSalary;
    }

    public Professor(String name, String ID,  String professorDepartment) {
        super(name, ID);
        this.professorDepartment = professorDepartment;
    }

    public Professor(String name, String ID) {
        super(name, ID);
    }

    public String getProfessorDepartment() {
        return professorDepartment;
    }

    public void setProfessorDepartment(String professorDepartment) {
        this.professorDepartment = professorDepartment;
    }

    public String getProfessorOfficeLocation() {
        return professorOfficeLocation;
    }

    public void setProfessorOfficeLocation(String professorOfficeLocation) {
        this.professorOfficeLocation = professorOfficeLocation;
    }

    public double getProfessorSalary() {
        return professorSalary;
    }

    public void setProfessorSalary(double professorSalary) {
        this.professorSalary = professorSalary;
    }

    public void displayProfessorInfo() {
        System.out.println("교수 이름: " + getName());
        System.out.println("교번: " + getID());
        System.out.println("소속 학과: " + professorDepartment);
    }


    @Override
    public String toString() {
        return "Professor{" +
                "professorDepartment='" + professorDepartment + '\'' +
                ", professorOfficeLocation='" + professorOfficeLocation + '\'' +
                ", professorSalary=" + professorSalary +
                '}';
    }
}
