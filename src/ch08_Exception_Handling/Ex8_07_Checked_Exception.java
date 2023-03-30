package ch08_Exception_Handling;

/*
checked 예외: 컴파일러가 예외 처리 여부를 체크(예외 처리 필수)
unchecked 예외: 컴파일러가 예외 처리 여부를 체크 안 함(예외 처리 선택)
 */

class Ex8_07_Checked_Exception {
    public static void main(String[] args) {
        // 컴파일 에러
        // checked 예외(Exception과 그 자손), 예외 처리 필수
        // Exception과 그 자손은 반드시 예외 처리를 해줘야 한다. (필수)
//        throw new Exception();		// Exception을 고의로 발생시킨다.

        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 처리 완료");
        }
    }
}
