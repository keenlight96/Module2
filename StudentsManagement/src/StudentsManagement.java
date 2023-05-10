import java.util.Scanner;

public class StudentsManagement {
    Student[] students = new Student[0];
    Scanner sc = new Scanner(System.in);

    public void show() {
        for (Student s : students) {
            System.out.printf("ID: %-3d Name: %-10s Age: %-3d%n", s.getId(), s.getName(), s.getAge());
        }
        System.out.println();
    }

    public void add() {
        int id;
        boolean chk;
        do {
            System.out.print("Input new ID: ");
            id = Integer.parseInt(sc.nextLine());
            chk = true;
            for (Student i : students) {
                if (id == i.getId()) {
                    System.out.print("Error (ID existed). ");
                    chk = false;
                    break;
                }
            }
        } while (!chk);

        System.out.print("Input new Name: ");
        String name = sc.nextLine();
        System.out.print("Input new Age: ");
        int age = Integer.parseInt(sc.nextLine());

        Student student = new Student(id, name, age);

        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = student;

        students = newStudents;
    }

    public void adjust() {
        int id;
        int idx = 0;
        boolean chk;
        do {
            System.out.print("Input ID: ");
            id = Integer.parseInt(sc.nextLine());
            chk = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == id) {
                    chk = true;
                    idx = i;
                    break;
                }
            }
            if (!chk)
                System.out.print("Error (ID not found). ");
        } while (!chk);

        System.out.print("Input new Name: ");
        students[idx].setName(sc.nextLine());
        System.out.print("Input new Age: ");
        students[idx].setAge(Integer.parseInt(sc.nextLine()));
    }

    public void remove() {
        int id;
        int idx = 0;
        boolean chk;
        do {
            System.out.print("Input ID: ");
            id = Integer.parseInt(sc.nextLine());
            chk = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == id) {
                    chk = true;
                    idx = i;
                    break;
                }
            }
            if (!chk)
                System.out.print("Error (ID not found). ");
        } while (!chk);

        Student[] newStudents = new Student[students.length - 1];
        for (int i = 0; i < newStudents.length; i++) {
            if (i < idx)
                newStudents[i] = students[i];
            else
                newStudents[i] = students[i+1];
        }

        students = newStudents;
    }
}
