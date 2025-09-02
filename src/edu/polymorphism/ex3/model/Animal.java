package edu.polymorphism.ex3.model;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String color;
    protected String type;

    public Animal() {}

    public Animal(String name, int age, String color, String type) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    // 2. 자식 클래스가 반드시 구현해야 할 메소드를 추상 메소드로 변경
    public abstract void makeSound();
    public abstract void move();
    public abstract void doSpecialAction();
    public abstract void eat();

    @Override
    public String toString() {
        return "type='" + type + '\'' + ", name='" + name + '\'';
    }
}
