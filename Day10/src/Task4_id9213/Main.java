package Task4_id9213;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>(14);
        list.addFirst(12);
        list.addLast(100);
        list.addLast(100);
        list.addLast(100);
        list.addLast(324);
        list.addLast(500);
        list.addLast(1000);
        list.add(2, 50);

        System.out.println(list);

        MyLinkedList<String> list2 = new MyLinkedList<>("Long");
        list2.addLast("12141");
        list2.addLast("12141");
        list2.addLast("12141");
        list2.addLast("9");
        list2.addLast("9");

        System.out.println(list2.remove("12141"));
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.contains("9"));
    }
}
