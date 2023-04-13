package ch11_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

/*
ArrayList
- ArrayList는 기존의 Vector를 개선한 것으로, 구현원리와 기능적으로 동일
- Vector는 자체적으로 동기화 처리가 되어 있으나 ArrayList는 그렇지 않다.
- List인터페이스를 구현하므로, 저장 순서가 유지되고 중복을 허용한다.
- 데이터의 저장공간으로 배열을 사용한다. (배열기반)

 */
class Ex11_01_ArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));

        print(list1, list2);

        Collections.sort(list1);    // list1과 list2를 정렬한다.
        Collections.sort(list2);    // Collections.sort(List l)
        print(list1, list2);

        // list2의 모든 요소를 list1이 포함 하고 있는지
        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1");
        System.out.println("index: " + list1.indexOf("1")); //index: 0
        System.out.println("index: " + list1.indexOf(1));   //index: 2

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));

        print(list1, list2);

        //  list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    } // main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();
    }
} // class
