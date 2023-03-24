package ch07_Object_Oriented_Programming2.Ex7_02_Reference_Variable_super;

/*
참조변수 super
- 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재
- 조상의 멤버를 자신의 멤버와 구별할 때 사용
 */

class Ex7_02 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent { int x = 10; /* super.x */ }

class Child extends Parent {
    int x = 20; // this.x

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
