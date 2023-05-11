class Faculty extends Employee {
    public Faculty(String b, int bb) {
        super(b, bb);
        System.out.println("Faculty performing its tasks");
    }

    public static void main(String[] args) {

        Faculty test = new Faculty("testing", 3);
    }
}

class Employee extends Person {
    String a;
    public Employee() {
        this("Employee overloading its tasks", 3);
        System.out.println("Employee performing its tasks!");
    }

    public Employee(String s, int b) {
        super(b);
        this.a = s;
        System.out.println(s);
    }
}

class Person {
    public Person(int b) {
        System.out.println("Person performing its tasks!");
    }
}