package ch06_Object_Oriented_Programming1.Ex6_09_Class_Method_Instance_Method;

class MyMath2 {
    long a, b;

    // 인스턴스 변수 a, b만을 사용해서 작업하므로 매개변수가 필요없다.
    long add() {
        return a + b;
    }  // a, b는 인스턴스 변수

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) {
        return a + b;
    }  // a, b는 지역변수

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(long a, long b) {
        return a / (double) b;
    }

}
