package Task3_id9212;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(100);
        list.add(200);
        list.add(341);
        list.add(41241);
        list.add(21200);

        list.remove(3);
        System.out.println(list);
    }
}
