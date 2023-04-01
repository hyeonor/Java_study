package ch09_java_lang_Package_and_Useful_Class;

/*
문자열(String)의 비교
1. 문자열을 만드는 방법
    1) 문자열 리터럴을 지정하는 방법
    2) String 클래스의 생성자를 사용해서 만드는 방법
2. String 클래스의 생성자를 이용한 경우
   new 연산자로 메모리할당이 이루어지므로, 새로운 String 인스턴스가 생성
   반면, 문자열 리터럴은 이미 존재하는 것을 재사용
 */

class Ex9_06_Compare_String {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ?  " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));
    }
}
