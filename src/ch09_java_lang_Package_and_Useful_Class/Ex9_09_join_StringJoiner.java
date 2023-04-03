package ch09_java_lang_Package_and_Useful_Class;

import java.util.StringJoiner;

/*
- join(): 여러 문자열 사이에 구분자를 넣어 결합함
- StringJoiner 클래스: 문자열을 결합하는데 사용
 */

class Ex9_09_join_StringJoiner {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/", "[", "]");

        for (String s : arr)
            sj.add(s);

        System.out.println(sj.toString());
    }
}
