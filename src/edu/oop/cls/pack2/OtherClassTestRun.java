package edu.oop.cls.pack2;

import edu.oop.basic.Account;
import edu.oop.basic.Nation;
// import edu.oop.cls.pack1.ClassTest1;

public class OtherClassTestRun {
    public static void main(String[] args) {
        // Nation 과 Account는 public이기 때문에 다른폴더에서도 접근 가능
        Nation n = new Nation();
        Account a = new Account();

        //다른 폴더에 있는데 default 로 접근범위를 pack1 폴더 내에서만
        //접근 가능하도록 제한했기 때문에 접근 불가능
        //ClassTest1 obj = new ClassTest1();
    }
}
