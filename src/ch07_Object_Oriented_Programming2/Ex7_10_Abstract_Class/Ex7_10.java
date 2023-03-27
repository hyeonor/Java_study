package ch07_Object_Oriented_Programming2.Ex7_10_Abstract_Class;

/*
추상 클래스(abstract class)
- 미완성 설계도, 미완성 메서드를 갖고 있는 클래스
- 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가
- 상속을 통해 추상 메서드를 완성해야 인스턴스 생성 가능

추상 메서드(abstract method)
- 미완성 메서드, 구현부(몸통, { })가 없는 메서드
- 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우
- 추상 메서드 호출 가능(호출할 때는 선언부만 필요)
 */

public class Ex7_10 {
    public static void main(String[] args) {
//        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        Unit[] group = new Unit[3];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();

        // group의 타입은 Unit[], group[0], group[1], group[2]의 타입은 Unit
        group[0].move(100, 200);
        group[1].move(100, 200);
        group[2].move(100, 200);
    }
}

abstract class Unit { // 추상 클래스
    int x, y;

    abstract void move(int x, int y);

    void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }

    void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit { // 탱크
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }

    void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }

    void load() { /* 선택된 대상을 태운다. */ }

    void unload() { /* 선택된 대상을 내린다. */ }
}
