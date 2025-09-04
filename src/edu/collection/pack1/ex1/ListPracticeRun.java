package edu.collection.pack1.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeRun {
    // model, service, run 으로 나누지 않고 한 번에 실습
    // 메인메서드에서 모든 동작을 진행할 예정
    // 왜냐하면 List - ArrayList 를 단순히 익히기 위한 실습이기 때문에 한 번에 작성
    public static void main(String[] args) {
        problem1(); // function javascript 처럼 기능 실행 가능
        problem2();
        problem3();
        problem4();
        problem5();
    }
    // void 앞에 static이 붙는다는 것은.. 변수이름에 의하여 호출되지 않고,
    // 기능들 단독적으로 호출할 수 있도록 사용한다는 의미
    public static void problem1() {
        List<String> hobby = new ArrayList<>();
        hobby.add("게임");
        hobby.add("독서");
        hobby.add("요리");
        System.out.println("List size : " + hobby.size());
        for (int i = 0; i < hobby.size(); i++) {
            System.out.println(hobby.get(i));
        }
    }

    public static void problem2() {
        List<Integer> score = new ArrayList<>();
        score.add(85);
        score.add(90);
        score.add(78);
        score.add(92);
        score.add(88);
        score.set(2, 95);
        for (int i = 0; i < score.size(); i++) {
            System.out.println(score.get(i));
        }
    }
    public static void problem3() {
        List<String> menus = new ArrayList<>();
        menus.add("김치찌개");
        menus.add("된장찌개");
        menus.add("불고기");
        menus.add("비빔밥");
        menus.add("냉면");
        System.out.println("불고기의 index : " +menus.indexOf("불고기"));
        System.out.println("라면 있나? : " +menus.contains("라면"));
        System.out.println("김치찌개 있나? : " +menus.contains("김치찌개"));
        menus.remove(4);
        for(int i = 0; i < menus.size(); i++) {
            System.out.println(menus.get(i));
        }
    }
    public static void problem4() {
        List<String> cart = new ArrayList<>();
        cart.add("사과");
        cart.add("바나나");
        cart.add("우유");
        System.out.println("총 갯수 : " + cart.size());
        cart.set(1, "오렌지");
        for(int i = 0; i < cart.size(); i++) {
            System.out.println("상품 : " +cart.get(i));
        }
    }
    public static void problem5() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.println(nums.get(i));
            }
        }
        int cnt = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 5) {
                cnt++;
            }
        }
        System.out.println("5보다 큰 수의 갯수 : " + cnt);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) > max){
//                max = nums.get(i);
//            }
            max = Math.max(max, nums.get(i));
        }
        System.out.println("가장 큰 수 : " + max);
    }}
