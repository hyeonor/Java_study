package ch09_java_lang_Package_and_Useful_Class;

/*
toString(), toString()의 오버라이딩
- toString():객체를 문자열(String)으로 변환하기 위한 메서드

public String toString() {// Object 클래스의 toString()
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}

오버라이딩 전 결과
ch09_java_lang_Package_and_Useful_Class.Card2@6bc7c054
ch09_java_lang_Package_and_Useful_Class.Card2@232204a1

오버라이딩 후 결과
kind : SPADE, number : 1
kind : HEART, number : 10
 */

class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }
}

class Ex9_05_Overriding_toString {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
