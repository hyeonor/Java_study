package ch09_java_lang_Package_and_Useful_Class;

class Person {
    long id; // this.id

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        // obj가 Object 타입이므로 id 값을 참조하기 위해서는
        // Person 타입으로 형변환이 필요함
        return this.id == ((Person) obj).id;
    }

    Person(long id) {
        this.id = id;
    }
}

class Ex9_02_Overriding_equal {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if (p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");
    }
}
