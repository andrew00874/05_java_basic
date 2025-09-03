package edu.polymorphism.pack2.ex1;

/*
* 부모 클래스
* */
public class Animal {
    protected String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {}

    public void sleep() {}
}
