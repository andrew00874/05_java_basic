package edu.oop.basic;

/*
* Nation 클래스를 활용한 객체 생성 및 조작 실습
* */
public class NationRun {
    public static void main(String[] args) {
        Nation n1 = new Nation();

        /* 속성(값)
        public String name;
        public int age;
        public char gender;
        public String juminNumber;
        public String tel;
        public String address;

        자료형 앞에 private이 아닌 public 으로 작성했을 경우 아래와 같은 구문 수행 가능
        은행 예시로 들었을 때 창고에 직접 들어가서 돈을 저장
        n1.name = "홍길동";
        n1.age = 20;
        n1.gender = '남';
        System.out.printf("이름 : %s, %d세 %c성입니다.\n", n1.name, n1.age, n1.gender);
        */
        n1.setName("홍길동");
        n1.setAge(10);
        n1.setGender('남');
        System.out.printf("이름 : %s, %d세 %c성입니다.\n", n1.getName(), n1.getAge(), n1.getGender());

        Nation n2 = new Nation("김준식", 20, '남', "123123-2323232", "010-2323-2323", "지구어딘가");
        n2.introduce();

        Nation n3 = new Nation();

        // Setter를 사용해 각 속성 정보 설정
        n3.setName("손흥민");
        n3.setAge(30);
        n3.setGender('남');
        n3.setJuminNumber("123456-1234567");
        n3.setTel("010-1234-5678");
        n3.setAddress("대한민국");
        n3.introduce();
        System.out.println();
        n1.tax();
        n2.tax();
        n3.tax();
        System.out.println();
        n1.welfare();
        n2.welfare();
        n3.welfare();
        System.out.println();
        n1.speakKorean();
        n2.speakKorean();
        n3.speakKorean();
    }
}
