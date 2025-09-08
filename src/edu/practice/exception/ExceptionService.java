package edu.practice.exception;

import java.util.Scanner;

public class ExceptionService {
    public void method1(){
        int a =10;
        int b=0;
        try { //문제가 발생할 수 있는 코드 구문 시작과 종료를 작성
            System.out.println("a / b = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
            // 이러한 돌발 행동을 진행했을 때
            // 개발자는 프로젝트 취지에 맞도록 클라이언트의 행동을 유도
        } catch (Exception e) {
            System.out.println("개발자가 생각지 못한 문제가 발생했습니다!");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
    public void method2(){
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 목록은 " + arr.length + "개 존재합니다.");
            System.out.println("선언된 배열의 인덱스를 넘어 호출했습니다.");
        } catch (Exception e){
            System.out.println("개발자가 생각지 못한 문제가 발생했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }

    }

    public void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름 : ");
        String file = sc.nextLine();
        // 파일이름 확인 확장자명 확인
        // 확장자 표기인 . 이 존재하지 않으면 예외 발생
        int dotIndex = file.lastIndexOf('.'); //.이 파일명에서 어디있는가 찾기
        try {
            //dot Index 에서 . 뒤에 아무런 확장자 명칭이 존재하지 않으면
            // throw new IllegalArgumentException
            String filename = file.substring(0, dotIndex);
            String fileContent = file.substring(dotIndex + 1);
            if (fileContent.length() == 0) {
                throw new IllegalArgumentException();
            }
            System.out.println("파일 이름 : " + filename);
            System.out.println("확장자명 : " + fileContent);
            System.out.println("파일이름과 확장자명을 확인했습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("존재하지 않는 확장자명입니다.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("substring 에 문제가 있습니다.");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("프로그램을 종료합니다.");
            sc.close();
        }
    }
    // 일주일 내 풀어볼 숙제
    // Scanner 로 ArrayList 이용해서 숫자값 입력받고, 입력받은 숫자값의 총 길이나
    // 계산을 구하는 프로그램
    // 상황에 맞는 예외처리 추가
}
