package ch08_Exception_Handling;

/*
1. try 블럭 내에서 예외가 발생한 경우,
    1). 발생한 예외와 일치하는 catch 블럭이 있는지 확인한다.
    2). 일치하는 catch 블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고
        전체 try-catch 문을 빠져나가서 그 다음 문장을 계속해서 수행한다.
        만일 일치하는 catch 블럭을 찾지 못하면, 예외 처리되지 못한다.

2. try 블럭 내에서 예외가 발생하지 않은 경우,
    1). catch 블럭을 거치지 않고 전체 try-catch 문을 빠져나가서 수행을 계속한다.
 */

class Ex8_01_try_catch { // 예외가 발생하지 않았을 때, 2번의 경우
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);// 실행되지 않음
        } // try-catch의 끝
        System.out.println(5);
    } // main 메서드의 끝
}
