package edu.inheritance.ex;

class Cat extends Animal {

    private Boolean isInsider;
    public Cat(){

    }

    public Cat(String name, int age, String color, Boolean isInsider) {
        super(name, age, color);
        this.isInsider = isInsider;
    }

    public Boolean getInsider() {
        return isInsider;
    }

    public void setInsider(Boolean insider) {
        isInsider = insider;
    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();

    }

    public void purr() {
        System.out.println(getName() + " 가 골골 소리를 냅니다.");
    }

    public void scratch() {
        System.out.println(getName() + " 가 박박 긁습니다.");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("야옹 웁니다.");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("네 발로 조용히 걸어다닙니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        if (isInsider == true) {
            System.out.println("실내묘입니다.");
        } else {
            System.out.println("실외묘입니다.");
        }
    }
}
