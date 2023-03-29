package ch08_Exception_Handling;

/*
printStackTrace(): 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와
                   예외 메세지를 화면에 출력한다
getMessage():      발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
 */

class Ex8_5_printStackTrace_getMessage {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0); // 예외발생!!!
            System.out.println(4);     // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외메시지 : " + ae.getMessage());
        }    // try-catch의 끝

        System.out.println(6);
    }    // main메서드의 끝
}
