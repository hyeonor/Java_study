package ch06_Object_Oriented_Programming1.Ex6_10_Overloading;

class MyMath3 {
    int add(int a, int b) { // 이 메서드를 주석 처리하게 되면 Ambiguous method 에러 발생
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) { // 배열의 모든 요소의 합을 결과로 돌려준다.
        System.out.print("int add(int[] a) - ");
        int result = 0;

        for (int j : a) result += j;

        return result;
    }
}
