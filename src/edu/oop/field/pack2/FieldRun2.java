package edu.oop.field.pack2;

import edu.oop.field.pack1.FieldEx;

public class FieldRun2 {
    public static void main(String[] args) {
        FieldEx f1 = new FieldEx();

        System.out.println(f1.publicValue);
        /*
        같은 패키지 + 상속을 받았을 경우에만 사용가능
        System.out.println(f1.protectedValue);
        'protectedValue'이(가) 'edu.oop.field.pack1.FieldEx'에서 protected 액세스를 가집니다

        같은 패키지에서만 사용 가능
        System.out.println(f1.defaultValue1);
        defaultValue1'이(가) 'edu.oop.field.pack1.FieldEx'에서 public이 아닙니다. 외부 패키지에서 액세스할 수

        같은 클래스에서만 사용 가능
        System.out.println(f1.privateValue);
        'privateValue'이(가) 'edu.oop.field.pack1.FieldEx'에서 private 액세스를 가집니다

        */
    }
}
