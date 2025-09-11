package edu.practice.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class studyRun {
    public static void main(String[] args) {
        // 1. 멤버 배열을 만들고 리스트로 변환
        String[] members = {"유성", "연희", "형빈", "재민", "환수", "세원"};
        List<String> memberList = new ArrayList<>(Arrays.asList(members));

        // 2. 리스트를 무작위로 섞기
        Collections.shuffle(memberList);

        System.out.println("✨ 짝 맞추기 결과 ✨");

        // 3. printf를 이용해 헤더(A, B)를 출력
        // %-8s : 문자열(s)을 8칸 차지하게, 왼쪽(-) 정렬하여 출력
        System.out.println("--------------------");

        // 4. 반복문을 이용해 2명씩 짝지어 출력 (리스트 크기의 절반만큼 반복)
        for (int i = 0; i < memberList.size() / 2; i++) {
            // 첫 번째 사람: i가 0일 때 get(0), i가 1일 때 get(2) ...
            String memberA = memberList.get(i * 2);
            // 두 번째 사람: i가 0일 때 get(1), i가 1일 때 get(3) ...
            String memberB = memberList.get(i * 2 + 1);

            // 형식에 맞춰 번호와 짝지어진 멤버들을 출력
            System.out.printf("%d. %-7s %-7s%n", i + 1, memberA, memberB);
        }
    }
}