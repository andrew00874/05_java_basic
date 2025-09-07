package edu.practice.day9.Model;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    Map<String, String> productMap =  new HashMap<>();
    Map<String, Integer> priceMap = new HashMap<>();

    public ProductManager() {
        System.out.println("초기 데이터를 설정합니다.");
        addProduct("P001", "갤럭시S24", 1200000);
        addProduct("P002", "아이폰15", 1300000);
        addProduct("P003", "나이키운동화", 150000);
        System.out.println("--------------------");
    }

    public void addProduct(String productId, String productName, int price) {
        if  (productMap.containsKey(productId)) {
            System.out.println("이미 존재하는 상품입니다!");
        }  else {
            System.out.println(productName + " 상품이 추가되었습니다!");
            productMap.put(productId, productName);
            priceMap.put(productId, price);
        }
    }

    public void searchProduct(String productId) {
        if (productMap.containsKey(productId)) {
            System.out.println("상품 ID : " + productId + " 상품명 : " +  productMap.get(productId) + " 가격 : " +   priceMap.get(productId));
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }
    }

    public void displayAllProducts() {
        System.out.println("==== 전체 상품 출력 ====");
        for (Map.Entry<String, String> entry : productMap.entrySet()) {
            Integer price = priceMap.get(entry.getKey());
            System.out.println("상품 ID : " +  entry.getKey() + " 상품명 :  " + entry.getValue() + " 가격 : " + price);
        }
    }

    public void removeProduct(String productId) {
        if (productMap.containsKey(productId)) {
            productMap.remove(productId);
            priceMap.remove(productId);
        } else {
            System.out.println("존재하지 않는 상품 ID입니다!");
        }
    }
}
