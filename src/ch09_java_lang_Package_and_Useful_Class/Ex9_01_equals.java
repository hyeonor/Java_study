package ch09_java_lang_Package_and_Useful_Class;

/*
equals(Object obj)
- 객체 자신(this)와 주어진 객체(obj)를 비교한다. 같으면 true, 다르면 false
- Object 클래스의 equals()는 객체의 주소를 비교(참조변수 값 비교)
 */

class Ex9_01_equals {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    // Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
    public boolean equals(Object obj) {
//        return this == obj; // 주소 비교. 서로 다른 객체는 항상 거짓

        // 참조변수의 형변환 전에 반드시 instanceof로 확인해야함.
        if (!(obj instanceof Value)) return false;

        Value v = (Value) obj;

        return this.value == v.value;
    }
}
