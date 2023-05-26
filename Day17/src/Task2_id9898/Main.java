package Task2_id9898;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Tốt", "Hà Nội"));
        students.add(new Student(2,"Long", "Hà Nội"));
        copyStudent(students, new File("src/Task2_id9898/target.txt"));

        readStudent(new File("src/Task2_id9898/target.txt"));
    }

    public static void copyStudent(List<Student> students, File destination) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(destination);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(students);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void readStudent(File source) {
        List<Student> students = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(source);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            students = (List<Student>) objectInputStream.readObject();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        for (Student e :
                students) {
            System.out.println(e);
        }
    }
}
