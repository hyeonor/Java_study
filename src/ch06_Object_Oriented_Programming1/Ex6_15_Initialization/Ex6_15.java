package ch06_Object_Oriented_Programming1.Ex6_15_Initialization;

class Ex6_15 {
    static int[] arr = new int[10]; // 명시적 초기화

    static { // 클래스 초기화 = 배열 arr을 난수로 채운다.
        for (int i = 0; i < arr.length; i++) {
            // 1과 10사이의 임의의 값을 배열 arr에 저장한다.
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "] :" + arr[i]);
    }
}
