package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class ShoppingMallTestRun {
    public static void main(String[] args) {
        System.out.println("==== 쇼핑몰 관리 시스템 ====");
        Scanner sc = new Scanner(System.in);
        ShoppingMallMember member1 = new ShoppingMallMember();
        ShoppingMallMember member2 = new ShoppingMallMember();
        ShoppingMallMember member3 = new ShoppingMallMember();
        member1.ultSetter("김쇼핑","a@a.com","user001");
        member2.ultSetter("박구매","b@a.com","user002");
        member3.ultSetter("이주문", "c@a.com","user003");
        member1.joinMember();
        member2.joinMember();
        member3.joinMember();
        member1.visitSite();
        member1.visitSite();
        member2.visitSite();
        member3.visitSite();
        System.out.println();
        System.out.println("---- 회원가입 후 통계 ----");
        System.out.println("전체 회원 수 : " + ShoppingMallMember.totalMemberCount + "명");
        System.out.println("일일 방문자 수 : " + ShoppingMallMember.dailyVisitorCount + "명");
        System.out.println();
        member1.addToCart(15);
        member1.printMemberInfo();
        System.out.println();
        System.out.println("=== 쇼핑몰 운영 정보 ===");
        System.out.println("쇼핑몰명 : " + ShoppingMallMember.SHOPPING_MALL_NAME);
        System.out.println("고객센터 : " + ShoppingMallMember.SERVICE_CENTER_NUMBER);
        System.out.println("최대 장바구니 수 : " + ShoppingMallMember.MAX_CART_ITEMS + "개");
        System.out.println("최소 비밀번호 길이 : " + ShoppingMallMember.MIN_PASSWORD_LENGTH + "자");
    }
}
