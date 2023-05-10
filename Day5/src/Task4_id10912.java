public class Task4_id10912 {
    public static void main(String[] args) {
        Student4 student1 = new Student4();
        Student4 student2 = new Student4();
        student2.setName("Long");
        student2.setClassName("C03");
    }
}

class Student4 {
    private String name = "John";
    private String className = "C02";

    public Student4() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
