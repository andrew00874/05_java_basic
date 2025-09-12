package edu.io;
/*
* String : 불변
*   메모리 공간이 생성되고, 삭제되고, 생성되고, 삭제되고를 반복
*
* StringBuilder : 가변
*   하나의 공간에 데이터가 모두 들어올 때 까지 대기 후, 모두 들어오면 공간 완성
* */
public class StringVSStringBuilder {
    public void method1() {
        String result = "";

        for (int i = 0; i < 1000; i++) {
            result += "숫자 : " + i + "\n";
        }
    }

    public void stringBuilderMethod(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("숫자 : ").append(i).append("\n");
        }

        String result = stringBuilder.toString();
    }
}
