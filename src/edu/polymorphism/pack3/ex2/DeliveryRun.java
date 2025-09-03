package edu.polymorphism.pack3.ex2;

public class DeliveryRun {
    public static void main(String[] args) {
        baemin bm = new baemin("김급식");
        cpngEats cp = new cpngEats("박학식");
        DeliverApp[] da = {bm, cp};

        bm.showAccount();
        bm.orderFood();
        bm.trackOrder("B001");
        bm.payMoney(25000);
        System.out.println();
        cp.showAccount();
        cp.orderFood();
        cp.trackOrder("C002");
        cp.payMoney(15000);
    }
}
