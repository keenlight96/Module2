public class test {
    public static void main(String[] args) {
        A aa = new A();
        aa.methodA();
    }

}

class A {
    B b = new B();
    void methodA() {
        System.out.println("Method A");
    }
}

class B {
    A a = new A();
    void methodB() {
        System.out.println("Method B");
    }
}
