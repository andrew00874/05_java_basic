package edu.oop.basic;
/* 클래스 : 객체가 가져야할 속성(값), 기능(메서드)를 글(코드) 형태로 작성해둔 문서
* 문서를 추후에 new 클래스이름() 생성자를 이용하여 객체로 호출
* */
public class Nation {
    //private 대신 public을 이용하여 다른 클래스 파일에서
    //Nation에 작성된 속성기능 호출해서 사용
    /* 속성(값) */
    private String name;
    private int age;
    private char gender;
    private String juminNumber;
    private String tel;
    private String address;

    public Nation(){

    }

    public Nation(String name, int age, char gender, String juminNumber, String tel, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.juminNumber = juminNumber;
        this.tel = tel;
        this.address = address;
    }

    /*
    * set 변수이름을 직접적으로 활용하지 않으면
    * setJuminNumber 메서드 이름처럼 회색빛으로
    * 사용되지 않은 메서드임이 표기되어 있다.
    * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getJuminNumber() {
        return juminNumber;
    }

    public void setJuminNumber(String juminNumber) {
        this.juminNumber = juminNumber;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /* 기능 */
    public void speakKorean(){
        System.out.println("가나다라 한국어 가능");
    }

    public void welfare(){
        System.out.println("우리나라에서 제공하는 복지를 누릴 권리가 있습니다.");
    }

    public void tax() {
        if (age >= 19) {
            System.out.printf("%s 님은 세금 납부 대상자입니다.\n", name);
        } else {
            System.out.printf("%s 님은 세금 납부 대상자가 아닙니다.\n", name);
        }
    }

    public void introduce(){
        System.out.printf("이름은 %s이고, %d세 %c성입니다. \n", name, age, gender);
    }


}
