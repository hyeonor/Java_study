package ch12_Generic_Enum_Annotation;

/*
표준 애너테이션 - @FunctionalInterface
- 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
- 함수형 인터페이스에는 하나의 추상 메서드만 가져야 한다는 제약이 있다.
 */

@FunctionalInterface // 함수형 인터페이스는 하나의 추상메서드만 가능
interface Runnable {
    void test(); //추상 메서드
//    void check(); //추상 메서드
}
