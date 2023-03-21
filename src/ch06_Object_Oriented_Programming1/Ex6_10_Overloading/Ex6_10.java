package ch06_Object_Oriented_Programming1.Ex6_10_Overloading;

class Ex6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        int numInt = 3;
        long numLong = 3L;

        System.out.println("mm.add(3, 3) 결과:" + mm.add(numInt, numInt));
        System.out.println("mm.add(3L, 3) 결과: " + mm.add(numLong, numInt));
        System.out.println("mm.add(3, 3L) 결과: " + mm.add(numInt, numLong));
        System.out.println("mm.add(3L, 3L) 결과: " + mm.add(numLong, numLong));

        int[] a = {100, 200, 300};

        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

