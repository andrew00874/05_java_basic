package edu.practice.day9.Model;

import java.util.HashMap;
import java.util.Map;

public class MemberPointManager {
    Map<String, Integer> PointMap =  new HashMap<String, Integer>();

    public MemberPointManager() {
        System.out.println("초기 데이터 설정");
        registerMember("user01");
        registerMember("user02");
        registerMember("user03");
        earnPoints("user01", 1500);
        earnPoints("user02", 1000);
        earnPoints("user03", 500);
    }
    public void registerMember(String id) {
        if(!PointMap.containsKey(id)) {
            PointMap.put(id, 0);
            System.out.println(id + " 님이 신규 회원으로 등록되었습니다.");
        } else {
            System.out.println("이미 존재하는 ID입니다!");
        }
    }

    public void earnPoints(String id, int points) {
        if(PointMap.containsKey(id)) {
            PointMap.put(id, PointMap.get(id) + points);
            System.out.println(id + "님에게 " + points + "포인트가 적립되었습니다. 총 포인트 : " +  PointMap.get(id));
        } else {
            System.out.println("존재하지 않는 회원 ID입니다.");
        }
    }

    public void usePoints(String id, int points) {
        if(!PointMap.containsKey(id)) {
            System.out.println("존재하지 않는 회원아이디입니다.");
        } else if(PointMap.get(id) >= points) {
            PointMap.put(id, PointMap.get(id) - points);
            System.out.println(id + "님이 "  + points + "포인트를 사용했습니다. 남은 포인트 : " + PointMap.get(id));
        } else {
            System.out.println("포인트가 부족합니다. 현재포인트 : " + PointMap.get(id));
        }
    }

    public void displayAllMembers() {
        System.out.println("=== 전체 회원 포인트 정보 ===");
        for(Map.Entry<String, Integer> entry : PointMap.entrySet()) {
            System.out.println("ID : " + entry.getKey() + ", 포인트 : " + entry.getValue());
        }
    }

}
