package ch09_java_lang_Package_and_Useful_Class;

/*
StringBuffer 클래스
- 내용을 변경할 수 있는 변경가능한(mutable) 클래스
- String 클래스처럼 문자형 배열(char[])을 내부적으로 가지고 있다
 */

class Ex9_11_Compare_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        // StringBuffer의 내용을 String으로 변환한다.
        String s = sb.toString();    // String s = new String(sb);와 같다.
        String s2 = sb2.toString();

        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}
