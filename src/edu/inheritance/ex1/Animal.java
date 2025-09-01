package edu.inheritance.ex1;

public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {

    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println(getName()+" 이(가) 음식을 먹고있습니다.");
    }

    public void sleep(){
        System.out.println(getName()+" 이(가) 잠을 자고 있습니다.");
    }

    public void makeSound(){
        System.out.print(getName()+"이(가) ");
    }
    public void showInfo(){
        System.out.println("=== 동물 정보 ===");
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());
        System.out.println("색깔 : " + getColor());
    }
    public void move(){
        System.out.print(getName() + "이(가) ");
    }
}
