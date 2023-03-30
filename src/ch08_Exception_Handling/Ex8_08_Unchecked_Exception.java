package ch08_Exception_Handling;

/*
checked 예외: 컴파일러가 예외 처리 여부를 체크(예외 처리 필수)
unchecked 예외: 컴파일러가 예외 처리 여부를 체크 안 함(예외 처리 선택)
 */

class Ex8_08_Unchecked_Exception {
    public static void main(String[] args) {
        // 컴파일 OK
        // unchecked 예외, 예외 처리 선택
        // RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다. (선택)
        throw new RuntimeException();    // RuntimeException을 고의로 발생시킨다.
    }
}
