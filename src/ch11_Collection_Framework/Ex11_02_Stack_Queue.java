package ch11_Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
스택(Stack)
- LIFO 구조. 마지막에 저장된 것을 제일 먼저 꺼내게 된다.
  ex) 수식 계산, 수식 괄호 검사, undo/redo, 뒤로/앞으로(웹브라우저)

큐(Queue)
- FIFO 구조. 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다.
  ex) 최근 사용 문서, 인쇄 작업 대기목록, 버퍼(buffer)
 */

class Ex11_02_Stack_Queue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();    // Queue인터페이스의 구현체인 LinkedList를 사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력
        }

        System.out.println("= Queue =");
        while (!q.isEmpty()) {
            System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내서 출력
        }
    }
}
