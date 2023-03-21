package ch06_Object_Oriented_Programming1.Ex6_06_Primitive_Parameter;

class Ex6_06 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) { // 기본형 매개변수: 변수의 값을 읽기만 가능(read only)
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}