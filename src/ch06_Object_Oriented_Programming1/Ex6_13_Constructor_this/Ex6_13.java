package ch06_Object_Oriented_Programming1.Ex6_13_Constructor_this;

/*
생성자 this()
1. 생성자에서 다른 생성자 호출할때 사용
2. 다른 생성자 호출시 첫 줄에서만 사용가능
 */

class Car2 {
    String color;        // 색상
    String gearType;     // 변속기 종류 - auto(자동), manual(수동)
    int door;            // 문의 개수

    Car2() {
        this("white", "auto", 4); // Car2(String color, String gearType, int door)를 호출
    }

    Car2(String color) {
        this(color, "auto", 4); // Car2(String color, String gearType, int door)를 호출
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
    }
}
