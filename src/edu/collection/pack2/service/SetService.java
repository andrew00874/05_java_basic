package edu.collection.pack2.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetService {
    // Set : 집합, 주머니
    // - 기본적으로 순서를 유지하지 않음
    //      (index 없음! -> get() 메서드가 존재하지 않음)

    // - 중복데이터 저장 불가(같은 데이터가 들어오면 덮어쓰기 됨)
    //  띄어쓰기나 공백도 모두 데이터로 칭함

    // set 객체 생성
    // 1. HashSet(대표) : 처리 속도가 빠른 Set
    
    // 2 LinkedHashSet  : 순서를  유지하는 Set
    
    // 3. TreeSet       : 자동   정렬되는 Set
    
    public void method1(){
        // List   ArrayList 와 동일하고, List 에서 Set 으로 변경된 것 일 뿐!
        Set<String> set =new HashSet<>();
        
        
        // 1. boolean add(E e):   값을 넣고 true false 형태를 지니는 기능
        set.add("카카오");
        set.add("네이버");
        set.add("라인");
        set.add("당근");

        // 2. 모두 조회 출력 .toString 을 생략하고, 변수이름만 작성가능 OK!
        System.out.println("set 공간에 들어간 데이터들의 순서 확인하기 : " + set);
        // set 공간에 들어간 데이터들의 순서 확인하기 : [카카오, 네이버, 당근, 라인]
        // 순서대로 저장 안됨

        set.add("배달의민족");
        set.add("배달의민족");
        set.add("배달의민족");
        set.add("배달의민족");
        set.add(" 배달의민족");
        set.add("배 달의민족");
        set.add("배달 의민족");
        set.add("배달의 민족");
        set.add("배달의민 족");
        set.add("배달의민족 ");
        System.out.println("set 공간에 들어간 데이터들의 중복 확인하기 : " + set);

        // 2. size() 개수 확인하기
        System.out.println("set 의 개수 : " + set.size());
        // 중복된 배달의민족은 모두 덮어쓰기
        // 띄어쓰기로 공백을 준 배달의민족 들은
        // 모두 다른 데이터로 판단하여 추가됨

        // null 은 데이터가 존재하지 않음 표기
        // null 또한 데이터로 판단하기 때문에 1회 들어감
        // null 2개 이상은 존재하지 않음

        // 3. 순차 접근하여 모든 데이터 확인하기
        // Iterator = 순차적으로 접근할 수 있도록 설정된 문서
        // 반복자   = 컬렉션에 객체에 저장된 요소를 하나씩 순차 접근 하는 객체
        // boolean hasNext(); 다음 순차 접근할 요소가 있으면 true false
        // 다음에 접근할 데이터가 존재하나요? while문을 주로 사용
        // List는 인덱스 번호가 존재하지만 Set의 경우에는 데이터의 순번이나 키 명칭이 존재하지 않기 때문

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            // set 이라는 공간에 다음으로 보여줄 데이터가 존재한다면 진행, 없으면 멈춤!

            System.out.println(iterator.next());

        }
    }
    public void method2(){
        Set<String> 과자들 = new HashSet<>();

        과자들.add("몽쉘");
        과자들.add("꼬북칩");
        과자들.add("빈츠");
        과자들.remove("몽쉘");
        System.out.println(과자들.remove("빈츠"));
        과자들.clear();
        System.out.println(과자들.isEmpty());
    }

    /*
    * TreeSet : 트리 구조를 이용해 객체를 저장하는 Set
    * -> 기본 오름차순 정렬
    * * class 파일의 전제조건 : 저장되는 객체는 Comparable ( = 유사한, 비교 ) 상속 존재
    *
    * */
    public void lotto(){
        Set<Integer> lotto = new TreeSet<>();
        // 난수 생성

        while(lotto.size() < 6){
            lotto.add(((int)(Math.random() * 45) + 1));
        }
        System.out.println("lotto : " + lotto);
    }
}
