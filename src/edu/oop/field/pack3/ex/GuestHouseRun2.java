package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {
    public static void main(String[] args) {
        System.out.println("==== 게스트하우스 방문자 관리 시스템 ====");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--- 고객 정보 입력 ---");
            System.out.println("0번 입력 시 고객 정보 입력을 종료합니다.");
            System.out.print("이름을 입력해주세요 : ");
            String name = sc.nextLine();
            if (name.equals("0")) {
                break;
            }
            System.out.print("YYYY-MM-DD 형식으로 체크인 일자를 입력해주세요. : ");
            String date = sc.nextLine();
            if (date.equals("0")) {
                break;
            }
            System.out.print("방 번호를 입력해주세요 : ");
            int roomNumber = sc.nextInt();
            if (roomNumber == 0){
                break;
            }
            sc.nextLine();
            GuestHouse guest = new GuestHouse();

            guest.setGuestName(name);
            guest.setRoomNumber(roomNumber);
            guest.setCheckInDate(date);
            guest.checkIn(); // 방문자 수 1증가
            guest.guestInfo();
        }
        // 체크인 진행
        System.out.println("----- 체크인 후 방문자 수 변화 -----");
        System.out.println("전체 방문자 수 : " + GuestHouse.totalCount);

        System.out.println("=== 게스트 하우스 공통 정보 ===");
        System.out.println("게스트하우스명 : " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("WI-FI PW : " + GuestHouse.WIFI_PASSWORD);
        System.out.println("=== 게스트 하우스 운영 규정(static final) ===");
        System.out.println("체크인 시간 : " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크인 시간 : " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일수 : " + GuestHouse.MAX_STAY_DAYS + "일");
        System.out.println("최소 숙박일수 : " + GuestHouse.MIN_STAY_DAYS + "일");
        sc.close(); //스캔 출력 종료
    }
}
