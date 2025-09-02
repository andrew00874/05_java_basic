package edu.polymorphism.ex3.run;

import edu.polymorphism.ex3.model.Dog;
import edu.polymorphism.ex3.model.Cat;
import edu.polymorphism.ex3.model.Bird;
import edu.polymorphism.ex3.model.Animal;

import edu.polymorphism.ex3.service.AnimalService;

public class AnimalRun {
    public static void main(String[] args) {
        AnimalService service = new AnimalService();
        Dog dog = new Dog("멍멍이", 3, "갈색", "개", "시츄", true);
        Cat cat = new Cat("야옹이", 2, "흰색", "고양이", 9, false);
        Bird bird = new Bird("짹짹이", 1, "노란색", "새", 15.57, true);

        Animal[] animals = {dog, cat, bird};

        System.out.println("=== 동물들의 행동 ===");
        for (Animal animal : animals) {
            service.performActions(animal);
        }
//        // 개
//        dog.makeSound();
//        dog.move();
//        dog.setTrained(true);
//        dog.doSpecialAction();
//        dog.eat();
//        System.out.println(dog.toString());
//
//        System.out.println();
//
//        // 고양이
//        cat.makeSound();
//        cat.move();
//        cat.doSpecialAction();
//        cat.eat();
//        System.out.println(cat.toString());
//
//        System.out.println();
//
//        // 새
//        bird.makeSound();
//        bird.move();
//        bird.doSpecialAction();
//        bird.eat();
//        System.out.println(bird.toString());
    }
}
