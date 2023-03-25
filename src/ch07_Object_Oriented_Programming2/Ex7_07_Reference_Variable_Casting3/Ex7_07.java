package ch07_Object_Oriented_Programming2.Ex7_07_Reference_Variable_Casting3;

class Ex7_07 {
    public static void main(String[] args) {
        Car c = new Car();
        FireEngine f = (FireEngine) c; // 형변환 실행 에러 ClassCastException 발생
        f.water(); // 컴파일 OK
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
