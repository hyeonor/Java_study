package ch07_Object_Oriented_Programming2.Ex7_07_Reference_Variable_Casting2;

class Ex7_07 {
    public static void main(String[] args) {
        Car car = null; // 형변환을 할 때 실제 인스턴스가 무엇인지가 중요

        FireEngine fe = (FireEngine) car; // 조상 -> 자손으로 형변환
        Car car2 = (Car) fe; // 자손 -> 조상으로 형변환
        car2.drive(); // NullPointerException 발생
    }
}

class Car {
    String color;
    int door;

    void drive() { // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() { // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car { // 소방차
    void water() { // 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}
