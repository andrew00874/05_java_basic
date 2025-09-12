package edu.io.pack8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class EmployeeFileWriter {
    /*
    * StringBuilder sb = new StringBuilder();
    * sb.append("이름 : " + name + ", 부서 : " + 부서 + ", 직급 : " + 직급 + "\n");
    * Files.writeString(path, sb.toString());
    *
    * 문자열 생성이 모두 완료 될 때 까지 데이터를 추가할 수 있으며,
    * 종료를 작성하여 데티어 추가 작업을 종료하면 최종적으로 추가된 문자열 기반으로 파일에 데이터 저장
    *
    * String = 문자열로 이루어진
    * Builder = 빌딩
    * 한 공간 안에 탑을 만들겠다는 명칭
    * */
    public void EmployeeFileMethodByBuilder() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("직원 정보를 입력 하세요. (종료를 입력하면 파일이 생성됩니다.)");
        while (true) {
            System.out.print("직원 이름 : ");
            String name = sc.nextLine();
            if (name.equals("종료")){
                break;
            }

            System.out.print("부서 이름 : ");
            String dept = sc.nextLine();
            System.out.print("직급 : ");
            String pos = sc.nextLine();
            sb.append("이름 : " + name + "\n부서 : " + dept + "\n직급 : " + pos + "\n");
            System.out.println("입력 완료되었습니다. 다음 직원 정보를 입력하거나 종료를 입력하세요.");
            sc.close();
        }

        // 종료를 입력하면 파일 저장
        Path path = Path.of("files", "employee.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, sb.toString());
            System.out.println("파일이 성공적으로 생성되었습니다." + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void EmployeeFileMethodByStr() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("직원 정보를 입력 하세요. (종료를 입력하면 파일이 생성됩니다.)");
        while (true) {
            System.out.print("직원 이름 : ");
            String name = sc.nextLine();
            if (name.equals("종료")){
                break;
            }

            System.out.print("부서 이름 : ");
            String dept = sc.nextLine();
            System.out.print("직급 : ");
            String pos = sc.nextLine();
            str += "이름 : " + name + "\n부서 : " + dept + "\n직급 : " + pos + "\n";
            System.out.println("입력 완료되었습니다. 다음 직원 정보를 입력하거나 종료를 입력하세요.");
            sc.close();
        }

        // 종료를 입력하면 파일 저장
        Path path = Path.of("files", "employee.txt");
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, str);
            System.out.println("파일이 성공적으로 생성되었습니다." + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
