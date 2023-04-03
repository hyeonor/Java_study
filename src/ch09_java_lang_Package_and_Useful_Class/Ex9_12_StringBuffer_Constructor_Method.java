package ch09_java_lang_Package_and_Useful_Class;

/*
StringBuffer의 생성자
- 배열 길이 변경 불가, 공간이 부족하면 새로운 배열 생성
- 저장될 문자열의 길이를 고려해서 적절한 크기를 지정
- 크기를 지정하지 않으면 16개의 문자를 지정할 수 있는 크기의 버퍼를 생성
 */

class Ex9_12_StringBuffer_Constructor_Method {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb =" + sb);    // sb =0123456789.0
        System.out.println("sb2=" + sb2);   // sb2=0123456789.0
        System.out.println("sb3=" + sb3);   // sb3=0123456789.0

        System.out.println("sb =" + sb.deleteCharAt(10));                  // sb =01234567890
        System.out.println("sb =" + sb.delete(3, 6));                            // sb =01267890
        System.out.println("sb =" + sb.insert(3, "abc"));              // sb =012abc67890
        System.out.println("sb =" + sb.replace(6, sb.length(), "END")); // sb =012abcEND

        System.out.println("capacity=" + sb.capacity()); // capacity=18
        System.out.println("length=" + sb.length());     // length=9
    }
}
