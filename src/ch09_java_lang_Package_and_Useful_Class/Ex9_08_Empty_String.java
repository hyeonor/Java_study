package ch09_java_lang_Package_and_Useful_Class;

/*
빈 문자열(empty string)
- 내용이 없는 문자열, 크기가 0인 char형 배열을 저장하는 문자열
- 크기가 0인 배열은 어느 타입이나 생성 가능
 */

class Ex9_08_Empty_String {
    public static void main(String[] args) {
        // 길이가 0인 char 배열을 생성한다.
        char[] cArr = new char[0];    // char[] cArr = {};와 같다.
        String s = new String(cArr);  // String s = new String("");와 같다.

        System.out.println("cArr.length=" + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
