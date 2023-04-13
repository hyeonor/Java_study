package ch11_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

/*
Iterator
- 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
- 컬렉션에 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
- Iterator는 1회용이라 다 쓰고 나면 다시 얻어와야 한다.
 */

class Ex11_05_Iterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
