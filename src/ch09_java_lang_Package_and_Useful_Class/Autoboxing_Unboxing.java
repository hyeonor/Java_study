package ch09_java_lang_Package_and_Useful_Class;

import java.util.ArrayList;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(new Integer(100)); // list에는 객체만 추가 가능
        list.add(100); // JDK1.5이전에는 에러. 오토박싱(Autoboxing)

        Integer i = list.get(0); // list에 저장된 첫번째 객체를 꺼낸다.
        int iInt = list.get(0).intValue(); // intValue()를 사용하여 Integer를 int로 변환
        int iInt2 = list.get(0); // 생략해도 컴파일러가 자동으로 해줌. 언박싱(Unboxing)
    }
}
