package edu.inheritance.ex;

class Bird extends Animal {

    public double wingspan;

    public Bird() {

    }

    public Bird(String name, int age, String color, double wingspan) {
        super(name, age, color);
        this.wingspan = wingspan;
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();
    }

    public void fly() {
        System.out.println(getName() + " 가 높이 날아오릅니다.");
    }

    public void buildNest() {
        System.out.println(getName() + " 가 둥지를 짓습니다.");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("짹짹 웁니다.");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(" 날아다닙니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        if(wingspan>0){
            System.out.println("날개길이 : " + getWingspan());
        }
    }
}
