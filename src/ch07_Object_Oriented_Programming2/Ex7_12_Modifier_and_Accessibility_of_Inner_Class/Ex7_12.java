package ch07_Object_Oriented_Programming2.Ex7_12_Modifier_and_Accessibility_of_Inner_Class;

class Ex7_12 {
    class InstanceInner { // 인스턴스 내부 클래스
        int iv = 100;
//        static int cv = 100;          // 에러! static 변수를 선언할 수 없다.
        final static int CONST = 100;   // final static은 상수이므로 허용
    }

    static class StaticInner { // Static 내부 클래스
        int iv = 200;
        static int cv = 200;   // static 클래스만 static 멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300;           // 에러! static 변수를 선언할 수 없다.
            final static int CONST = 300;    // final static은 상수이므로 허용
        }

        int i = LocalInner.CONST; // OK
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
//        System.out.println(LocalInner.CONST); // 에러. 지역 내부 클래스는 메서드 내에서만 사용 가능
    }
}
