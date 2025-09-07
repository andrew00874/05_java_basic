package edu.practice.day9.Model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    List<String> idList = new ArrayList<String>();
    List<String> nameList = new ArrayList<>();
    List<String> deptList = new ArrayList<>();
    List<Integer> salaryList = new ArrayList<>();

    public void searchEmployee(String id){
        int idx = idList.indexOf(id);
        if(idx != -1){
            System.out.println("직원이 존재합니다! 이름 : " + nameList.get(idx));
        } else {
            System.out.println("해당 ID의 직원이 존재하지 않습니다.");
        }
    }

    public void displayByDepartment(String deptId){
        int idx = idList.indexOf(deptId);
        if(idx != -1){
            System.out.println("직원이 존재합니다! 이름 : " + nameList.get(idx));
        } else {
            System.out.println("해당 ID의 직원이 존재하지 않습니다.");
        }
    }

    public void updateSalary(String id, int salary){
        int idx = idList.indexOf(id);
        if(idx != -1){
            salaryList.set(idx, salary);
        } else {
            System.out.println("해당 ID의 직원이 존재하지 않습니다.");
        }
    }
}
