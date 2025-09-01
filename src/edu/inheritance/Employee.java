package edu.inheritance;

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
        System.out.println("Name: "+eName);
        System.out.println("ID: "+eId);
        System.out.println("Salary: "+baseSalary);
        System.out.println("Department: "+department);
    }
}
