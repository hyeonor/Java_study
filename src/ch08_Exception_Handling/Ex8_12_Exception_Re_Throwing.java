package ch08_Exception_Handling;

/*
예외 되던지기(exception_re_throwing)
- 예외를 처리한 후에 다시 예외를 발생시키는 것
- 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것
 */

class Ex8_12_Exception_Re_Throwing {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다."); // 2. 예외 처리
        }
    }    // main메서드의 끝

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다."); // 1. 예외 처리
            throw e; // 다시 예외를 발생시킨다.
        }
    }    // method1메서드의 끝
}
