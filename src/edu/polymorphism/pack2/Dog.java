package edu.polymorphism.pack2;

public class Dog extends Animal{
    private String breed;

    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}
