package edu.practice.day11;
import edu.exception.ex.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class BankAccountManager {
    public void method2() {
        Map<String, Integer> accountMap = new HashMap<>(); // 계좌번호 : 잔액
        Map<String, String> ownerMap = new HashMap<>();   // 계좌번호 : 예금주명
        Scanner sc = new Scanner(System.in);

        // 초기 데이터
        accountMap.put("1001-2345", 50000);
        accountMap.put("2002-3456", 75000);
        accountMap.put("3003-4567", 120000);
        ownerMap.put("1001-2345", "김철수");
        ownerMap.put("2002-3456", "이영희");
        ownerMap.put("3003-4567", "박민수");

        String account = null;
        try {
            System.out.print("계좌번호를 입력하세요: ");
            account = sc.nextLine();
            if (!accountMap.containsKey(account)) {
                throw new NumberFormatException();
            }
            System.out.print("출금할 금액을 입력하세요: ");
            int toWithdraw = sc.nextInt();
            if (accountMap.get(account) < toWithdraw) {
                throw new IllegalArgumentException();
            } else {
                accountMap.put(account, accountMap.get(account) - toWithdraw);
            }
            sc.nextLine();
            System.out.print("계좌번호 주인의 이름을 입력하세요 : ");
            String owner = sc.nextLine();
            if(!ownerMap.get(account).equals(owner)){
                throw new UserNotFoundException();
            }
        } catch (NumberFormatException e) {
            System.out.println("계좌번호가 존재하지 않습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("잔액이 부족합니다. 출금가능 금액 : " + accountMap.get(account));
        } catch (UserNotFoundException e) {
            System.out.println("일치하는 계좌의 주인이 존재하지 않습니다.");
        } finally {
            System.out.println("거래 완료. 계좌 "+ account + " 의 잔액 : " + accountMap.get(account));
            sc.close();
        }

        // 계좌번호 존재 여부 확인 (null 체크)
        // 출금 금액 입력 시 NumberFormatException 처리
        // 잔액 부족 시 IllegalArgumentException 발생 및 처리
        // finally에서 Scanner 종료 및 "거래 완료" 메시지
    }
}

