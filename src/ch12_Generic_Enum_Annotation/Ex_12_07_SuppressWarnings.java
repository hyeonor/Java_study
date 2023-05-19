package ch12_Generic_Enum_Annotation;

/*
표준 애너테이션 - @SuppressWarnings
- 컴파일러의 경고 메시지가 나타나지 않게 억제한다.
- 괄호() 안에 억제하고자 하는 경고의 종류를 문자열로 지정

  @SuppressWarnings("unchecked") //지네릭스와 관련된 경고를 억제
  ArrayList list = new ArrayList(); //지네릭 타입을 지정하지 않았음
  list.add(obj); //여기서 경고 발생

- 둘 이상의 경고를 동시에 억제
  @SuppressWarnings({"deprecation", "unchecked", "varargs"})

- '-Xlint' 옵션으로 컴파일하면, 경고 메시지를 확인할 수 있다.
 */

class Parent3 {
    void parentMethod() { }
}

class Child3 extends Parent3 {
    @Deprecated
    void parentMethod() { }
}

public class Ex_12_07_SuppressWarnings {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Child2 c = new Child2();
        c.parentMethod(); //@Deprecated 사용된 메서드
    }
}
