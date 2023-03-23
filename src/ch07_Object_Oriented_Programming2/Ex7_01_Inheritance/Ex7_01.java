package ch07_Object_Oriented_Programming2.Ex7_01_Inheritance;

/*
상속(Inheritance)
- 기존의 클래스로 새로운 클래스를 작성하는 것(코드의 재사용)
- 두 클래스를 부모와자식으로 관계를 맺어주는 것
- 자손은 조상의 모든 멤버를 상속 받는다.(생성자, 초기화블럭 제외)
- 자손의 멤버 개수는 조상보다 적을 수 없다.(같거나 많다.)
- 자손의 변경은 조상에 영향을 미치지 않는다.
 */

class Tv {
    boolean power;  // 전원상태(on/off)
    int channel;    // 채널

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv {  // CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption;        // 캡션상태(on/off)

    void displayCaption(String text) {
        if (caption) {      // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

class Ex7_01 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;            // 조상 클래스로부터 상속받은 멤버
        stv.channelUp();             // 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true;    // 캡션(자막) 기능을 켠다.
        stv.displayCaption("Hello, World");
    }
}
