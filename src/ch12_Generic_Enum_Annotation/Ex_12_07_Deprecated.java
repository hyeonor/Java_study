package ch12_Generic_Enum_Annotation;

/*
표준 애너테이션 - @Deprecated
- 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
  @Deprecated public int getDate() { return normalize().getDayOfMOnth(); }

- @Deprecated가 붙은 대상이 사용된 코드를 컴파일하면 나타나는 메시지
  Note : AnnotationEx2.java uses or overrides a deprecated API.
  Note : Recompile with -Xlint:deprecation for details.
 */

class Parent2 {
    void parentMethod() { }
}

class Child2 extends Parent2 {
    @Deprecated
    void parentMethod() { }
}

public class Ex_12_07_Deprecated {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.parentMethod(); //@Deprecated 사용된 메서드
    }
}
