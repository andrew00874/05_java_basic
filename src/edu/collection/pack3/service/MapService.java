package edu.collection.pack3.service;

import java.util.HashMap;
import java.util.Map;

public class MapService {
    // Map : 특정 키워드 (Key) 를 입력하면
    //       해당되는 상세한 값(Value)을 얻을 수 있는 컬렉션 객체
    /*
    *  K:V 형식으로 구성
    *  K:V 한 쌍을 Entry 라고 부름
    *
    * Key : 키워드 역할 (== 변수이름 해당)
    *
    * 1) 중복 불가
    *       -> 중복되는 Key 입력시 Value를 덮어쓰게됨
    * 2) 순서유지안됨
    *
    * Key 만 묶어서 보면 Set과 같은 특징을 지니고 있음
    * Map.keySet() / Map.EntrySet() 제공하여 키 내에 작성된 데이터를 수집할 수 있음
    *
    * Value : 키워드에 해당하는 상세한 데이터
    *   -key로 인해서 모든 Value 가 구분됨
    *       -> Map.get(key) / Map.remove(Key) 형태로 사용
    * */
    public void method1() {
        //HashMap 생성
        // map1의 데이터는 숫자, 문자열 형태로 이루어진 데이터들
        Map<Integer, String> map1 = new HashMap<>();

        // V put(K k, V v) : Map 에 데이터를 추가하는 기능
        // - Map 에 추가 시
        //      중복되는 Key가 없으면 null
        //      중복되는 Key가 있으면 이전 Value 반환

        System.out.println(map1.put(1, "에그마요"));
        System.out.println(map1.put(2, "로티세리"));
        System.out.println(map1.put(3, "스테이크"));
        System.out.println(map1.put(3, "스파이시"));

        System.out.println(map1); // .toString() 생략가능

        // 2. V get(K k) : Key 에 해당하는 Value 반환
        //                 일치하는 Key가 없으면 null 반환
        System.out.println("-".repeat(20));
        System.out.println(map1.get(1));
        System.out.println(map1.get(0));
        System.out.println(map1.get(2));

        String tmap1 = map1.get(2);
        System.out.println(tmap1);

        System.out.println("size : " + map1.size());

        System.out.println("=".repeat(20));
        System.out.println("remove(2) : " + map1.remove(2));
        System.out.println("remove(5) : " + map1.remove(5));
        System.out.println(map1);

        System.out.println("clear() 전 isEmpty : " + map1.isEmpty());

        map1.clear();
        System.out.println("clear() 후 isEmpty : " + map1.isEmpty());
    }

    public void method2() {
        Map<String, String>map1 = new HashMap<>();
        map1.put("학원", "서울시 종로구");
        map1.put("집", "서울시 중구");
        map1.put("롯데타워", "서울시 송파구");
        map1.put("63빌딩", "서울시 영등포구");

        // 1번방법
        // 향상된 for문 + set
        for(String key : map1.keySet()) {
            System.out.printf("%-10s : %s\n", key,map1.get(key));
        }

        //2번방법
        // 향상된 for 문 + EntrySet
        // MAP 이라는 클래스 내부에 Entry 라는 기능을 이용해서 key와 value 를 확인하기 위한 기능

        // 향상된 for 문은 항상 끝나기 전 소괄호 앞에 존재하는 명칭이 기준
        // 1. map1 이 어디서 선언되었고, map2 이라는 명칭의 공간이 생성되었는지 확인
        // 2.  Map<String, String> map2 = new HashMap<>(); 선언된 map2의 자료형을 확인
        // String String 이기 때문에
        // 아래 들어가는 자료형 또한 Map<String, String> 과 동일하겍 작성해야함
        // map2 에 존재하는 데이터들을 하나씩 하나씩 꺼내서 확인할 것이기 때문

        for(Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.printf("%-10s : %s\n", entry.getKey(),entry.getValue());
        }
    }
}
