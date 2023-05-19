package Task3_id9808;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Long", 27, "Hà Nội");
        Student student2 = new Student("Toàn", 25, "Quảng Ninh");
        Student student3 = new Student("Thoại", 29, "Hưng Yên");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for (Student s :
                list) {
            System.out.println(s);
        }

        // Sort by name
        System.out.println("Sorted by name");
        Collections.sort(list);
        for (Student s :
                list) {
            System.out.println(s);
        }

        // Sort by age
        System.out.println("Sorted by age");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        for (Student s :
                list) {
            System.out.println(s);
        }
    }
}
