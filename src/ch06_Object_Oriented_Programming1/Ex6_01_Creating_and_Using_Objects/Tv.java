package ch06_Object_Oriented_Programming1.Ex6_01_Creating_and_Using_Objects;

public class Tv {
    // Tv의 속성(멤버변수)
    public String color;           // 색상
    public boolean power;          // 전원상태(on/off)
    public int channel;            // 채널

    // Tv의 기능(메서드)
    public void power() { power = !power; }   // TV를 켜거나 끄는 기능을 하는 메서드
    public void channelUp() { ++channel; }    // TV의 채널을 높이는 기능을 하는 메서드
    public void channelDown() { --channel; }  // TV의 채널을 낮추는 기능을 하는 메서드
}
