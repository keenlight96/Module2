public class Task1_id9160 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rubick");
        s1.display();

        Student.change();

        Student s2 = new Student(2, "Long");
        Student s3 = new Student(3, "Sky");

        s2.display();
        s3.display();
    }
}

class Student {
    private int rollno;
    private String name;
    private static String college = "first";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "CodeGym";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
