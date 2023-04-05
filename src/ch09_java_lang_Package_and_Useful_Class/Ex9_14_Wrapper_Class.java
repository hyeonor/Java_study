package ch09_java_lang_Package_and_Useful_Class;

/*
래퍼(wrapper) 클래스
- 기본형 값도 객체로 다뤄져야 할 때가 있어 기본형을 클래스로 정의한 것
 */

class Ex9_14_Wrapper_Class {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? " + (i == i2)); // 주소 비교
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2)=" + i.compareTo(i2)); // 같으면 0, 오른쪽이 작으면 1, 오른쪽이 크면 -1
        System.out.println("i.toString()=" + i.toString());

        System.out.println("MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("SIZE=" + Integer.SIZE + " bits");
        System.out.println("BYTES=" + Integer.BYTES + " bytes");
        System.out.println("TYPE=" + Integer.TYPE);
    }
}
