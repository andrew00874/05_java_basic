package edu.polymorphism.ex3.service;

import edu.polymorphism.ex3.model.Animal;

public class AnimalService {

    // 다형성을 활용하여 모든 동물들의 공통된 행동을 실행
    public void performActions(Animal animal) {
        System.out.println("\n=== " + animal.getName() + "의 행동 시작 ===");
        animal.makeSound();
        animal.move();
        animal.eat();
        animal.doSpecialAction();
        System.out.println(animal.toString());
        System.out.println("==========================");
    }
}