package edu.oop.field.pack1;
/* -- 정리 --
* public : 모든곳에서 사용 가능, 가장 개방적
* protected : 같은 패키지 내에서, 자식 클래스에서만 사용 가능
* default : 같은 패키지 내에서만 사용 가능
* private : 같은 클래스에서만 사용 가능, 가장 폐쇄적
*
* 개방성 : public > protected > default > private
*
* */
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
