package edu.inheritance.ex0;

public class Employee {
    private String eName;
    private int eId;
    private double baseSalary;
    private String department;

    public Employee(String eName, int eId, double baseSalary, String department) {
        this.eName = eName;
        this.eId = eId;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    public void info(){
        System.out.println("==== 직원 정보 ====");
        System.out.println("Name: "+geteName());
        System.out.println("ID: "+geteId());
        System.out.println("Salary: "+getBaseSalary());
        System.out.println("Department: "+getDepartment());
    }

    //업무수행 - 자식클래스에서 구체적으로 구현
    public void work(){
        System.out.println(geteName() + "님이 업무를 수행합니다.");
    }
    //급여 계산 - 자식클래스에서 구체적으로 구현
    public double calculateSalary(){
        return baseSalary;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
