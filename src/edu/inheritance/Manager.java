package edu.inheritance;

public class Manager extends Employee{
    private int teamSize;
    private double bonus;

    // 생성자를 활용
    public Manager(String eName, int eId, double baseSalary, String department, int teamSize, double bonus) {
        super(eName, eId, baseSalary, department);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("관리 팀 크기 : " + getTeamSize());
        System.out.println("관리 보너스 : " + getBonus());
    }

    @Override
    public void work(){
        super.work();
        System.out.println(geteName()+ " 매니저가 " + getTeamSize() + "명의 팀을 관리합니다.");
    }

    public void meeting(){
        System.out.println(geteName() + " 매니저가 팀 미팅을 진행합니다.");
    }
    // info
    // 관리 팀 크기 : 00 명
    // 관리 보너스  :    + 원

    // work
    // ㅇㅇ 매니저가 ㅇㅇ 명의 팀을 관리합니다.

    // 매너지만 할 수 있는 업무
    // meeting
    // ㅇㅇ 매니저가 팀 미팅을 진행합니다.
}
