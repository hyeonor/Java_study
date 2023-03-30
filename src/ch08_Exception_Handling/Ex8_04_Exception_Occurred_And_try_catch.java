package ch08_Exception_Handling;

/*
예외의 발생과 catch 블럭
- 예외가 발생하면, 이를 처리할 catch 블럭을 찾아 내려감
- 일치하는 catch 블럭이 없으면, 예외는 처리 안됨
- Exception이 선언된 catch 블럭은 모든 예외 처리(마지막 catch 블럭)
 */

class Ex8_04_Exception_Occurred_And_try_catch {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);    // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) { // 모든 예외의 최고 조상이라서 모든 예외 처리 가능
            System.out.println("Exception");
        } // try-catch의 끝
        System.out.println(6);
    } // main 메서드의 끝
}