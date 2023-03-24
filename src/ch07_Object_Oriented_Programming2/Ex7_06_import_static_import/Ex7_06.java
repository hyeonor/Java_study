package ch07_Object_Oriented_Programming2.Ex7_06_import_static_import;

import static java.lang.System.out;
import static java.lang.Math.*; // Math 클래스의 모든 static 멤버

/*
import문
- 클래스를 사용할 때 패키지이름을 생략할 수 있다.
- 컴파일러에게 클래스가 속한 패키지를 알려준다.
- java.long 패키지의 클래스는 import 하지 않고도 사용할 수 있다. ex) String, Object, System ...

static import문
- static 멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
 */

class Ex7_06 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random());

        // System.out.println("Math.PI :"+Math.PI);
        out.println("Math.PI :" + PI);
    }
}
