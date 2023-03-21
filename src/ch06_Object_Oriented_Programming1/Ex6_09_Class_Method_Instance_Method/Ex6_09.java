package ch06_Object_Oriented_Programming1.Ex6_09_Class_Method_Instance_Method;

class Ex6_09 {
    public static void main(String[] args) {
        long a = 200L, b = 100L;

        // 클래스(static) 메서드 호출. 인스턴스 생성없이 호출가능
        System.out.println(MyMath2.add(a, b));
        System.out.println(MyMath2.subtract(a, b));
        System.out.println(MyMath2.multiply(a, b));
        System.out.println(MyMath2.divide(a, b));

        MyMath2 mm = new MyMath2(); // 인스턴스를 생성
        mm.a = 200L;
        mm.b = 100L;

        // 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
