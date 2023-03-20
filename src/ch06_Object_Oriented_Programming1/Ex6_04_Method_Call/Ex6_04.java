package ch06_Object_Oriented_Programming1.Ex6_04_Method_Call;

class Ex6_04 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long a = 5L, b = 3L;
        long result1 = mm.add(a, b);
        long result2 = mm.subtract(a, b);
        long result3 = mm.multiply(a, b);
        double result4 = mm.divide(a, b);
        long result5 = mm.max(a, b);
        long result6 = mm.min(a, b);
        mm.printGugudan(9);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
        System.out.println("max(5L, 3L) = " + result5);
        System.out.println("min(5L, 3L) = " + result6);
    }
}

