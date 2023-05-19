package Task2_id9807;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Long", 27, "Hà Nội");
        Student student2 = new Student("Toàn", 25, "Quảng Ninh");
        Student student3 = new Student("Thoại", 29, "Hưng Yên");

        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student3);

        System.out.println(hashMap);

        // Set
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student s :
                students) {
            System.out.println(s);
        }
    }
}
