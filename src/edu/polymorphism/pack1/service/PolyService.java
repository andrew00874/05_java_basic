package edu.polymorphism.pack1.service;

import edu.polymorphism.pack1.model.Galaxy;
import edu.polymorphism.pack1.model.SmartPhone;
import edu.polymorphism.pack1.model.iPhone;

public class PolyService {
    // 필드
    // 자료형 공간이름 = 공간을 설정할 때 공간 내에 들어올 수 있는 데이터를 Iphone 형태만 가능하도록 설정
    // 아이폰 전용 집 집이름 = 아이폰이 사는 것
    iPhone iphone1 = new iPhone();
    //갤럭시 전용 집 집이름 = 갤럭시가 사는 것
    Galaxy galaxy1 = new Galaxy();

    //스마트폰 전용 집 집이름 = 각 공간에 iphone 이 살고, galaxy가 살고 있는 것
    SmartPhone s1 = new iPhone();
    SmartPhone s2 = new Galaxy();
    // 부모가 만든 공간에서 자식이 사는 것 가능
    // 자식이 만든 공간에서 본인이 사는 것 가능
    // 자식이 만든 공간에서 부모가 사는 것 불가능

    int 인트변수 = (int)100L; // int의 공간은 숫자이므로 숫자를 int로 강제 형변환 해서 가능
    // 가능한 이유는 둘다 숫자임을 자바에서 알고 있기 때문에 가능
    iPhone iphone3 = (iPhone)new SmartPhone(); //마찬가지로 형변환해서 사용하면 가능하나 데이터가 변경되며 손실이 일어날 수 있다.
    //현재코드에서는 문제가 일어나지 않지만 코드 실행시 ClassCastException 클래스가 일치하지 않습니다.
    //라며 데이터 변환 시 데이터가 손실되어 문제가 발생
    // SmartPhone을 상속받는 Galaxy와 같은 데이터가 잘못 들어올 수 있기 때문에
    // 부모 변수이름 = new 자식(); 은 가능하나
    // 자식 변수이름 = new 부모(); 는 불가능 -> 부모가 갤럭시를 참조해서 사용할 수 있기 때문이다.


    //메서드
    public void method1(){
        s1.setDisplay("retina display");
        s2.setDisplay("OLED display");

        System.out.println("S1 display : " + s1.getDisplay());
        System.out.println("S2 display : " + s2.getDisplay());
    }

    public void method2(){
        // 동일하게 만들어진 정보에 대해서 확인할 때 주로 사용
        // 부모 타입으로 이루어진 객체를 생성
        // 부모 타입에 해당하는 정보를 출력할 수 있음
        SmartPhone sp1 = new SmartPhone();
        SmartPhone sp2 = new SmartPhone();
        SmartPhone sp3 = new SmartPhone();

        SmartPhone[] sps = new SmartPhone[4];
        // 스마트폰 4대에 대한 정보를 sps 라는 공간에 한번에 넣어줄 수 있다.
        sps[0] = sp1;
        sps[1] = sp2;
        sps[2] = sp3;
        sps[3] = sp3;

        sps[0].setDisplay("retina display");
        sps[1].setDisplay("OLED display");
        sps[2].setDisplay("lod display");

        //향상된 for문
        for (SmartPhone forfor : sps) {
            System.out.println(forfor.getDisplay());
        }
    }

}
