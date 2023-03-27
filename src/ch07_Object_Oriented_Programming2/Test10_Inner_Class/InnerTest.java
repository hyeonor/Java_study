package ch07_Object_Oriented_Programming2.Test10_Inner_Class;

/*
내부 클래스의 장점
- 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
- 코드의 복잡성을 줄일 수 있다.(캡슐화)
 */

class A { // A는 B의 외부 클래스
    int i = 100;

    class B { // B는 A의 내부 클래스
        void method() {
            System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근 가능
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        A a = new A();
    }
}
