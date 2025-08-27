package edu.oop.field.pack1;

public class FieldEx {
    // 필드(Field)
    // - 객체의 속성을 나타냄

    // - 필드 == 멤버 변수

    // * 작성법 *
    // [접근제한자] [예약어] 자료형 변수명 [=초기값];

    // 접근 제한자별 필드 선언

    public          int publicValue = 10;
    protected       int protectedValue = 10;
    /* default */   int defaultValue1 = 10;
                    int defaultValue2 = 10;
    private         int privateValue = 10;

    public void method1(){
        System.out.println(privateValue);
        System.out.println(publicValue);
        System.out.println(defaultValue1);
        System.out.println(defaultValue2);
        System.out.println(protectedValue);
    }
}
