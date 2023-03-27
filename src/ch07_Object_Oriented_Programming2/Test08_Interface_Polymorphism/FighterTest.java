package ch07_Object_Oriented_Programming2.Test08_Interface_Polymorphism;

/*
인터페이스(Interface)
- 추상 메서드의 집합
- 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)

인터페이스의 상속
- 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
- 다중 상속이 가능(추상메서드는 충돌해도 문제 없음)

인터페이스의 구현
- 인터페이스에 정의된 추상 메서드를 완성하는 것

인터페이스를 이용한 다형성
- 인터페이스도 구현 클래스의 부모이다.
- 인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능
- 인터페이스를 메서드의 리턴타입으로 지정할 수 있다.
  (인터페이스를 구현한 클래스의 인스턴스를 반환한다는 말)
 */

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춥니다");
    }
}

interface Fightable {
    void move(int x, int y);    // public abstract가 생략됨

    void attack(Fightable f);   // public abstract가 생략됨
}

class Fighter extends Unit implements Fightable {
    // 오버라이딩 규칙: 조상(public)보다 접근제어자의 범위가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("[" + x + ", " + y + "]");
    }

    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    }

    // 싸울 수 있는 상대를 불러온다.
    Fightable getFightable() {
        Fighter f = new Fighter(); // Fighter를 생성해서 반환
        return f; // (Fightable) 생략되어 있음
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Unit u = new Fighter();       // Unit에는 attack()이 없어서 attack() 호출 불가, move() & stop() 호출 가능
        Fightable fa = new Fighter(); // Fightable에는 stop()이 없어서 stop() 호출 불가, attack() & move() 호출 가능

        f.move(100, 200);
        f.attack(new Fighter());
        f.stop();
        Fightable f2 = f.getFightable();
        System.out.println(f2);

        u.move(10, 20);
//        u.attack(new Fighter()); // Unit에는 attack()이 없어서 attack() 호출 불가
        u.stop();

        fa.move(1000, 2000);
        fa.attack(new Fighter());
//        fa.stop(); // Fightable에는 stop()이 없어서 stop() 호출 불가
    }
}
