package rozdzial7;

class A {
    int izm = 7;
    void m1() {
        System.out.print("A - m1, ");
    }
    void m2() {
        System.out.print("A - m2, ");
    }
    void m3() {
        System.out.print("A - m3, ");
    }
}
class B extends A {
    void m1() {
        System.out.print("B - m1, ");
    }
}
class C extends B {
    void m3() {
        System.out.print("C - m3, " + (izm + 6));
    }
}
public class PomieszaneKomunikaty7 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        a.m1(); //tu wstawiamy wersje kodu
        b.m2(); //
        c.m3(); //
    }
}

//wersje kodu i dopasowane wyniki:
//b.m1(); c.m2(); a.m3(); -> B - m1, A - m2, A - m3,
//c.m1(); c.m2(); c.m3(); -> B - m1, A - m2, C - m3, 13
//a.m1(); b.m2(); c.m3(); -> A - m1, A - m2, C - m3, 13
//do dokonczenia


