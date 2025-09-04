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
}
