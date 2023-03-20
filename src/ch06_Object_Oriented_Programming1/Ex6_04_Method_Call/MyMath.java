package ch06_Object_Oriented_Programming1.Ex6_04_Method_Call;

class MyMath {
    // 메서드는 클래스 영역에만 정의 가능
    long add(long a, long b) { return a + b; }
    long subtract(long a, long b) {
        return a - b;
    }
    long multiply(long a, long b) {
        return a * b;
    }
    double divide(double a, double b) {
        return a / b;
    }
    long max(long a, long b) { return a > b ? a : b; }
    long min(long a, long b) { return a > b ? b : a; }

    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9))
            return; // 입력받은 단(dan)이 2 ~ 9가 아니면, 메서드 종료하고 돌아감

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
    }
}
