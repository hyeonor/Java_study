package ch09_java_lang_Package_and_Useful_Class;

/*
Object 클래스의 메서드 - hashCode()
- 객체의 해시코드를 반환하는 메서드
- Object 클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
- equals(), hashCode() 같이 오버라이딩해야 한다
- equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문
 */

class Ex9_03_hashCode {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
