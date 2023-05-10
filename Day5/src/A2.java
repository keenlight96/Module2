class A2 {
    B2 b;
    public A2(){
        b = new B2(this);
    }
    void methodA2() {
        System.out.println("Method A2");
    }
}
