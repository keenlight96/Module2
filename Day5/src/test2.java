public class test2 {
    public static void main(String[] args) {
        A aa = new A();
        aa.methodA();
    }

}



class B2 {
    A2 a;
    public B2(A2 a) {
        this.a = a;
    }
    void methodB2() {
        System.out.println("Method B2");
    }
}
