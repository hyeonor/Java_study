package ch07_Object_Oriented_Programming2.Test06_Encapsulation;

/*
캡슐화와 접근 제어자
접근 제어자를 사용하는 이유?
- 외부로부터 데이터를 보호하기 위해서 (외부에서 메서드를 통해 간접 접근 허용)
- 외부에 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서
 */

class Time {
    private int hour;   // 0 ~ 23 사이의 값을 가져야함
    private int minute; // 0 ~ 59 사이의 값을 가져야함
    private int second; // 0 ~ 59 사이의 값을 가져야함

    public void setHour(int hour) {
        if (isNotValidHour(hour)) return;

        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();

//        t.hour = 25;
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);
        System.out.println(t.getHour());
    }
}
