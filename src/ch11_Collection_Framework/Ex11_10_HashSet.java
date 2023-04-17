package ch11_Collection_Framework;

import java.util.*;

class Ex11_10_HashSet {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        // Set은 순서 유지가 되지 않기 때문에 정렬 불가
        // 1. Set의 모든 요소를 List에 저장
        // 2. list 정렬
        // 3. list 출력
        List list = new LinkedList(set); // LinkedList(Collection c)
        Collections.sort(list);          // Collections.sort(List list)
        System.out.println(list);
    }
}
