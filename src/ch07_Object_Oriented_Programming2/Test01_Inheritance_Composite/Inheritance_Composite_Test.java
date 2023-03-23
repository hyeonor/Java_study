package ch07_Object_Oriented_Programming2.Test01_Inheritance_Composite;

class Point {
    int x;
    int y;
}

class InheritanceCircle extends Point { // 상속
    int r;
}

class CompositeCircle { // 포함
    Point p = new Point();
    int r;
}

public class Inheritance_Composite_Test {
    public static void main(String[] args) {
        InheritanceCircle ic = new InheritanceCircle();
        CompositeCircle cc = new CompositeCircle();

        ic.x = 1;
        ic.y = 2;
        ic.r = 3;

        cc.p.x = 4;
        cc.p.y = 5;
        cc.r = 6;

        System.out.println("ic.x = " + ic.x);
        System.out.println("ic.y = " + ic.y);
        System.out.println("ic.r = " + ic.r);
        System.out.println("cc.p.x = " + cc.p.x);
        System.out.println("cc.p.y = " + cc.p.y);
        System.out.println("cc.r = " + cc.r);
    }
}
