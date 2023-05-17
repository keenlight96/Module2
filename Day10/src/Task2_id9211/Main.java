package Task2_id9211;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(14);
        list.addFirst("123");
        list.addFirst("Long");
        list.addFirst(true);
        list.addFirst(100);

        list.printList();
    }
}
