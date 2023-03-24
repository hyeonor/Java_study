package ch07_Object_Oriented_Programming2.Test02_Overriding;

/*
오버라이딩(Overriding)
- 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
- 선언부 변경 불가, 구현부만 변경 가능

오버라이딩 조건
1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
*/

class Point2 {
    int x;
    int y;

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point2 { // 상속
    int z;

    // 조상의 getLocation()을 오버라이딩
    String getLocation() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Point3D p = new Point3D();

        p.x = 3;
        p.y = 5;
        p.z = 7;

        System.out.println(p.getLocation());
    }
}
