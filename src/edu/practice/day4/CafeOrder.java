package edu.practice.day4;

public class CafeOrder {
    public static final String CAFE_NAME = "코딩카페";
    public static final double TAX_RATE = 0.1;
    public static int totalOrders;
    public static int totalSales;

    private String customerName;
    private String menuItem;
    private int price;
    private int orderName;

    static {
        System.out.println("=== " + CAFE_NAME + " 시스템 시작 ===");
        totalOrders=0;
        totalSales=0;
    };

    public CafeOrder(){

    }
    public CafeOrder(String customerName, String menuItem, int price, int orderName) {
        this.customerName=customerName;
        this.menuItem=menuItem;
        this.price=price;
        this.orderName=orderName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrderName() {
        return orderName;
    }

    public void setOrderName(int orderName) {
        this.orderName = orderName;
    }

    public void placeOrder(){
        totalOrders++;
        totalSales+=(int)(getPrice() * 1.1);
    }

    public void printReceipt(){
        System.out.println("=== 코딩카페 영수증 ===");
        System.out.println("주문번호 : " + getOrderName());
        System.out.println("고객명 : " + getCustomerName());
        System.out.println("메뉴 : " + getMenuItem());
        System.out.printf("금액 : %,d원\n",  getPrice());
        System.out.printf("세금 : %,d원\n", (int)(getPrice() * TAX_RATE));
        System.out.printf("총액 : %,d원\n", (int)(getPrice() * (1 + TAX_RATE)));
        System.out.println("===================");
    }
}