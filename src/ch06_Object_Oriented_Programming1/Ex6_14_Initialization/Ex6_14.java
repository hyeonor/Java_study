package ch06_Object_Oriented_Programming1.Ex6_14_Initialization;

class Ex6_14 {
    static { // 클래스 초기화 블럭
        System.out.println("static { }");
    }

    { // 인스턴스 초기화 블럭
        System.out.println("{ }");
    }

    public Ex6_14() { // 생성자 초기화
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14(); ");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }
}
