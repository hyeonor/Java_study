package ch06_Object_Oriented_Programming1.Ex6_07_Reference_Parameter;

class Ex6_07 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) { // 참조형 매개변수: 변수의 값을 읽고 변경할 수 있음(read & write)
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
