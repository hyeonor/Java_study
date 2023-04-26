package ch12_Generics_Enum_Annotation;

import java.util.HashMap;

class Ex12_02_Generics_HashMap {
    public static void main(String[] args) {
        HashMap<String, Student2> map = new HashMap<>();
        map.put("자바왕", new Student2("자바왕", 1, 1, 100, 100, 100));

        Student2 s = (Student2) map.get("자바왕");

        System.out.println(map.get("자바왕").name);

    }
}

class Student2 {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
