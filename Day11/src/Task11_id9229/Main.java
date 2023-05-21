package Task11_id9229;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Person[] list = new Person[5];
        list[0] = new Person("Rubick", true, "20/11/1996");
        list[3] = new Person("PA", false, "15/10/1994");
        list[1] = new Person("Zeus", true, "31/12/1997");
        list[2] = new Person("Medusa", false, "1/5/1992");
        list[4] = new Person("Spectre", false, "20/11/1996");

        Queue<Person> female = new LinkedList<>();
        Queue<Person> male = new LinkedList<>();
        for (Person e : list) {
            if (e.isGender())
                male.add(e);
            else
                female.add(e);
        }

        while (!female.isEmpty()) {
            System.out.println(female.remove());
        }

        while (!male.isEmpty()){
            System.out.println(male.remove());
        }
    }
}
