package ch07_Object_Oriented_Programming2.Test05_Access_Modifier;

import ch07_Object_Oriented_Programming2.Test04_Access_Modifier.Parent;

class Child extends Parent {
    public void printMembers() {
//        System.out.println(prv); // 에러
//        System.out.println(dft); // 에러
        System.out.println(prt); // OK
        System.out.println(pub); // OK
    }
}

public class ParentTest2 {
    public static void main(String[] args) {
        Parent p = new Parent();

//        System.out.println(p.prv); // 에러
//        System.out.println(p.dft); // 에러
//        System.out.println(p.prt); // 에러
        System.out.println(p.pub); // OK
    }
}
