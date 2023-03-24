package ch07_Object_Oriented_Programming2.Test04_Access_Modifier;

/*
private     같은 클래스에서만 접근이 가능
(default)   같은 패키지 내에서만 접근이 가능
protected   같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능
public      접근 제한이 전혀 없다.

제어자         같은 클래스          같은 패키지          자손 클래스          전체
public           ○                  ○                  ○               ○
protected        ○                  ○                  ○
(default)        ○                  ○
private          ○

클래스: public, (default)
멤버변수: public, protected, (default), private
 */

public class Parent { // 접근제어자가  public
    private int prv;    // 같은 클래스
    int dft;            // 같은 패키지
    protected int prt;  // 같은 패티지 + 자손(다른 패키지)
    public int pub;     // 접근 제한 없음

    public void printMembers() {
        System.out.println(prv); // OK
        System.out.println(dft); // OK
        System.out.println(prt); // OK
        System.out.println(pub); // OK
    }
}

class ParentTest { // 접근제어자가 (default)
    public static void main(String[] args) {
        Parent p = new Parent();

//        System.out.println(p.prv); // 에러
        System.out.println(p.dft); // OK
        System.out.println(p.prt); // OK
        System.out.println(p.pub); // OK
    }
}
