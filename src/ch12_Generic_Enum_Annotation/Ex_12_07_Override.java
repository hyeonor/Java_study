package ch12_Generic_Enum_Annotation;

/*
표준 애너테이션 - @Override
- 오버 라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
- 오버 라이딩할 때 메서드 이름을 잘못 적는 실수를 하는 경우가 많다.
- 오버라이딩할 때는 메서드 선언부 앞에 @Override를 붙이기
 */

class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override
    void parentMethod() { } // 조상 메서드의 이름을 잘못 적면 안됨
}
