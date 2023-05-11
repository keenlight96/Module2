public class test2 {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.a1(5, 3);

        def obj2 = new def();
        obj2.test();
        obj2.a1(10);
        System.out.println(def.a);
        System.out.println(obj.a + "  " + obj.b);
    }
}

class abc {
    static int a = 5;
    int b;

    void a1(int a) {
        this.a = a;
        System.out.println("a1  " + abc.a);
    }

    public void a1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a1-2   " + abc.a + "  " + this.b);
    }

    {
        b = 10;
    }
}

class def extends abc {
    static int a;
    void test() {
        System.out.println(a + "   " + b);
    }

    @Override
    void a1(int a) {
        this.a = a;
        System.out.println("overriding method: a = " + this.a);
        System.out.println(abc.a);
    }

    {
        a = 7;
    }
}
