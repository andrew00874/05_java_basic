package edu.inheritance.ex;

import com.sun.security.jgss.GSSUtil;

class Dog extends Animal{

    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();
    }

    public void wagTail() {
        System.out.println(getName() + " 가 꼬리를 흔듭니다.");
    }

    public void fetch() {
        System.out.println(getName() + " 가 공을 물어옵니다.");
    }
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍 짖습니다.");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("네 발로 뛰어다닙니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("품종 : " + getBreed());
    }
}