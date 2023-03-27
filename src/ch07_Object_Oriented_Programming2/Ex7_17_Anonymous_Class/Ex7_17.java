package ch07_Object_Oriented_Programming2.Ex7_17_Anonymous_Class;

/*
익명 클래스(anonymous class)
-이름이 없는 일회용 클래스. 정의와 생성을 동시에

new 조상_클래스_이름() {
    // 멤버 선언
}

        또는

new 구현_인터페이스_이름() {
    // 멤버 선언
}
 */
class Ex7_17 {
    Object iv = new Object(){ void method(){} };         // 익명 클래스

    static Object cv = new Object(){ void method(){} };  // 익명 클래스

    void myMethod() {
        Object lv = new Object(){ void method(){} };     // 익명 클래스
    }
}
