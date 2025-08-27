package edu.oop.basic.ex;

public class ProductRun {
    public static void main(String[] args) {

        Product p1 = new Product("포카칩", 2000, "오리온");
        Product p2 = new Product("프링글스", 3500, "롯데");
        Product p3 = new Product("수미칩", 2500, "해태");
        System.out.println("=== p1 정보 ===");
        p1.information();
        System.out.println("=== p2 정보 ===");
        p2.information();
        System.out.println("=== p3 정보 ===");
        p3.information();
    }
}
