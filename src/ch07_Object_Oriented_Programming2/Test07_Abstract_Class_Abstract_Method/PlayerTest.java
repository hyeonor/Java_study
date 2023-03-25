package ch07_Object_Oriented_Programming2.Test07_Abstract_Class_Abstract_Method;

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

abstract class Player { // 추상 클래스
    abstract void play(int pos); // 추상 메서드

    abstract void stop(); // 추상 메서드
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + " 위치부터 재생합니다.");
    }

    void stop() {
        System.out.println("재생을 정지합니다.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player(); // 추상 클래스는 객체 생성 불가
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
    }
}
