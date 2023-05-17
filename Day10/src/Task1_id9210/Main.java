package Task1_id9210;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> objects = new MyList<>();
        int a = 100;
        objects.add(15);
        objects.add(30);
        objects.add(40);
        objects.add(a);
        System.out.println(objects.get(3));
    }
}
