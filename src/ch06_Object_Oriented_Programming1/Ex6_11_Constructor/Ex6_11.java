package ch06_Object_Oriented_Programming1.Ex6_11_Constructor;

class Data_1 {
    int value;
}

class Data_2 {
    int value;

    // Data_2() {} //기본 생성자를 추가해야 됨

    Data_2(int x) {   // 매개변수가 있는 생성자.
        value = x;
    }
}

class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1(); //생성자가 하나도 없을 떄만, 컴파일러가 기본 생성자 자동 추가
        // Data_2 d2 = new Data_2(); // compile error 발생
                                     // cannot resolve constructor Data_2()
                                     // 기본 생성자 없기 때문에 에러
    }
}
