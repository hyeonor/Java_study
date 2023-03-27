package ch07_Object_Oriented_Programming2.Test09_Interface_Advantage;

/*
인터페이스의 장점
- 두 대상(객체) 간의 '연결, 대화, 소통'을 돕는 '중간 역할'을 한다.
- 선언(설계)와 구현을 분리시킬 수 있게 한다.
- 느슨한 결합
- 개발 시간을 단축할 수 있다
- 변경에 유리한 유연한 설계가 가능하다.
- 표준화가 가능하다.
- 서로 관계없는 클래스들을 관계를 맺어줄 수 있다.
 */

class A {
    public void method(B b) {
        b.method();
    }
}

class B {
    public void method() {
        System.out.println("B 클래스의 메서드");
    }
}

class C {
    public void method() {
        System.out.println("C 클래스의 메서드");
    }
}

interface I {
    void method();
}

class AI {
    public void method(I i) { // 인터테이스 I를 구현한 클래스만 들어와라
        i.method();
    }
}

class BI implements I {
    public void method() {
        System.out.println("BI 클래스의 메서드");
    }
}

class CI implements I {
    public void method() {
        System.out.println("CI 클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); // A가 B를 사용(의존)
//        a.method(new C()); // A를 변경해야하는 단점이 있음
                             // 인터페이스를 사용하면 A를 변경하지 않고 해결 가능

        AI ai = new AI();
        ai.method(new BI());
        ai.method(new CI());
    }
}
