package ch11_Collection_Framework;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
TreeSet()
- 범위 검색과 정렬에 유리
- 링크드 리스트처럼 각 요소(node)가 나무(tree) 형태로 연결된 구조
- 이진트리는 모든 노드가 최대 두 개의 하위 노드를 가짐(부모 - 자식 관계)
 */

class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();
        Set setTest = new TreeSet(new TestComp()); // 비교기준이 필요
        Set setTest2 = new TreeSet();// 비교기준이 필요

        setTest.add(new Test());
        setTest2.add(new Test2());


        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);  // set.add(new Integer(num));
        }

        System.out.println(set);
    }
}

class Test {
}

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}

class Test2 implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 1;
    }
}