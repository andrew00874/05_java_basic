package edu.oop.basic.ex;

public class Employee {
    private String name;
    private int age;
    private String dept;
    private String position;
    private int salary;
    private String employeeId;
    private int workYears;

    public Employee(){

    }

    public Employee(String name, String dept, String position, String employeeId) {
        this.name = name;
        this.dept = dept;
        this.position = position;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getWorkYears() {
        return workYears;
    }

    public void setWorkYears(int workYears) {
        this.workYears = workYears;
    }

    public void introduce(){
        System.out.printf("안녕하세요. %s부서 %s %s입니다.\n", getDept(), getPosition(), getName());
    }

    public void work(){
        System.out.printf("%s님이 %s부서에서 열심히 근무중입니다.\n", getName(), getDept());
    }

    public void salInfo(){
        System.out.printf("%s님의 연봉 : %d만원\n", getName(), getSalary());
    }

    public void checkPromo(){
        if (workYears >= 3){
            System.out.printf("%s님은 근무년수 %d년으로 승진대상자입니다.\n", getName(), getWorkYears());
        } else {
            System.out.printf("%s님은 근무년수 %d년으로 승진까지 %d년 더 필요로 합니다.\n", getName(), getWorkYears(), 3-getWorkYears());
        }
    }

    public void retirement() {
        int retirement = getSalary() * getWorkYears();
        System.out.printf("%s 님의 예상 퇴직금 : %,d만원(연봉 %,d만원 x 근무년수 %d년) \n", getName(), retirement, getSalary(), getWorkYears());
    }

    @Override
    public String toString() {
        return  "이름 = '" + name + '\'' +
                ", 나이 = " + age +
                ", 부서 = '" + dept + '\'' +
                ", 직급 = '" + position + '\'' +
                ", 연봉 = " + salary +
                ", 사원번호 = '" + employeeId + '\'' +
                ", 근속년수 = " + workYears;
    }
}
