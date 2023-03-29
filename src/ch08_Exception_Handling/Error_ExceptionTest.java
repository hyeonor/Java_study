package ch08_Exception_Handling;

/*
프로그램 오류
- 컴파일 에러(compiler-time error): 컴파일할 때 발생하는 에러
- 런타임 에러(runtime error): 실행할 때 발생하는 에러
- 논리적 에러(logical error): 작성 의도와 다르게 동작

Java의 런타임 에러
- 에러(error)     프로그램 코드에 의해서 수습될 수 없는 심각한 오류
- 예외(exception) 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

예외처리(exception handling)의 정의와 목적
정의: 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
목적: 예외의 발생으로 인한 실행 중인 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것

Exception 클래스들은
주로 외부의 영향으로 발생할 수 있는 것들로서,
프로그램의 사용자들의 동작에 의해서 발생하는 경우가 많습니다.(예외처리 필수)

ex) 존재하지 않는 파일의 이름을 입력 클래스의 이름을 잘못 입력 입력한 데이터 형식이 잘못됨

RuntimeException
클래스들은 주로 프로그래머의 실수에 의해서
발생될 수 있는 예외들로 자바의 프로그래밍 요소들과 관계가 깊습니다.(예외처리 선택)

ex) 값이 null인 참조변수의 멤버를 호출 클래스 간 형변환을 잘못함 정수를 0으로 나눔
 */

public class Error_ExceptionTest {
    public static void main(String[] args) {
//        system.out.println("컴파일");// 컴파일 에러
        System.out.println(args[0]);// 런타임 에러
    }
}
