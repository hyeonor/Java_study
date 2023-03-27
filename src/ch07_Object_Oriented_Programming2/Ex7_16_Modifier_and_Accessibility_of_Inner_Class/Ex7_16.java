package ch07_Object_Oriented_Programming2.Ex7_16_Modifier_and_Accessibility_of_Inner_Class;

class Outer3 {
    int value = 10;     // Outer3.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("            value :" + value);
            System.out.println("       this.value :" + this.value);
            System.out.println("Outer3.this.value :" + Outer3.this.value);
        }
    } // Inner 클래스의 끝¡
} // Outer 클래스의 끝¡

class Ex7_16 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.method1();
    }
}
