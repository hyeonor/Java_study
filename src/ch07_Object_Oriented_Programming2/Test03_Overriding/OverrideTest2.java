package ch07_Object_Oriented_Programming2.Test03_Overriding;

class Point3 {
    int x;
    int y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}

public class OverrideTest2 {
    public static void main(String[] args) {
        Point3 p = new Point3(3, 6);

        System.out.println(p); // System.out.println(p.toString()); 같은 의미
    }
}
