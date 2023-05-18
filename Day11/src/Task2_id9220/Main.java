package Task2_id9220;

public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue<Integer> listInt = new MyLinkedListQueue<>();
        listInt.enqueue(21);
        listInt.enqueue(34);
        listInt.enqueue(5325);
        listInt.enqueue(23423);
        System.out.println(listInt.dequeue().key);
        System.out.println(listInt.dequeue().key);
        System.out.println(listInt);
        System.out.println(listInt.head.key);
        System.out.println(listInt.tail.key);
    }
}
