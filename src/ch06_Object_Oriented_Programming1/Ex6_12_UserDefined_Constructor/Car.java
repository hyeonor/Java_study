package ch06_Object_Oriented_Programming1.Ex6_12_UserDefined_Constructor;

class Car {
    String color;        // 색상
    String gearType;    // 변속기 종류 - auto(자동), manual(수동)
    int door;            // 문의 개수

    Car() { } // 기본 생성자

    Car(String c, String g, int d) { // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}
